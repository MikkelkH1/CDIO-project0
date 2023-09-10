class Maximum {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        scanner.close();

        int max = Math.max(Math.max(a, b), c);

        System.out.println("The max value is " + max);    

        System.out.println("first fucking comit");
    }
}
