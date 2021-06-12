package by.training.epam.regExEditor.logic;

import by.training.epam.regExEditor.model.Letter;
import by.training.epam.regExEditor.model.Paragraph;
import by.training.epam.regExEditor.model.Sentence;
import by.training.epam.regExEditor.model.Text;

import java.util.List;

public class TaskLogic {

    public Text toSortedParagraphsText(Text text) {

        TextLogic textLogic=new TextLogic();

        List<Paragraph> paragraphs=this.toSortedParagraphs(text);

        Text sortedParagraphsText=new Text();

        for (Paragraph paragraph : paragraphs) {
            textLogic.append(sortedParagraphsText, paragraph);
        }

        return sortedParagraphsText;
    }

    public Text toSortedSentencesText(Text text){

        TextLogic textLogic=new TextLogic();

        List<Sentence> sentences=this.toSortedSentences(text);

        Text sortedSentencesText=new Text();

        for (Sentence sentence : sentences) {
            textLogic.append(sortedSentencesText, sentence);
        }

        return sortedSentencesText;
    }

    public Text toSortedLettersText(Text text) {

        TextLogic textLogic=new TextLogic();

        List<Letter> letters=this.toSortedLetters(text);

        Text sortedLettersText=new Text();

        for (Letter letter : letters) {
            textLogic.append(sortedLettersText, letter);
        }

        return sortedLettersText;
    }

    private List<Paragraph> toSortedParagraphs(Text text) {
        return new TextLogic().toSortedParagraphs(text);
    }

    private List<Sentence> toSortedSentences(Text text) {
        return new SentenceLogic().toSortedSentences(text);
    }

    private List<Letter> toSortedLetters(Text text) {
        return new LetterLogic().toSortedLetters(text);
    }
}
