package MaasHesaplama;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        if(salary<0){
            this.salary=0;
        }else{
            this.salary=salary;
        }
        if(workHours>45){
            this.workHours=45;
        }else{
            this.workHours=workHours;
        }
        if(hireYear>2021){
            this.hireYear=2021;
        }else{
            this.hireYear=hireYear;
        }
    }

    int taxCalculate(){
        if(this.salary<1000){
            return 0;
        }else{
            return (int) (this.salary*0.03);
        }
    }

    int bonusCalculate(){
        if(this.workHours>40){
            return (this.workHours - 40)*30;
        }
        return 0;
    }

    int raiseCalculate(){
        int thisYear = 2021;
        int duration = thisYear - this.hireYear;
        if(duration<10){
            return (int) (this.salary*0.05);
        }else if(duration<20){
            return (int) (this.salary*0.1);
        }
        return (int) (this.salary*0.15);
    }

    int newSalary1(){
        return this.salary - taxCalculate() + bonusCalculate();
    }

    int newSalary2(){
        return this.salary + raiseCalculate();
    }

    void print(){
        System.out.printf("%-35s %s %s\n" , "Adı", ":", this.name);
        System.out.printf("%-35s %s %s\n" , "Maaşı", ":", this.salary);
        System.out.printf("%-35s %s %s\n" , "Çalışma Saati", ":", this.workHours);
        System.out.printf("%-35s %s %s\n" , "Başlangıç Yılı", ":", this.hireYear);
        System.out.printf("%-35s %s %s\n" , "Vergi", ":", taxCalculate());
        System.out.printf("%-35s %s %s\n" , "Bonus", ":", bonusCalculate());
        System.out.printf("%-35s %s %s\n" , "Maaş Artışı", ":", raiseCalculate());
        System.out.printf("%-35s %s %s\n" , "Vergi ve Bonuslarla Birlikte Maaş", ":", newSalary1());
        System.out.printf("%-35s %s %s\n" , "Toplam Maaş", ":", newSalary2());
    }
}
