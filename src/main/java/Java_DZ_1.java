// //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

 import java.util.Random;

 public class Java_DZ_1 {

     public static void main(String[] args) {
         int i = new Random().nextInt(0, 2000);
         System.out.println("Cлучайное целое число в диапазоне от 0 до 2000 = " + i);

         int n = Integer.toBinaryString(i).length() - 1;
         System.out.println("Номер старшего значения бита выпавшего =  " + n);

         int count_max = 0;
         while (i < Short.MAX_VALUE) {
             if (i % n == 0) {
                 count_max++;
             }
             i++;
         }
         int[] m1 = new int[count_max];

         int j = 0;
         while (i < Short.MAX_VALUE) {
             if (i % n == 0) {
                 m1[j] = i;
             }
             i++;
             j++;
         }
         int count_min = 0;
         while (i < Short.MIN_VALUE) {
             if (i % n == 0) {
                 count_min++;
             }
             i++;
         }
         int[] m2 = new int[count_min];

         int k = i;
         while (i < Short.MIN_VALUE) {
             if (i % n == 0) {
                 m1[k] = i;
             }
             i--;
             j++;
         }
     }
 }

