public class Main implements Comparable<Main> {
public int age;
public String name;
    Main(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Main o) {
        if (this.age>o.age) return 1;
        else if (this.age>o.age) return 1;
        else return -1;
    }

    public static void main(String[] args) {
        Main main1 = new Main(17,"Mariya");
        Main main2 = new Main(18, "Darya");
        System.out.println(main1.compareTo(main2));
    }
}