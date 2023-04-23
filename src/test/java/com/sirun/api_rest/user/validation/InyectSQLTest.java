package com.sirun.api_rest.user.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sirun.api_rest.user.UserForTest;
import com.sirun.api_rest.user.model.User;
import com.sirun.api_rest.utils.validator.CheckInyectSQL;



@SpringBootTest
public class InyectSQLTest {
  
  @Test
	void checkSymbolWhere() {
     assertEquals(true, CheckInyectSQL.isStringInyectSQL("where") );      
	}

	@Test
	void checkSymbolEquas() {
     assertEquals(true, CheckInyectSQL.isStringInyectSQL("1=1") );      
	}

  @Test
	void checkSymbolQuery() {
     assertEquals(true, CheckInyectSQL.isStringInyectSQL(";where 1=1 ") );      
	}

  @Test
	void checkSymbolQuotationMarks() {
     assertEquals(true, CheckInyectSQL.isStringInyectSQL("\"") );      
     assertEquals(true, CheckInyectSQL.isStringInyectSQL("\'") );      
	}

	@Test
	void checkUserNormal() {
    User user = UserForTest.getUserComplety(); 
     assertEquals(false, CheckInyectSQL.isInyectSQL(user) );      
	}

	@Test
	void checkUserMalicious() {
    User user = UserForTest.userCustom("Ezequiel\"; where 1=1 \"", "sosa", "ezequiel@gmail", "password");     
     assertEquals(true, CheckInyectSQL.isInyectSQL(user) );      
	}

}
