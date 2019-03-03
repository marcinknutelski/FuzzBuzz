package main;

public class FizzBuzz {

    private Integer liczDo;
    private Integer liczOd;
    
    public FizzBuzz(Integer liczOd, Integer liczDo) 
    {
        
        if (liczOd==null || liczDo==null ) 
        {
            throw new IllegalArgumentException("Wartości nie mogą być puste.");
        }	
                
        if (liczOd!=1 || liczDo!=100) 
        {
            throw new IllegalArgumentException("Program liczy w zakresie od 1 do 100");
        }
        this.liczOd = liczOd;
        this.liczDo = liczDo;
    }

    
    public Integer getCountTo() 
    {       
        return liczDo;        
    }
    
    
    public Integer getCountFrom()
    {       
        return liczOd;        
    }
    
    public Integer getCurrentInt(int number) 
    {       
        return number;
    }
    
    public String returnFizz()
    {      
        return "Fizz";        
    }
    
    public String returnBuzz()
    {       
        return "Buzz";       
    }
    
    public String returnFizzBuzz()
    {        
       return "FizzBuzz";       
    }
    
    
    public String getValue(Integer number)
    {
        
        StringBuilder sB = new StringBuilder();
        
        if ((number%3==0) && (number%5==0)) 
        {
            sB.append(returnFizzBuzz());
        }
        
        else if (number%3==0) 
        {
            sB.append(returnFizz());
        }
        
        else if (number%5==0) 
        {
            sB.append(returnBuzz());
        }
        
        else 
        {
            sB.append(String.valueOf(number));
        }
        
        return sB.toString();       
    }
    
    public void doSomeFizzBuzzing()
    {    
        for (int i=liczOd; i<liczDo+1; i++) 
        {
            System.out.println(getValue(i));
        }  
    }   
}

