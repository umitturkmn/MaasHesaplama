public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonusResult=0,result=0;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(int x) {
        if (this.salary >= 1000) {
            return (salary * 3) / 100;
        } else {
            return 0;
        }
    }

    int bonus(int x) {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    int raiseSalary(int x){
        if((2022-this.hireYear) > 19){
            return (this.salary*15)/100;
        }
        if ((2022-this.hireYear) > 9 && (2022-this.hireYear) < 20){
            return (this.salary*10)/100;
        }
        if ((2022-this.hireYear) <= 9){
            return (this.salary*5)/100;
        }
        return 0;
    }
    public void toString(Employee emp){
        bonusResult = emp.salary + emp.bonus(emp.workHours) - emp.tax(emp.salary);
        result = bonusResult + emp.raiseSalary(emp.hireYear);
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("********-SONUÇLAR-**********");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("İsim Soyisim: " + emp.name);
        System.out.println("Maaş: " + emp.salary + " Türk Lirası.");
        System.out.println("Haftalık Çalışma Saati: " + emp.workHours + " saat.");
        System.out.println("İşe başlangıç yılı: " + emp.hireYear + " yılı.");
        System.out.println("Toplam Vergi: " + emp.tax(emp.salary) + " Türk Lirası.");
        System.out.println("Toplam Bonus: " + emp.bonus(emp.workHours) + " Türk Lirası.");
        System.out.println("Toplam Maaş Artışı: " + emp.raiseSalary(emp.hireYear) + " Türk Lirası.");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + bonusResult + " Türk Lirası.");
        System.out.println("Toplam Güncel Maaş: " + result + " Türk Lirası.");

    }
}
