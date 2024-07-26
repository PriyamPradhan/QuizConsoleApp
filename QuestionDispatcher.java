import java.util.Scanner;

public class QuestionDispatcher {
    
    QuestionConstants[] que = new QuestionConstants[6];   //Creating the array of quesitons
    String selection[] = new String[6];

    public QuestionDispatcher(){
        que[0] = new QuestionConstants(1, "10 + 10 ?", "20","21","22","23", "20");  //setting the hardcoded values of quesitons and alongside values
        que[1] = new QuestionConstants(2, "11 + 10 ?", "21","22","23","24", "21");
        que[2] = new QuestionConstants(3, "12 + 10 ?", "20","21","22","23", "22");
        que[3] = new QuestionConstants(4, "13 + 10 ?", "24","21","23","29", "23");
        que[4] = new QuestionConstants(5, "14 + 10 ?", "25","24","23","80", "24");
        que[5] = new QuestionConstants(6, "15 + 10 ?", "4","25","28","24", "25");
    }


    @SuppressWarnings("resource")
    public void displayQuestion(){  //displays the questions along with 4 options
        
        int i=0;
        for (QuestionConstants q : que){
            System.out.println(q.getId() + ". "  + q.getQuestion());
            System.out.println(q.getOption1() + " " + q.getOption2() + " " + q.getOption3() + " " + q.getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            System.out.println("Selected answer is : " + selection[i]);
            i++;

        }
    }

    public void calculateScore(){
        
        int score = 0;

        for (int j=0;j<que.length;j++){
            QuestionConstants answer = que[j];
            String actualAnswer = answer.getAnswer();
            String userAnswer = selection[j];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your final score is : " + score);

    }

    

}
