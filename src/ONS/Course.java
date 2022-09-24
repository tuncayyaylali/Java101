package ONS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;
    double sozluEtkisi;

    Course(String name, String code, String prefix, double sozluEtkisi){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozluNote=0;
        this.sozluEtkisi=sozluEtkisi;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmamaktadır.");
        }
        this.teacher=teacher;
    }

    void printTeacher(){
        this.teacher.print();
    }
}
