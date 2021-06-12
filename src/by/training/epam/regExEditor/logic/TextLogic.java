package by.training.epam.regExEditor.logic;

import by.training.epam.regExEditor.model.Paragraph;
import by.training.epam.regExEditor.model.Text;

import java.util.List;

public class TextLogic {

    public List<Paragraph> toSortedParagraphs(Text text){
        return new ParagraphLogic().toSortedParagraphs(text);
    }

    public Text toText(Text text){
        return text;
    }

    public void append(Text paragraphsTextMain, Text paragraphTextAdd) {

        paragraphsTextMain.setText(paragraphsTextMain.getText()+paragraphTextAdd.getText());
    }
}
