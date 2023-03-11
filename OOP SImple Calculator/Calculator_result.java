public class Calculator_result {

    int result;
    int x;
    int y;

    Calculator_result(int x, int y) {

        this.x = x;
        this.y = y;
        this.result = result;

        plus(x, y);
        minus(x, y);
        multiply(x, y);
        div(x, y);
    }

    void plus(int x, int y) {
        result = x + y;
        System.out.printf("Result is %d",result);
    }

    void minus(int x, int y) {
        result = x - y;
        System.out.printf("Result is %d",result);
    }

    void multiply(int x, int y) {
        result = x * y;
        System.out.printf("Result is %d",result);
    }

    void div(int x, int y) {
        result = x / y;
        System.out.printf("Result is %d",result);
    }

}
