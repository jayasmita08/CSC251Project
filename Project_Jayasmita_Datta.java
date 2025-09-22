import java.util.Scanner;

public class Project_Jayasmita_Datta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        String policyNumber = in.nextLine();

        System.out.println();
        System.out.print("Please enter the Provider Name: ");
        String providerName = in.nextLine();

        System.out.println();
        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = in.nextLine();

        System.out.println();
        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = in.nextLine();

        System.out.println();
        System.out.print("Please enter the Policyholder's Age: ");
        int age = Integer.parseInt(in.nextLine().trim());

        System.out.println();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = in.nextLine();

        System.out.println();
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double heightInches = Double.parseDouble(in.nextLine().trim());

        System.out.println();
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weightPounds = Double.parseDouble(in.nextLine().trim());

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus,heightInches, weightPounds);

        System.out.println();
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.printf("Policyholder's Height: %.1f inches%n", policy.getHeightInches());
        System.out.printf("Policyholder's Weight: %.1f pounds%n", policy.getWeightPounds());
        System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.getPolicyPrice());

        in.close();
    }
}
