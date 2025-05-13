public class SignedText{
  private String fName;
  private String lName;

  public SignedText(String f, String l){
    fName=f;
    lName=l;
  }

  public String getSignature(){
    if (fName.equals("")){
      return lName;
    }

    return fName.substring(0,1)+ "-"+lName;
  }

  public String addSignature(String text){
    String signature=getSignature();
    
    if (text.indexOf(signature)==0){
      return text.substring(signature.length())+signature;
    } else if (text.indexOf(signature)==-1){
      return text+signature;
    }
    return text;
  }
}
