

	PImage back;
     PImage pipeBottom;
     PImage pipeTop;
     PImage bird;
      int birdX= 10;
      int birdY=200;
      int birdYVelocity = 30;
      int gravity=1;
      int pipeTopHeight=400;
      int pipeBottomHeight=-130;
   int pipeX= 250;
         int pipeGap=100;
     int lowerY =400;
     int upperY =-130;
      
      
      
      
      void teleportPipes(){
        if(pipeX==0){
          pipeX=450;
          pipeTopHeight=(int ) random(50, 400);
            pipeBottomHeight=(int ) random(-130, 400);
            lowerY= upperY + pipeTopHeight + pipeGap;
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
           
        }
        
         void draw() {
            background(back);
            image (pipeBottom,pipeX,lowerY);
            image (pipeTop,pipeX,upperY);
            image (bird, birdX, birdY);
            teleportPipes();
            birdY += gravity;
            pipeX -= 2;
            
            
         }
         void mousePressed(){
        
            birdY -= birdYVelocity;
            
          },700,700,1);
          }
     

