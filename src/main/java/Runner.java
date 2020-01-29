import geometry2DCalculator.AreaOfCircle;
import geometry2DCalculator.AreaOfTriangle;
import geometry2DCalculator.ParallelogramArea;
import geometry3DCalculator.ConeVolume;
import geometry3DCalculator.CylinderVolume;
import geometry3DCalculator.TetrahedronVolume;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите калькулятор : ");
        System.out.println("Geometry 2D Calculator - 1");
        System.out.println("Geometry 3D Calculator - 2");
        System.out.print("Ваш ответ - ");
        int twoOrThree = sc.nextInt();
        if (twoOrThree == 1) {
            System.out.println("Вы выбрали - Geometry 2D Calculator.");
            System.out.println("Выберите что вы хотите посчитать: ");
            System.out.println("площадь треугольника - 1 ");
            System.out.println("площадь окружности - 2 ");
            System.out.println("площадь параллелограмма - 3 ");
            System.out.print("Ваш ответ - ");
            try {
                int AreaOfWhat = sc.nextInt();
                if (AreaOfWhat == 1) {

                    System.out.println("Посчитаем  площадь треугольника!");
                    System.out.print("Введите первую сторону треугольника : ");
                    double firstSide = sc.nextDouble();
                    System.out.print("Введите вторую сторону треугольника : ");
                    double secondSide = sc.nextDouble();
                    System.out.print("Введите третью сторону треугольника : ");
                    double thirdSide = sc.nextDouble();
                    AreaOfTriangle triangle = new AreaOfTriangle(firstSide, secondSide, thirdSide);
                    System.out.println("Площадь равна - " + triangle.getAreaOfTriangle());

                } else if (AreaOfWhat == 2) {

                    System.out.println("Посчитаем площадь окружности!");
                    System.out.print("Введите радиус круга : ");
                    double radius = sc.nextDouble();
                    AreaOfCircle circle = new AreaOfCircle(radius);
                    System.out.println("Площадь равна - " + circle.getAreaOfCircle());

                } else if (AreaOfWhat == 3) {

                    System.out.println("Посчитаем площадь параллелограмма!");
                    System.out.print("Введите чему равно основание : ");
                    double basis = sc.nextDouble();
                    System.out.print("Введите чему равна высота : ");
                    double height = sc.nextDouble();
                    ParallelogramArea parallelogram = new ParallelogramArea(basis, height);
                    System.out.println("Площадь равна - " + parallelogram.getParallelogramArea());

                } else if (AreaOfWhat > 3) {
                    System.out.println("Вы ввели неверное число!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вводите только числа!");

            }
        } else if (twoOrThree == 2) {
            System.out.println("Вы выбрали Geometry 3D Calculator");
            System.out.println("Выберите что нужно посчитать : ");
            System.out.println("объем конуса - 1");
            System.out.println("объем цилиндра - 2");
            System.out.println("объем тетраэдра - 3");
            System.out.print("Ваш ответ - ");

            try {
                int AreaOfWhat = sc.nextInt();
                if (AreaOfWhat == 1) {
                    System.out.println("Посчитаем объем конуса!");
                    System.out.print("Введите радиус основания : ");
                    double baseRadius = sc.nextDouble();
                    System.out.print("Введите высоту : ");
                    double height = sc.nextDouble();
                    ConeVolume cone = new ConeVolume(baseRadius, height);
                    System.out.println("Обьем равен : " + cone.getConeVolume());
                } else if (AreaOfWhat == 2) {
                    System.out.println("Посчитаем обьем цилиндра!");
                    System.out.print("Введите чему равно основание : ");
                    double basis = sc.nextDouble();
                    System.out.print("Введите чему равна высота : ");
                    double height = sc.nextDouble();
                    CylinderVolume cylinder = new CylinderVolume(basis, height);
                    System.out.println("Обьем равен : " + cylinder.getCylinderVolume());
                } else if (AreaOfWhat == 3) {
                    System.out.println("Посчитаем обьем тетраэдра!");
                    System.out.print("Введите координату Ax : ");
                    double aX = sc.nextDouble();
                    System.out.print("Введите координату Ay : ");
                    double aY = sc.nextDouble();
                    System.out.print("Введите координату Az : ");
                    double aZ = sc.nextDouble();
                    System.out.print("Введите координату Bx : ");
                    double bX = sc.nextDouble();
                    System.out.print("Введите координату By : ");
                    double bY = sc.nextDouble();
                    System.out.print("Введите координату Bz : ");
                    double bZ = sc.nextDouble();
                    System.out.print("Введите координату Cx : ");
                    double cX = sc.nextDouble();
                    System.out.print("Введите координату Cy : ");
                    double cY = sc.nextDouble();
                    System.out.print("Введите координату Cz : ");
                    double cZ = sc.nextDouble();
                    TetrahedronVolume tetrahedron = new TetrahedronVolume(aX, aY, aZ, bX, bY, bZ, cX, cY, cZ);
                    System.out.println("Обьем равен : " + tetrahedron.getTetrahedronVolume());
                } else if (AreaOfWhat > 3) {
                    System.out.println("Вы ввели неверное число!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вводите только числа!");
            }


        }


    }


}

