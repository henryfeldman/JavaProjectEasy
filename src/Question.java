public class Question {
   public String [] questions = new String[10];
   public String [] answers = new String[10];


    public Question() {
        makeQuestions();
    }



   public void makeQuestions(){
        questions[0] = "Do you smoke cigarettes?";
        questions[1] = "Do you have more than 5 drinks a week?";
        questions[2] = "Do you drink evian water?";
        questions[3] = "Are you currently in the military?";
        questions[4] = "Do you do yoga more than two times per week?";
        questions[5] =  "Do you meditate?";
        questions[6] = "Do you get at least 8 hours of sleep every night?";
        questions[7] = "Do you sniff glue?";
        questions[8] =  "Have you participated in the Whole30 diet?";
        questions[9] =  "Were you born during the medieval times?";
    }
    public void getLifeExpectancy(){
       int lifeExpectancy = 70;
       System.out.println(answers[0]);
       if(answers[0].toLowerCase().equals("yes")){lifeExpectancy -= 5;}
       if(answers[1].toLowerCase().equals("yes")){lifeExpectancy -= 7;}
       if(answers[2].toLowerCase().equals("yes")){lifeExpectancy +=3;}
       if(answers[3].toLowerCase().equals("yes")){lifeExpectancy -=9;}
       if(answers[4].toLowerCase().equals("yes")){lifeExpectancy +=5;}
       if(answers[5].toLowerCase().equals("yes")){lifeExpectancy +=2;}
       if(answers[6].toLowerCase().equals("yes")){lifeExpectancy +=3;}
       if(answers[7].toLowerCase().equals("yes")){lifeExpectancy -=10;}
       if(answers[8].toLowerCase().equals("yes")){lifeExpectancy +=7;}
       if(answers[9].toLowerCase().equals("yes")){lifeExpectancy =20;}
       System.out.println("You are expected to live to be " + lifeExpectancy + " years old.");

    }
}
