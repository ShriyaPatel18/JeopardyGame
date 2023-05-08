/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.jeopardyGame;

/**
 *
 * @author Home
 */
public class QuesAnsEasy {
        private String ques;
        private String optionA;
        private String optionB;
        private String optionC;
        private String optionD;
        private String answer;
        private String theme;

    public QuesAnsEasy(String ques, String optionA, String optionB, String optionC, String optionD, String answer, String theme) {
        this.ques = ques;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
        this.theme = theme;
    }

    public String getQues() {
        return ques;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getAnswer() {
        return answer;
    }
    public String getTheme() {
        return theme;
    }
     public void display(){
        EasyGamePage ques = new EasyGamePage();
        ques.jLabel2.setText(getQues());
        ques.jLabel9.setText(getOptionA());
        ques.jLabel10.setText(getOptionB());
        ques.jLabel11.setText(getOptionC());
        ques.jLabel12.setText(getOptionD());
        ques.jLabel5.setText(getTheme());
        ques.show();
        }
    }

