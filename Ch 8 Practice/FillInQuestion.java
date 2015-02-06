import java.util.Scanner;

public class FillInQuestion extends Question
{
    //Specified text: "The inventor of Java is _James Gosling_ from Sun."
    //Convert the specified text into the text to display and the answer text:
    //"The inventor of Kava is _____ from sun."
    //answer: "James Gosling"
    
    public FillInQuestion()
    {
        
    }
    
    public void setText(String questionText){
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText( question );
        super.setAnswer( answer);
        
    }
}
