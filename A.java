import java.security.PublicKey;

public class A  implements Presentable{
    private String AString;
    private String PresentString;
    
    public A(String AString, String Presentable) {
        super();
        this.AString = AString;
        this.PresentString =PresentString;
    
    }

    @Override
    public boolean Present() {
        return AString + PresentString;

    }
}
