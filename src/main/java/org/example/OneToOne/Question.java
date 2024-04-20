package org.example.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
    @Id
    private int questionId;
    private String questionName;
    @OneToOne
    private Answer ans;


    public int getQuestionId() {
        return questionId;
    }

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }


    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    Question(int questionId, String questionName, Answer ans) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.ans = ans;
    }

    Question() {
    }

    @Override
    public String toString() {
        return "questionId: " + questionId + ", questionName: " + questionName + " Answer: " + ans;
    }
}
