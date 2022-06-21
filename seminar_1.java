import java.io.FileWriter;
import java.io.IOException;
public class seminar_1 {
    public static void main(Srting[] args){
        System.out.println(powerNumbers(a:5,b:-3));

    }
    public static double powerNumbers (double a, double b){
        double res = 1;
        if (b == 0) {
            return 1;
        }
        if(b == 1) {
            return a;
        }
        if (b>0) {
           for (int i = 1; i <= b; i++) {
               res *= a;
            }
            return res;
        }else {
            for (int i = -1; i >=b; i--) {
                res/=a;
                
            }
            return res;
        
        }
    }
    public static void writeToFile(double res) {
        try (FileWriter fw = new FileWriter(fileName: "output.txt", append: false)) {
            fw.write(Double.toString(res));
            fw.append(c:'\n');
            fw.flush();
        }catch (IOException ex) {
           ex.printStackTrace();
        }

    }
       
}
   
























