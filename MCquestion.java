public class MCquestion extends Question {
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private int answer;

    public int MC_A = 1;
    public int MC_B = 2;
    public int MC_C = 3;
    public int MC_D = 4;


    public MCquestion(String question, String choiceA, String choiceB, String choiceC, String choiceD, int answer) {
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.answer = answer;
        this.question = question;
    }

    public boolean check(int guess) {
        return guess == answer;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCquestion that = (MCquestion) o;
        return answer == that.answer && choiceA.equals(that.choiceA) && choiceB.equals(that.choiceB) && choiceC.equals(that.choiceC) && choiceD.equals(that.choiceD) && question == that.question;
    }


}