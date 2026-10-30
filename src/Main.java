import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double percentage = sc.nextDouble();
        int backlogs = sc.nextInt();
        int graduationYear = sc.nextInt();

        Candidate candidate = new Candidate(
            name, 
            percentage, 
            backlogs,
            graduationYear
        );

        Job job = new Job(
            "Infosys",
            "Java Developer",
            65.0,
            0,
            2026
        );

        boolean percentagePass = 
            candidate.getPercentage() >= job.getMinimumPercentage();

        boolean backlogPass = 
            candidate.getBacklogs() <= job.getMaximumBacklogs();

        boolean yearPass = 
            candidate.getGraduationYear() == job.getMinimumPercentage();

        boolean eligible =
            percentagePass && backlogPass && yearPass;

        System.out.println("-------------------------------");
        System.out.println("PLACEMENT ELIGIBITY RESULT");
        System.out.println("-------------------------------");


        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println();

        if(percentagePass) {
            System.out.println("Percentage  : PASS");
        } else {
            System.out.println("Percentage  : FAIL");
        }

        if(backlogPass) {
            System.out.println("Backlogs    : PASS");
        } else {
            System.out.println("Backlogs    : FAIL");
        }

        if(yearPass) {
            System.out.println("Graduation Year : PASS");
        } else {
            System.out.println("Graduation Year : FAIL");
        }

        System.out.println();
    
        if(eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("-------------------------------");

        sc.close();
    }
}