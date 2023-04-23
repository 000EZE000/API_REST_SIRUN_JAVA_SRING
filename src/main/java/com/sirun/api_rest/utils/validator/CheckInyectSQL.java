package com.sirun.api_rest.utils.validator;


import com.sirun.api_rest.user.model.User;

public class CheckInyectSQL {
  public static boolean isInyectSQL(User user){
    return isStringInyectSQL(user.getName()) ||
            isStringInyectSQL(user.getLastName()) ||
            isStringInyectSQL(user.getEmail()) ||
            isStringInyectSQL(user.getPassword()) ||
            isStringInyectSQL(user.getPhoto());
}

public static boolean isStringInyectSQL(String word){
    String formatWord = word.toLowerCase();
    
    return formatWord.contains(" where ")? 
      true: formatWord.contains("where ")? 
      true: formatWord.contains(" where")? 
      true: formatWord.contains("where")? 
      true: formatWord.contains("\"")? 
      true: formatWord.contains("\'")? 
      true: formatWord.contains("1=1")? 
      true: formatWord.contains(";")? true : false; 

  }
}
