package main;

import java.util.ArrayList;
import java.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class testFizzBuzz {
    
        private FizzBuzz fizzBuzz;
        private final ArrayList<String> expectedValues = new ArrayList<>(
        Arrays.asList( "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", 
                       "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" ));
        private final ArrayList<String> actualValues = new ArrayList<>();
                
        @Before
        public void createCorrectInstance()
        {         
        fizzBuzz = new FizzBuzz(1,100);       
        }
        
        @Test
        public void createFizzBuzzWithCountParameter() 
        {  
               fizzBuzz = new FizzBuzz(1,100);               
        }
        
        @Test
        public void getConstructorCountFromValue() 
        {       
            Integer liczOd=1;
            Assert.assertThat(liczOd, Matchers.comparesEqualTo(fizzBuzz.getCountFrom()));            
        }
        
        @Test
        public void getConstructorCountToValue() 
        {          
            Integer liczDo=100;
            Assert.assertThat(liczDo, Matchers.comparesEqualTo(fizzBuzz.getCountTo()));           
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void testFizzBuzzWithNullParameters()
        {           
            fizzBuzz = new FizzBuzz(null, null);           
        }
          
        @Test
        public void getInteger()
        {          
           Integer sprawdz=13;
           Assert.assertThat(sprawdz, Matchers.comparesEqualTo(fizzBuzz.getCurrentInt(13)));         
        }

        @Test
        public void getFizz()
        {           
            Assert.assertEquals("Fizz", fizzBuzz.returnFizz());           
        }
        
        @Test
        public void getBuzz()
        {          
            Assert.assertEquals("Buzz", fizzBuzz.returnBuzz());            
        }
        
        @Test
        public void getFizzBuzz()
        {           
            Assert.assertEquals("FizzBuzz", fizzBuzz.returnFizzBuzz());           
        }
        
        @Test
        public void fizzChecker()
        {          
            Assert.assertEquals("Fizz", fizzBuzz.getValue(21));          
        }

        @Test
        public void buzzChecker()
        {            
            Assert.assertEquals("Buzz", fizzBuzz.getValue(100));            
        }  

        @Test
        public void fizzBuzzChecker()
        {          
            Assert.assertEquals("FizzBuzz", fizzBuzz.getValue(30));            
        }    
        
        @Test
        public void intToStringChecker()
        {           
            Assert.assertEquals("44", fizzBuzz.getValue(44));           
        }
              
        @Test
        public void compareSampleResults() 
        {          
            for (int i=1; i<=15+1; i++) 
            {
            actualValues.add(fizzBuzz.getValue(i));
            }          
            for (int i=0 ; i<expectedValues.size(); i++) 
            {
                Assert.assertTrue(expectedValues.get(i).equals(actualValues.get(i)));
            }
        }       
}
