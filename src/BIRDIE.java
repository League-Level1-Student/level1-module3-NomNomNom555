PImage back;
     PImage pipeBottom;
     PImage pipeTop;
     PImage bird;
      int birdX= 10;
      int birdY=200;
      int birdYVelocity = 30;
      int gravity=1;
      int pipeTopHeight=-350;
      
      int pipeWidth= 5;
   int pipeX= 250;
         int pipeGap=150;
     int lowerY;
     
     
      
      
     boolean intersectsPipes() { 
     if (birdY < pipeTopHeight + 400 && birdX > pipeX && birdX < (pipeX+pipeWidth)){
          return true; }
     else if (birdY>lowerY && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
          return true; }
     else { return false; }
}


      
      void teleportPipes(){
        if(pipeX==0){
          pipeX=450;
          pipeTopHeight=(int ) random(-350,-150);
            lowerY= pipeTopHeight +400 + pipeGap;
            
        }
         
      }
      
        void setup() {
          size(700,700);
          back = loadImage("flappyBackground.jpg");
          back.resize(700,700);
            pipeBottom = loadImage("bottomPipe.png");
            pipeTop = loadImage("topPipe.png");
            bird = loadImage("bird.png");
            bird.resize(50,50);
            lowerY=400;
           
        }
        
         void draw() {
            background(back);
            image (pipeBottom,pipeX,lowerY);
            image (pipeTop,pipeX,pipeTopHeight);
            image (bird, birdX, birdY);
            teleportPipes();
            birdY += gravity;
            pipeX-=2;
            intersectsPipes();
            if(intersectsPipes()==true){
              stop();
              println("worked");
            }
         }
         
         void mousePressed(){
        
            birdY -= birdYVelocity;
            
          
          }

