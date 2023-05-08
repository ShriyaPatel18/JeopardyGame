/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.jeopardyGame;

/**
 *
 * @author Home
 */
public class QuesAnsHard {
    private String question;
    private String ans; 
    private String theme; 
    public QuesAnsHard(String question, String ans,String theme1) {
        this.question = question;
        this.ans = ans;
        this.theme = theme1;
    }

    public String getQuestion() {
        return question;
    }

    public String getAns() {
        return ans;
    }
    
    public String getTheme(){
        return theme;
    }
    public void displayHard(){
        QuestionPage qpage = new QuestionPage();
        qpage.jLabel2.setText(getQuestion());
        qpage.jLabel5.setText(getTheme());
        qpage.show();
    }
}
