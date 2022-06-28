// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

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
   
























