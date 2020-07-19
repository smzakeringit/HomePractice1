package basic;

public class LearnUseAccessModifier { // class start
// Access Modifier/ Access Specifier: where you can access and where you
//can not access
// public: From any package and any class you can take access
// private: From same class only.
// protected: From same package and any class from that package you can take access
// default: Public
// type main ====> ctrl+space button then Hit Enter    Mac: ctrl+ space button
// sout+ctrl+space button then Hit Enter    Mac: ctrl+ space button
    public int shah;
    private int shuvo;
    protected int mujahid;

    private static void display() {
        System.out.println("Display");
    }
    public static void TvDisplay() {
        System.out.println("TV Display");
// / public: From any package and any class you can take access
    }
    protected static void mobileDisplay() {
        System.out.println("This is iPhone Mobile Display");

}
    public static void main(String[] args) {
        LearnUseAccessModifier obj = new LearnUseAccessModifier();
        System.out.println();
        LearnUseAccessModifier.display();
        LearnUseAccessModifier.mobileDisplay();
        LearnUseAccessModifier.TvDisplay();
    }
} //clas ends
