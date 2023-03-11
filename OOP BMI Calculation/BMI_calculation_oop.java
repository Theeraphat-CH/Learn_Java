public class BMI_calculation_oop {

    /*
     * OOP Concept
     * 
     * String hello;
     * String hello2;
     * 
     * BMI_calculation_oop() {
     * show();
     * show2();
     * }
     * 
     * void show() {
     * hello = "hello";
     * System.out.println(hello);
     * }
     * 
     * void show2() {
     * hello2 = "hello2";
     * System.out.println(hello2);
     * }
     */

    // create parameters get data from BMI_oop

    double weight;
    double high;
    double BMI;

    BMI_calculation_oop(double weight, double high) {
        if (high >= 10) {
            high /= 100;
            this.BMI = weight / (high * high);
            result();
        } else {
            this.BMI = weight / (high * high);
            result();
        }
    }

    void result() {
        System.out.printf("BMI calculation is %s", this.BMI);
        System.out.println();
        if (this.BMI < 18.5) {
            System.out.print("BMI IS " + this.BMI + " Underweight\n");
        } else if (this.BMI >= 18.5 && this.BMI <= 22.9) {
            System.out.print("BMI IS " + this.BMI + " Normal\n");
        } else if (this.BMI >= 23.0 && this.BMI <= 24.9) {
            System.out.print("BMI IS " + this.BMI + " Overweight\n");
        } else if (this.BMI >= 25.0 && this.BMI <= 29.9) {
            System.out.print("BMI IS " + this.BMI + " Obesity\n");
        } else if (this.BMI >= 30) {
            System.out.print("BMI IS " + this.BMI + " Dangerous obesity\n");
        }
    }
}
