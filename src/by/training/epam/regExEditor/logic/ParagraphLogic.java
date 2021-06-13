package by.training.epam.regExEditor.logic;

import by.training.epam.regExEditor.model.Paragraph;
import by.training.epam.regExEditor.model.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphLogic {

    public List<Paragraph> toSortedParagraphs(Text text) {
        //TODO toSortedParagraphs - отсортировать абзацы по количеству предложений

        List<Paragraph> paragraphs=new ArrayList<>();

        String regEx=".+(\\n|$)";
        Pattern pattern=Pattern.compile(regEx);
        Matcher matcher=pattern.matcher(text.getText());

        while(matcher.matches()){
            paragraphs.add(new Paragraph(matcher.group()));
        }

        Collections.sort(paragraphs);

        return new ArrayList<>();
    }
}
