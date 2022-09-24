package ONS;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average=0;
        this.isPass=false;
    }

    void addBulkExamNote (int note1, int note2, int note3, int sozluNote1, int sozluNote2, int sozluNote3){
        if (note1>=0 && note1<=100){
            this.course1.note=note1;
        }
        if (note2>=0 && note2<=100){
            this.course2.note=note2;
        }
        if (note3>=0 && note3<=100){
            this.course3.note=note3;
        }
        if (sozluNote1>=0 && sozluNote1<=100){
            this.course1.sozluNote=sozluNote1;
        }
        if (sozluNote2>=0 && sozluNote2<=100){
            this.course2.sozluNote=sozluNote2;
        }
        if (sozluNote3>=0 && sozluNote3<=100){
            this.course3.sozluNote=sozluNote3;
        }
    }

    void printNote(){
        System.out.printf("%-15s %s %s\n" , "Adı ve Soyadı", ":", this.name);
        System.out.printf("%-15s %s %s\n" , this.course1.name + " Notu", ":", this.course1.note);
        System.out.printf("%-15s %s %s\n" , this.course2.name + " Notu", ":", this.course2.note);
        System.out.printf("%-15s %s %s\n" , this.course3.name + " Notu", ":", this.course3.note);
        System.out.printf("%-15s %s %.2f\n" , "Ortalamanız", ":", this.average);
    }

    void isPass(){
        this.average= (((this.course1.note*(1-this.course1.sozluEtkisi))+(this.course1.sozluNote*this.course1.sozluEtkisi))+
                ((this.course2.note*(1-this.course2.sozluEtkisi))+(this.course2.sozluNote*this.course2.sozluEtkisi))+
                ((this.course3.note*(1-this.course3.sozluEtkisi))+(this.course3.sozluNote*this.course3.sozluEtkisi)))/3.0;
        printNote();
        if(this.average>=50){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz.\n");
        }else{
            System.out.println("Sınıfı geçemediniz.\n");
        }
    }
}
