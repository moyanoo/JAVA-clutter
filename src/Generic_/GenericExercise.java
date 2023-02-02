//package Generic_;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//
///**
// * @author haohao
// * @version 1.0
// */
//@SuppressWarnings({"all"})
////public class GenericExercise {
//    public static void main(String[] args) {
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("poi",8000,new MyDate01(1936,5,21)));
//        employees.add(new Employee("pop",9000,new MyDate01(1952,8,24)));
//        employees.add(new Employee("poo",7000,new MyDate01(1943,9,16)));
//        System.out.println(employees);
//        employees.sort
////        Arrays.sort(employees,
////                new Comparator<Employee>() {
////                    public int compare(Employee emp1,Employee emp2){
//                        if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
//                            System.out.println("类型不对");
//                            return 0;
//                        }
//                        int i=emp1.getName().compareTo(emp2.getName());
//                        if(i!=0){
//                            return i;
//                        }
//                        int year= (int) (emp1.getBirthday().getYear()-emp2.getBirthday().getYear());
//                        if (year!=0){
//                            return year;
//                        }
//                        int Month= (int) (emp1.getBirthday().getMonth()-emp2.getBirthday().getMonth());
//                        if (Month!=0){
//                            return Month;
//                        }
//                        return (int) (emp1.getBirthday().getDay()-emp2.getBirthday().getDay());
//                    }
//                });
//        System.out.println(employees);
//    }
//}
//class Employee{
//    private String name;
//    private double sal;
//    private MyDate01 birthday;
//
//    public Employee(String name, double sal, MyDate01 birthday) {
//        this.name = name;
//        this.sal = sal;
//        this.birthday = birthday;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSal() {
//        return sal;
//    }
//
//    public void setSal(double sal) {
//        this.sal = sal;
//    }
//
//    public MyDate01 getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(MyDate01 birthday) {
//        this.birthday = birthday;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", sal=" + sal +
//                ", birthday=" + birthday +
//                '}';
//    }
//}
//class MyDate01 implements Comparable<MyDate01>{
//    private int year;
//    private int month;
//    private int day;
//
//    public MyDate01(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public double getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public double getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public double getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    @Override
//    public String toString() {
//        return "MyDate01{" +
//                "year=" + year +
//                ", month=" + month +
//                ", day=" + day +
//                '}';
//    }
//
//    @Override
//    public int compareTo(MyDate01 o) {
//        return 0;
//    }
//}
