package java;

/**
 * Created with IntelliJ IDEA.
 * User: cherry
 * Date: 13-4-9
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class Book implements Books {
    public Book() {
        addBook();
    }

    public String addBook() {
        String str = "---addBook---";
        System.out.println(str);
        return str;
    }
}
