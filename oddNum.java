import java.util.Scanner;
public class oddNum{

    public static void main(String[] args) {
        
        int num , toplam = 0 ;

        Scanner imp=new Scanner(System.in);

        num=imp.nextInt();

            while( num %2 ==0){

                num=imp.nextInt();

                    if ( num %4==0){

                        toplam += num;
                    }


            }
            System.out.println( "4'ün katı girdiler toplamı:" + toplam );
    }
}