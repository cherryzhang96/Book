package java;

/**
 * Created with IntelliJ IDEA.
 * User: cherry
 * Date: 13-4-9
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
public class NewsPaper implements Books {
    public NewsPaper() {
        addBook();
    }

    public String addBook() {
        String str = "---addNewsPaper---";
        System.out.println(str);
        return str;
    }
}
