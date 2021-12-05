package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import Gestionale.Controller.*;
import Gestionale.entity.*;
import Gestionale.Database.*;

class AggiungiCompagniaTest {

	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	@Test
	public void test01(){
		try {
			ControlGestore g = new ControlGestore();
			Compagnia compagnia = new Compagnia("pippozzo",1);
		
			assertTrue(	g.aggiungiCompagnia(compagnia));
			System.out.println(" TEST 1\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}

	@Test
	public void test02(){
		try {
			ControlGestore g = new ControlGestore();
			Compagnia compagnia = new Compagnia("pippozzo",1111111111);
		
			assertTrue(	g.aggiungiCompagnia(compagnia));
			System.out.println(" TEST 2\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}

	
	@Test
	public void test03(){
		try {
			ControlGestore g = new ControlGestore();
			Compagnia compagnia = new Compagnia("pippozzobestialeeeeeeeeeeeeeeee",1);
		
			assertTrue(	g.aggiungiCompagnia(compagnia));
			System.out.println(" TEST 3\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}
}
