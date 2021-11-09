import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("İlk sayıyı girin: ");
        a= scn.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        b=scn.nextInt();
        System.out.println("Üçüncü sayıyı girin: ");
        c= scn.nextInt();
        if (a>b && a>c && b>c){
            System.out.print("Sıralama: " +c+ " " +b+ " " +a);
        }else if(a>b && c>b && a>c){
            System.out.println("Sıralama: " +b+" "+c+" "+a );}
        else if(b>a && b>c && a>c){
            System.out.print("Sıralama: " +c+" " +a+ " " +b);
        }else if(b>a && b>c && c>a){
            System.out.println("Sıralama: " +a+ " " +c+ " " +b);
        }else if(c>a && a>b && c>b){
            System.out.println("Sıralama: " +b+ " " +a+ " " +c);
        }else if(c>a && c>b && b>a){
            System.out.println("Sıralama: " +a+ " " +b+ " " +c);
        }
    }
}
