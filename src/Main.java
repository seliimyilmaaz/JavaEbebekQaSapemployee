public class Main {

    public static void main(String args[]){
        Employee kaan = new Employee("Kaan", 1700, 45, 2015);
        Employee selim = new Employee("Selim", 2500, 40, 2000);
        Employee onur = new Employee("Onur", 1500, 46, 1990);
        Employee seher = new Employee("Seher", 750, 45, 1995);
        Employee cansu = new Employee("Cansu", 10000, 42, 2021);
        System.out.println(kaan.toString());
        System.out.println(selim.toString());
        System.out.println(onur.toString());
        System.out.println(seher.toString());
        System.out.println(cansu.toString());
    }
}
