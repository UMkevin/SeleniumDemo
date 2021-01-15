/**
 * @ClassName ForTest
 * @Description ForTest
 * @Author Kevin Ge
 * @Date 2020/6/24 16:24
 * @Version 1.0
 */
public class ForTest {

    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
