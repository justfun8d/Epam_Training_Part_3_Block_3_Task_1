package by.training.epam.regExEditor.model;

public class Text {

    private String text;

    public Text(){
        this.text="";
    }

    public Text(String text){
        this.text=text;
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text=text;
    }

    public boolean equals(Object o){

        if(this == o){
            return true;
        }

        if(o == null || this.getClass()!=o.getClass()){
            return false;
        }

        Text text=(Text) o;
        return this.text.equals(text.getText());
    }

    public int hashCode(){
        return text.hashCode();
    }

    public String toString(){
        return "Text{" +
                this.text +
                "}";
    }
}
