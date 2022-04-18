import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name; int salary,workHours,hireYear;
        System.out.println("****************************");
        System.out.println("******-MAAŞ HESAPLAMA-******");
        System.out.println("****************************");
        System.out.println("İstenilenleri giriniz!");
        System.out.print("İsim Soyisim: ");
        name = input.nextLine();
        System.out.print("Güncel Maaşınız: ");
        salary = input.nextInt();
        System.out.print("Haftalık kaç saat çalışıyorsunuz: ");
        workHours = input.nextInt();
        System.out.print("İşe başlangıç yılınız: ");
        hireYear = input.nextInt();
        Employee emp = new Employee(name,salary,workHours,hireYear);
        emp.toString(emp);
        //Ümit Türkmen

    }
}
