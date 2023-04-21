package com.sirun.api_rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sirun.api_rest.user.model.User;
import com.sirun.api_rest.utils.validator.CheckInyectSQL;

@SpringBootTest
class ApiRestApplicationTests {

	@Test
	void checkSymbolWhere() {
    // User user = new User("Ezequiel", "sosa", "ezequiel@gmail", "password");     
     assertEquals(true, CheckInyectSQL.isSymbol("where") );      
	}

	@Test
	void checkSymbolEquas() {
     assertEquals(true, CheckInyectSQL.isSymbol("1=1") );      
	}

  @Test
	void checkSymbolQuery() {
     assertEquals(true, CheckInyectSQL.isSymbol(";where 1=1 ") );      
	}

  @Test
	void checkSymbolQuotationMarks() {
     assertEquals(true, CheckInyectSQL.isSymbol("\"") );      
     assertEquals(true, CheckInyectSQL.isSymbol("\'") );      
	}

	@Test
	void checkUserNormal() {
    User user = new User("Ezequiel", "sosa", "ezequiel@gmail", "password");     
     assertEquals(false, CheckInyectSQL.isInyectSQL(user) );      
	}

	@Test
	void checkUserMalicious() {
    User user = new User("Ezequiel\"; where 1=1 \"", "sosa", "ezequiel@gmail", "password");     
     assertEquals(true, CheckInyectSQL.isInyectSQL(user) );      
	}

}
