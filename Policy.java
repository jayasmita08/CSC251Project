public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInches;
    private double weightPounds;

    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.heightInches = 0.0;
        this.weightPounds = 0.0;
    }

    public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double heightInches, double weightPounds) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }

    public double getHeightInches() { return heightInches; }
    public void setHeightInches(double heightInches) { this.heightInches = heightInches; }

    public double getWeightPounds() { return weightPounds; }
    public void setWeightPounds(double weightPounds) { this.weightPounds = weightPounds; }

    public double getBMI() {
        if (heightInches == 0) return 0.0;
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    public double getPolicyPrice() {
        double price = 600.0;

        if (age > 50) {
            price += 75.0;
        }
        if ("smoker".equalsIgnoreCase(smokingStatus)) {
            price += 100.0;
        }
        double bmi = getBMI();
        if (bmi > 35.0) {
            price += (bmi - 35.0) * 20.0;
        }
        return price;
    }
}
