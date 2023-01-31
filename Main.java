import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner console=new Scanner(System.in);
        Calculator  calculator=new Calculator();
        System.out.println("Ներմուծեք առաջին տարրը");
        double arajinTarr = console.nextDouble();
        double patasxan = arajinTarr;
        int gorcoxutyun;
        do {
            System.out.println("Ներմուծեք գործողությունը");
            System.out.println("0֊STOP");
            System.out.println("1֊գումարում");
            System.out.println("2֊հանում");
            System.out.println("3֊բազմապատկում");
            System.out.println("4֊բաժանում");

            gorcoxutyun = console.nextInt();
            System.out.println("Ներմուծեք մյուս տարրը");
            double erkrordTarr = console.nextDouble();

            switch (gorcoxutyun) {
                case 0:
                    System.out.println("ավարտ");
                    break;
                case 1:
                    patasxan =calculator.add(patasxan,erkrordTarr);
                    break;
                case 2:
                    patasxan =calculator.subtract(patasxan,erkrordTarr);
                    break;
                case 3:
                    patasxan =calculator.multiply(patasxan,erkrordTarr);
                    break;
                case 4:
                    patasxan =calculator.div(patasxan,erkrordTarr);
                    break;
                default:
                    System.out.println("Փորձեք ևս մեկ անգամ");
            }
            System.out.print("Պատասխանը=");
            System.out.println(patasxan);

        }
        while( gorcoxutyun!=0);



    }
}
