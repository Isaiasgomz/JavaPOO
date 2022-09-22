public class Doctor {
    int id;
    String name;
    String specility;

    Doctor(String name){
        System.out.println("Utilizando el method constructor");
        this.name = name;

    }
    public void showName(){
        System.out.println(name);
    }
}
