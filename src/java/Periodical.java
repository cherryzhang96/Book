package java;

/**
 * Created with IntelliJ IDEA.
 * User: cherry
 * Date: 13-4-9
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
public class Periodical implements Books {
    public Periodical() {
        addBook();
    }

    public String addBook() {
        String str = "---addPeriodical---";
        System.out.println(str);
        return str;
    }
}
