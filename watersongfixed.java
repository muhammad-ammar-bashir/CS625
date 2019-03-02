public class watersong {
    public static void main(string[] args) {
         int waternum = 9;
         string word = "bottles";
         while (waternum > 0)
          {
            if (waternum == 1)
             { 
               word == "bottle";
             }
              system.out.println(waternum +" "+ word + "of water on the wall");
              system.out.println(waternum +" "+ word + "of water");
              system.out.println("take one down.");
              system.out.println("pass it around");
              waternum = waternum - 1;
              if (waternum > 0)
              {
                system.out.println(waternum +" "+ word + "of water on the wall");
              }
              else
              {
                system.out.println("no more bottles of water on the wall");
              }
          }
      }
  }  
               






              }