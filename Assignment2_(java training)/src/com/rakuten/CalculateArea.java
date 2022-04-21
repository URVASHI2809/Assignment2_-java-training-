package com.rakuten;

class CalculateArea {
        void area(float x) {
            System.out.print("The area of the square is: " + Math.pow(x, 2) + " sq units\n");
        }

        void area(float x, float y) {
            System.out.print("The area of the rectangle is: " + x * y + " sq units\n");
        }

        void area(double x) {
            double z = 3.14 * x * x;
            System.out.print("The area of the circle is: " + z + " sq units\n");
        }

        void area1(double b, double h) {
            double w = (b * h) / 2;
            System.out.print("The area of the triangle is: " + w + " sq.units\n");

        }
    }

    class Calculation {
        public static void main(String[] args) {
            com.rakuten.CalculateArea ob = new com.rakuten.CalculateArea();
            ob.area(5);
            ob.area(4, 5);
            ob.area(2.5);
            ob.area1(3, 6);
        }
    }
