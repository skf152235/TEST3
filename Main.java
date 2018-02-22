public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("シロ",3);
        Dog dog2 = new Dog("ホワイト");


    }
}
class Dog{
    private String name;
    private int age;
    public Dog(String n,int a){
        name = n;
        age = a;
        System.out.println("犬の名前は"+name+"です｡" + "年齢は"+age+"歳です｡");
    }
    public Dog(String n){
        name = n;
        System.out.println("犬の名前は"+name+"です｡" + "年齢はわかりませんでした｡");
        System.out.println("犬の名前は"+name+"です｡" + "年齢はわかりませんでした｡");
    }
}
