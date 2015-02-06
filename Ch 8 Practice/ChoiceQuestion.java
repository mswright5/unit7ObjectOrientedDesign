
public class ChoiceQuestion extends Question
{
    //text: "The primary colors are: "
    // 1) Red, Blue, Yellow
    // 2) Red, Blue, Green
    // 3) Purple, Blue, Yellow

    private int numberOfChoices;
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;
    }

    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;

        super.addText("\n" + numberOfChoices +") " + choice);

        if(correct){
            String choiceAnswer = "" + numberOfChoices;
            super.setAnswer(choiceAnswer);
        }
    }
    
    
}
