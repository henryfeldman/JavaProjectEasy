import java.util.Scanner;






public class Runner {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        Question q = new Question();
        System.out.println("Welcome to Calculating Your Life Expectancy. Please respond Yes or No to the following 10 questions.");
        for(int i = 0; i < q.questions.length; i++){
            System.out.println(q.questions[i]);
            q.answers[i] = sc.nextLine();

        }
        q.getLifeExpectancy();







    }
}
