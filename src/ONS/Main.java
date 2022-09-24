package ONS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut ZAHMET", "+905321112233", "TRH");
        Teacher t2 = new Teacher("Graham BELL", "+905322223344", "FZK");
        Teacher t3=new Teacher("Kül YUTMAZ", "+905051112233", "BIO");
        Teacher t4=new Teacher("Barış MANÇO", "+905552223311", "MZK");

        Course tarih=new Course("Tarih", "101", "TRH", 0.2);
        Course fizik=new Course("Fizik", "102", "FZK", 0.3);
        Course biyoloji=new Course("Biyoloji", "103", "BIO", 0.4);
        Course muzik=new Course("Müzik", "104", "MZK", 0.5);

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);
        muzik.addTeacher(t4);

        t1.print();
        t2.print();
        t3.print();

        Student s1=new Student("Kemal SUNAL","01", "CEVRE1", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,50,75,10, 10, 90);
        s1.isPass();

        Student s2=new Student("Necmi GÜDÜK", "02", "İNŞAAT2", fizik, tarih, biyoloji);
        s2.addBulkExamNote(50,36,90, 100,50,30);
        s2.isPass();

        Student s3=new Student("Ali SUNAL", "03", "CEVRE2", muzik, tarih, fizik);
        s3.addBulkExamNote(68,36,45, 50,20,10);
        s3.isPass();
    }
}
