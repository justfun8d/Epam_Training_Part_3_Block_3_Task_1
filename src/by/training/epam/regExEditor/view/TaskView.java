package by.training.epam.regExEditor.view;

import by.training.epam.regExEditor.model.Paragraph;

import java.util.Arrays;

public class TaskView {

    public void printTask(){

        System.out.println("Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее " +
                "выполнять с текстом три различных операции: \nотсортировать абзацы по количеству предложений; \n" +
                "в каждом предложении отсортировать слова по длине; \n" +
                "отсортировать лексемы в предложении по убыванию " +
                "количества вхождений заданного символа, а в случае равенства – по алфавиту.");
    }

    public void printParagraphs(Paragraph[] paragraphs) {

        ParagraphView paragraphView=new ParagraphView();

        for (Paragraph paragraph : paragraphs) {
            paragraphView.printParagraph(paragraph);
        }
    }
}
