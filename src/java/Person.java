package java;

/**
 * Created with IntelliJ IDEA.
 * User: zhangchen
 * Date: 2014/3/28
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    public static final String MALE = "女";
    public static final String FEMALE = "男";
    String firstName;
    String lastName;
    Integer age;
    String sex;
    Person() {}
    Person(String firstName, String lastName, Integer age, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
