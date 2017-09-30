import java.util.* ;
public class Main {

    public static void main(String[] args) {
        //總分及平均
        Scanner in=new Scanner(System.in);
        int C ,E ,M ,x ,y;
        C=in.nextInt();
        E=in.nextInt();
        M=in.nextInt();
        x = C+E+M;
        y = (C+E+M)/3;
        System.out.printf("%d\n%d\n",x,y);
    }
}