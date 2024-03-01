package task5;

public class Main {
    public static void main(String... args) {
        MySingleton mySingleton = MySingleton.getMySingleTon();
        MySingleton mySingleton1 = MySingleton.getMySingleTon();
        System.out.println(mySingleton == mySingleton1);

        MySingleton mySingleton2 = MySingleton.getInstance();
        MySingleton mySingleton3 = MySingleton.getInstance();
        System.out.println(mySingleton3 == mySingleton2);

        MySingleton.EnumSingle enumSingle = MySingleton.EnumSingle.INSTANCE;
        MySingleton.EnumSingle enumSingle1 = MySingleton.EnumSingle.INSTANCE;
        System.out.println(enumSingle1 == enumSingle);
    }
}
