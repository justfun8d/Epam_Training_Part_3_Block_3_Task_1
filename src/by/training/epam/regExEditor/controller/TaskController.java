package by.training.epam.regExEditor.controller;

import by.training.epam.regExEditor.logic.TaskLogic;
import by.training.epam.regExEditor.model.Text;
import by.training.epam.regExEditor.view.TaskView;
import by.training.epam.regExEditor.view.TextView;

public class TaskController {

    public void run(){

        TaskView taskView=new TaskView();

        taskView.printTask();

        String textLine="Так говорила в июле 1805 года известная Анна Павловна Шерер, фрейлина и приближенная " +
                "императрицы Марии Феодоровны, встречая важного и чиновного князя Василия, первого приехавшего на " +
                "ее вечер. Анна Павловна кашляла несколько дней, у нее был грипп, как она говорила (грипп был тогда " +
                "новое слово, употреблявшееся только редкими). \n " +
                "Он говорил на том изысканном французском языке, на котором не только говорили, но и думали " +
                "наши деды, и с теми, тихими, покровительственными интонациями, которые свойственны состаревшемуся " +
                "в свете и при дворе значительному человеку. Он подошел к Анне Павловне, поцеловал ее руку, " +
                "подставив ей свою надушенную и сияющую лысину, и покойно уселся на диване.\n " +
                "Как можно быть здоровой... когда нравственно страдаешь? Разве можно, имея чувство, оставаться " +
                "спокойною в наше время? — сказала Анна Павловна. — Вы весь вечер у меня, надеюсь?";

        System.out.println(textLine);

        Text text=new Text(textLine);

        TaskLogic logic=new TaskLogic();

        TextView textView=new TextView();

        //Сортировка абзацев
        Text sortedParagraphsText=logic.toSortedParagraphsText(text);
        textView.printText(sortedParagraphsText);

        //Сортировка слов по длине
        Text sortedSentencesText=logic.toSortedSentencesText(text);
        textView.printText(sortedSentencesText);

        //Сортировка букв
        Text sortedLettersText=logic.toSortedLettersText(text);
        textView.printText(sortedLettersText);
    }
}
