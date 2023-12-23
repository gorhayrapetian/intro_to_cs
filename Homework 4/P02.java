public class P02 {
    public static void main(String[] args) {
        int birthYear = 2005;
        int kekhtotSalary = 150_000; //in usd of course;)
        double pensionFundRate;
        double incomeTaxRate = 0.21; // 21% tax for everyone
        int insurancePayment = 0;

        if (birthYear>=1974){
            pensionFundRate = 0.045;
        } else {
            pensionFundRate = 0;
        }

        if (kekhtotSalary <= 100_000) {
            insurancePayment = 1500;
        } else if (kekhtotSalary <= 200_000) {
            insurancePayment = 3000;
        } else if (kekhtotSalary <= 500_000) {
            insurancePayment = 5500;
        } else if (kekhtotSalary <= 1_000_000) {
            insurancePayment = 8500;
        } else {
            insurancePayment = 15_000;
        }

        double pensionFundDeduction = kekhtotSalary * pensionFundRate;
        double incomeTaxDeduction = kekhtotSalary * incomeTaxRate; // I don't pay taxes btw))
        double totalDeduction = pensionFundDeduction + incomeTaxDeduction + insurancePayment;
        double makurSalary = kekhtotSalary - totalDeduction;

        System.out.println("Pension fund deduction: " + pensionFundDeduction + " AMD");
        System.out.println("Tax deduction: " + incomeTaxDeduction + " AMD");
        System.out.println("Insurance payment: " + insurancePayment + " AMD");
        System.out.println("Total deduction: " + totalDeduction + " AMD");
        System.out.println("After tax salary (makur salary): " + makurSalary + " AMD");
    }
}