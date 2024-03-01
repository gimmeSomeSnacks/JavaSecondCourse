package task5;

public class MySingleton {
    //Ленивая инициализация (многопоточная)
    private static MySingleton mySingleTon;
    private void mySingleTon() {}

    public static synchronized MySingleton getMySingleTon() {
        if (mySingleTon == null) {
            mySingleTon = new MySingleton();
            return mySingleTon;
        }
        return mySingleTon;
    }

    //Enum реализация с ОДНИМ ПОЛЕМ
    public enum EnumSingle {
        INSTANCE;
        public EnumSingle getInstance() {
            return INSTANCE;
        }
    }

    //Double-Checking реализация, тоже многопоточка
    private static volatile MySingleton instance;

    public static MySingleton getInstance() {
        MySingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (MySingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new MySingleton();
                }
            }
        }
        return localInstance;
    }
}
