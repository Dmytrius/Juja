package lab_11_20.lab11;

/**
 * Created by boykodm on 11.02.16.
 *
 * Реализовать функцию, которая по целочисленому аргументу c возвращает количество целочисленных решений неравенства
 *a*a + b*b <= c a > 0 b > 0
 *Например
 *lookFor(14) == 8
 *поскольку для решения подходят следующие пары значений
 *(a=1,b=1), (a=1,b=2), (a=1,b=3), (a=2,b=1), (a=2,b=2), (a=2,b=3), (a=3,b=1), (a=3,b=2)
 */
public class Test {

    public static void main(String[] args) {
        if (MathUtils.lookFor(1) != 0) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
