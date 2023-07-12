public class ThreeDigitArmstrong {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i++) {
            if (ifArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ifArmstrong(int num){
        int temp=num,rem,sum=0;

            //extract digits
            while(num != 0){
                rem = num % 10;
                sum += Math.pow(rem,3);
                num /= 10;
            }
            return sum == temp;
        }
    }

