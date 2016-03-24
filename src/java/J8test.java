package java;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
* Created with IntelliJ IDEA.
* User: zhangchen
* Date: 14-3-27
* Time: 下午1:46
* To change this template use File | Settings | File Templates.
*/
public class J8test {

    public static void main(String[] args) {
        String[] nums = {"0","1","2","2"};
//        distinctPrimary(nums);
    }

    public void compare() {
//        Predicate<String> predicate = (s) -> s.length() > 0;
//        System.out.println(predicate.test("foo"));
//        System.out.println(predicate.negate().test("foo"));

//        Predicate<Boolean> nonNull = Objects::nonNull;
//        System.out.println(nonNull.test(null));

//        Comparator<java.Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
//        java.Person p1 = new java.Person("cherry","chen");
//        java.Person p2 = new java.Person("zhang","qing");
//        System.out.println(comparator.compare(p1, p2));
    }

//    public static void distinctPrimary(String[] nums) {
//        List<String> l = Arrays.asList(nums);
//        List<Integer> r = l.stream()
//                .map(e -> new Integer(e))
////                .filter(e -> Primes.isPrime(e))  //没有这个Primes啊？
//                .distinct()
////                .collect(Collectors.toList())
//                .collect(Collectors.groupingBy(p -> p, Collectors.summingInt(p->1)));
//        System.out.println("distinctPrimary result is: " + r);
//    }

//    public void boysAndGirls(List<java.Person> persons) {
//        Map<Integer, Integer> result = persons.parallelStream().filter(p -> p.getAge()>=25 && p.getAge()<=35).
//                collect(
//                        Collectors.groupingBy(p -> p.getSex(), Collectors.summingInt(p -> 1))
//                );
//        System.out.print("boysAndGirls result is " + result);
//        System.out.println(", ratio (male : female) is " + (float)result.get(java.Person.MALE)/result.get(java.Person.FEMALE));
//    }
}
