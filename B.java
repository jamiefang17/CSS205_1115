public class B extends A {//implements Presentable{
    private String BString;
    private String PresentBString;

    public B(String AString, String PresenBtString) {
        super(AString, PresentString);
        this.BString = BString;
        this.PresenBtString =PresentBString;

    @Override
    public String Present(){
        return super.Present() +BString + PresentBString;
    }
    
}
