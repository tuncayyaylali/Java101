package ONS;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    void print(){
        System.out.printf("%-15s %s %s\n" , "Öğretmen", ":", this.name);
        System.out.printf("%-15s %s %s\n" , "Telefonu", ":", this.mpno);
        System.out.printf("%-15s %s %s\n" , "Bölümü", ":", this.branch);
        System.out.println();
    }
}
