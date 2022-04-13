package MathGame;
////test class

public class QuestionTest {
    
  public QuestionTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }


  /**
   * Test of evaluateAnswer method, of class Question.
   */
  
  public void testEvaluateAnswer() {
      System.out.println("evaluateAnswer");
      
      Question instance = new Question();
      
     
      double result = instance.evaluateAnswer("What is 9 + 5 ?");
      
      if(result == 14.0)
      {
          System.out.println("Tastcase for (+) passed ");
                 
      }
      result = instance.evaluateAnswer("What is 35 - 3 ?");
      
      if(result == 32.0)
      {
          System.out.println("Tastcase for (-) passed ");
                 
      }
      result = instance.evaluateAnswer("What is 5 * 2 ?");
      
      if(result == 10.0)
      {
          System.out.println("Tastcase for (*) passed ");
                 
      }
      result = instance.evaluateAnswer("What is 10/ 10 ?");
      
      if(result == 1.0)
      {
          System.out.println("Tastcase for (/) passed ");
                 
      }
      
  }
  
}
