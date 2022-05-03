package practicaMona;
import java.awt.*;

public class Octocat {
    protected String name;
    protected String variantName;
    protected int variantCode;
    protected Color bodyColor;
    protected Color faceColor;
    protected Color eyesColor;

    public Octocat(String name){
        this.name=name;
        this.variantName="Original Octocat";
        this.variantCode=1;
        bodyColor=new Color(0,0,0);
        faceColor=new Color(248,192,171);
        eyesColor=new Color(163,69,72);
    }

    protected Octocat(String name, String variantName, int variantCode){
        this.name=name;
        this.variantName=variantName;
        this.variantCode=variantCode;
    }

    protected void setOriginalColors(){
        bodyColor=new Color(0,0,0);
        faceColor=new Color(248,192,171);
        eyesColor=new Color(163,69,72);
    }
    protected void setBodyColor(int r, int g, int b){
        bodyColor=new Color(r,g,b);
    }
    protected void setFaceColor(int r, int g, int b){
        faceColor=new Color(r,g,b);
    }
    protected void setEyesColor(int r, int g, int b){
        eyesColor=new Color(r,g,b);
    }
    public String getName(){return name;}
    public String getVariantName(){return variantName;}
    public int getVariantCode(){return variantCode;}
    public Color getBodyColor(){return bodyColor;}
    public Color getFaceColor(){return faceColor;}
    public Color getEyesColor(){return eyesColor;}

    public void greet(){
        System.out.println("Hola, soy "+name+" y soy la variante "+variantName);
    }
    public void move()  { System.out.println("Me desplazo caminando..."); }
}
