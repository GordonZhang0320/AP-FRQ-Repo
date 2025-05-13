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

    return fName.substring(0,1)+lName;
  }

  public String addSignature(String str){
    String signature=getSignature();
    if (str.indexOf(signature)==0){
      return str.substing(signature.length())+signature;
    } else if (str.indexOf(signature)==-1)
      return str+siganture;
    }
    return str;
  }

  


}
