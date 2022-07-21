
    @FunctionalInterface

    interface Size {
        int calculate(String x);
    }

    class Que16 {
        public static void main(String args[])
        {
            String a = "Jhalak";

            // lambda expression to define the calculate method
            Size s = (String x) -> x.length();

            // parameter passed and return type must be
            // same as defined in the prototype
            int ans = s.calculate(a);
            System.out.println(ans);
        }
    }

