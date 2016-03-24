import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HttpUtil {


    /**
     * 模拟浏览器保存cookie
     */
    private static String cookieValue;

    /**
     * 直接通过HTTP协议提交数据到服务器,实现表单提交功能
     * @param actionUrl  上传路径
     * @param params 请求参数 key为参数名,value为参数值
     * @param file 上传文件
     */

    /**
     * -----------------------------7da2e536604c8
     * Content-Disposition:form-data; name="username"
     * <p/>
     * hello word -----------------------------7da2e536604c8
     * Content-Disposition: form-data; name="file1"; filename="D:\haha.txt"
     * Content-Type: text/plain
     * <p/>
     * haha hahaha -----------------------------7da2e536604c8
     * Content-Disposition: form-data; name="file2"; filename="D:\huhu.txt"
     * Content-Type: text/plain
     * <p/>
     * messi huhu -----------------------------7da2e536604c8--
     */
    @SuppressWarnings("resource")
    public static String post(String actionUrl, Map<String, String> params, FormFile... files) {
        try {
            String BOUNDARY = "---------7d4a6d158c9"; // 数据分隔线
            String MULTIPART_FORM_DATA = "multipart/form-data";
            URL url = new URL(actionUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);// 允许输入
            conn.setDoOutput(true);// 允许输出
            conn.setUseCaches(false);// 不使用Cache
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Content-Type", MULTIPART_FORM_DATA + "; boundary=" + BOUNDARY);
            conn.setRequestProperty("Cookie", cookieValue);
            conn.setReadTimeout(60000);

            StringBuilder sb = new StringBuilder();
            // 上传的表单参数部分，格式请参考文章
            for (Map.Entry<String, String> entry : params.entrySet()) {// 构建表单字段内容
                sb.append("--");
                sb.append(BOUNDARY);
                sb.append("\r\n");
                sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
                sb.append(entry.getValue());
                sb.append("\r\n");
            }
            DataOutputStream outStream = new DataOutputStream(conn.getOutputStream());
            outStream.write(sb.toString().getBytes());// 发送表单字段数据


            // 上传的文件部分，格式请参考文章
            if (files != null) {
                for (FormFile file : files) {
                    StringBuilder split = new StringBuilder();
                    split.append("--");
                    split.append(BOUNDARY);
                    split.append("\r\n");
                    split.append("Content-Disposition: form-data;name=\""+ file.getFormname() + "\";filename=\"" + file.getFile().getAbsolutePath() + "\"\r\n");
                    split.append("Content-Type: " + file.getContentType()+ "\r\n\r\n");
                    outStream.write(split.toString().getBytes());
                    FileInputStream fis = new FileInputStream(file.getFile().getAbsolutePath());
                    int t = 0;
                    byte[] xml = null;
                    try {
                        if (file != null) {
                            FileInputStream fis2 = new FileInputStream(file.getFile());
                            if (fis2 != null) {
                                int len = fis.available();
                                xml = new byte[len];
                                fis2.read(xml);
                            }
                        }
                    } catch (Exception e) {
                    }
                    while ((t = fis.read(xml)) != -1) {
                        outStream.write(xml, 0, t);
                    }
                    outStream.write("\r\n".getBytes());
                }
            }
            byte[] end_data = ("--" + BOUNDARY + "--\r\n").getBytes();// 数据结束标志
            outStream.write(end_data);
            outStream.flush();
            int cah = conn.getResponseCode();
            if (cah != 200)
                throw new RuntimeException("请求url失败");
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String result = br.readLine();
            refreshCookie(conn);
            outStream.close();
            conn.disconnect();
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Description: <br>
     * 刷新本地存储的cookie信息
     *
     * @param conn
     */
    private static void refreshCookie(HttpURLConnection conn) {
        String temp = conn.getHeaderField("Set-Cookie");
        // 当发送给服务器的cookie中sessionid没有失效的时候服务器不会产生新cookie并返回
        // 当session失效的时候返回了新cookie则需要更新本地保存的cookie值
        if (temp != null && !"".equals(temp)) {
            cookieValue = temp;
        }

    }

    public static String post(String actionUrl, HashMap<String, Object> params,FormFile[] files) {
        Map<String, String> map = new HashMap<String, String>();
        Set<Map.Entry<String, Object>> set = params.entrySet();
        for (Iterator<Map.Entry<String, Object>> it = set.iterator(); it.hasNext(); ) {
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return post(actionUrl, map, files);
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title", "抓饭");
        File file = new File("1.txt");
        FormFile formFile = new FormFile(file, "file1");
        Map<String,String> m = new HashMap<String, String>();
        m.put("phone","12345678909");
        m.put("month","201312");
        post("http://localhost:8080/treasure/upload/appDetails", m,formFile);

         StringBuilder sb = new StringBuilder();
            // 上传的表单参数部分，格式请参考文章
            for (Map.Entry<String, String> entry : map.entrySet()) {// 构建表单字段内容
                sb.append("--");
                sb.append("---------7d4a6d158c9");
                sb.append("\r\n");
                sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
                sb.append(entry.getValue());
                sb.append("\r\n");
                System.out.println(sb.toString());
            }
    }

}

class FormFile {

    /* 上传文件的数据 */
    private File file;
    /* 表单字段名称 */
    private String formname;
    /* 内容类型 */
    private String contentType = "application/octet-stream"; // 需要查阅相关的资料

    public FormFile(File file, String formname) {
        this.file = file;
        this.formname = formname;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


}
