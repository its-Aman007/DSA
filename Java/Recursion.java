class Recursion {
    int fact(int n){
        if (n <=1)
            return 1;
        else
            return n*fact(n-1);

    }
    public static void main(String[] args) {
        Factorial f =new Factorial();
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 5 is " + f.fact(5));
        System.out.println("Factorial of 6 is " + f.fact(6));


    }

}
