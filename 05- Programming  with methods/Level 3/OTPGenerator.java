
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class OTPGenerator {


    public static int generateOTP() {
        return new Random().nextInt(900000) + 100000;     }


    public static boolean areOTPsUnique(Set<Integer> otpSet) {
        return otpSet.size() == 10;     }

    public static void main(String[] args) {
        Set<Integer> otpSet = new HashSet<>();


        while (otpSet.size() < 10) {
            otpSet.add(generateOTP());
        }


        if (areOTPsUnique(otpSet)) {
            System.out.println("All OTPs are unique: " + otpSet);
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}

