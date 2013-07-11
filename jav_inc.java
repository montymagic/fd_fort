class jav_inc  {

  public static void main (String args[]) {
    int i;
    for (i=1; i <=1000; i++) { 
      try{
      Thread.sleep(1000); 
      System.out.println(i);
      } catch (Exception e) {
              System.out.println(e);
      }
    } 
   }

}
