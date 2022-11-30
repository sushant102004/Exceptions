class Divide {
    int divide(int a) throws Exception {
        if(a == 0) {
            throw new Exception("Can't divide by Zero");
        } else {
            return 20 / a;
        }
    }
}

class Exceptions {
    public static void main(String args[]) {
        Divide divide = new Divide();

        try {
            int result = divide.divide(0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Custom Exception

class MyCustomException extends Exception {
    String message;

    MyCustomException(String s){
        message = s;
    }

    String showErorString(){
        return message.toString();
    }
}

class ExceptionTwo {
    static void calculate(int marks) throws MyCustomException {
        if(marks > 33){
            System.out.println("Passed!");
        } else if(marks >= 0 && marks <= 32) {
            System.out.println("Fail!");
        } else {
            throw new MyCustomException("Marks Can't be negative.");
        }
    }

    public static void main(String args[]){
        try {
            calculate(-1);
        } catch (MyCustomException e){
            System.out.println(e.showErorString());
        }
    }
}