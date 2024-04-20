package org.example.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    private int answerId;
    private String answerName;

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public int getAnswerId() {
        return answerId;
    }

    public String getAnswerName() {
        return answerName;
    }

    Answer(int answerId, String answerName) {
        this.answerId = answerId;
        this.answerName = answerName;
    }

    Answer() {
    }

    @Override
    public String toString() {
        return "answerId: " + answerId + " answerName: " + answerName;
    }
}
