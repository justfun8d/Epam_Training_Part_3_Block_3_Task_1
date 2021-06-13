package by.training.epam.regExEditor.model;

public class Paragraph extends Text{

    public Paragraph(){
        super();
    }

    public Paragraph(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                this.getText() +
                "}";
    }
}
