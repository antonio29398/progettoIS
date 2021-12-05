/**
 * 
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Gestionale.Controller.*;
import Gestionale.entity.*;
import Gestionale.Database.*;


class VisualizzaVoliTest {

	
	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	public void test01(){
		try {
			ControlUtente c = new ControlUtente();
			Volo volo = new Volo(0,01,0,12122012,0,2030,0,0,0,0);
			c.AggiungiVolo(volo);
			assertTrue(c.visualizzaVoli(01, 12122012, 2030));
			System.out.println(" TEST 1\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}
	
	@Test
	public void test02(){
		try {
			ControlUtente c = new ControlUtente();
			Volo volo = new Volo(0,01234567,0,12122012,0,2030,0,0,0,0);
			c.AggiungiVolo(volo);
			assertTrue(c.visualizzaVoli(01234567, 12122012, 2030));
			System.out.println(" TEST 2\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}
	public void test03(){
		try {
			ControlUtente c = new ControlUtente();
			Volo volo = new Volo(0,01,0,121220122,0,2030,0,0,0,0);
			c.AggiungiVolo(volo);
			assertTrue(c.visualizzaVoli(01, 121220122, 2030));
			System.out.println(" TEST 3\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}
	public void test04(){
		try {
			ControlUtente c = new ControlUtente();
			Volo volo = new Volo(0,01,0,12122012,0,21800,0,0,0,0);
			c.AggiungiVolo(volo);
			assertTrue(c.visualizzaVoli(01, 12122012, 21800));
			System.out.println(" TEST 4\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}
	public void test05(){
		try {
			ControlUtente c = new ControlUtente();
			Volo volo = new Volo(0,01,0,12122012,0,2930,0,0,0,0);
			c.AggiungiVolo(volo);
			assertTrue(c.visualizzaVoli(01, 12122012, 2930));
			System.out.println(" TEST 2\n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
		
	}
	
	@Test
	void testVisualizzaVoli() {
		fail("Not yet implemented");
	}

}
