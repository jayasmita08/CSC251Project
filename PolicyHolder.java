public class PolicyHolder {
//instance fields for Policy Holder’s personal info
   private String firstName;
   private String lastName;
   private int age;
   private char  smokingStatus; // for smoker type ‘y’ or non-smoker type ‘n’
   private double height;
   private double weight;

   public PolicyHolder(String firstName, String lastName, int age,
                       char smokingStatus, double height, double weight) {
      this.firstName = firstName;
      this.lastName= lastName;
      this.age= age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   // copy constructor for dual copy applications
   public PolicyHolder(PolicyHolder individual) {
      this.firstName =individual.firstName;
      this.lastName= individual.lastName;
      this.age = individual.age;
      this.smokingStatus =individual.smokingStatus;
      this.height =individual.height;
      this.weight = individual.weight;
   }

   public double calculateBMI() {
      return (weight * 703) / (height * height);
   }

   public String toString() {
      return "Policyholder's First Name: " + firstName +
             "\nPolicyholder's Last Name: " + lastName +
             "\nPolicyholder's Age: " + age +
             "\nPolicyholder's Smoking Status: " + smokingStatus +
             "\nPolicyholder's Height: " + height + " inches" +
             "\nPolicyholder's Weight: " + weight + " pounds" +
             String.format("\nPolicyholder's BMI: %.2f", calculateBMI());
   }
}

