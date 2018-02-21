package parseXML;

// Author : Murtaza Meerza

public class XMLToken {
	private String Look;
	private String Opening ="<\\w+>";
	private String Closing ="</\\w+>";
	
	public XMLToken(String token) {
		Look = token;	
	}
	public boolean isTag() {
		if (Look.charAt(0) == '<' && Look.charAt(Look.length()-1) == '>' && Look.length()>=3){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isOpeningTag() {
		return (Look.matches(Opening));
	}
	public boolean isClosingTag() {
		return (Look.matches(Closing));
	}
	public String getTagName(){
		String tag = "";
		if(this.isOpeningTag()){
			tag = Look.substring(1, Look.length()-1);
		}else if(this.isClosingTag()){
			tag = Look.substring(1, Look.length()-2);
		}
		return tag;
		 
			}
		
		
	}


