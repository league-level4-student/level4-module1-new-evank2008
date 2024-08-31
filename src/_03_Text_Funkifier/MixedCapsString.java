package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
final StringBuilder b = new StringBuilder(unfunkifiedText);
boolean sw = true;
for(int i = 0;i<b.length();i++) {
	if(sw) {
		b.setCharAt(i, Character.toLowerCase(b.charAt(i)));
		sw=false;
	} else {
		b.setCharAt(i, Character.toUpperCase(b.charAt(i)));
		sw=true;
	}

}
		return b.toString();
	}

}
