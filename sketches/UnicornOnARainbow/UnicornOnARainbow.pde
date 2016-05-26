PImage rainbow;
PImage unicorn;

void setup() {
  rainbow = loadImage("rainbow.jpg");  
  rainbow.resize(600,400);
  size(rainbow.width, rainbow.height);
background(rainbow);

 unicorn = loadImage("unicorn.png"); 
}

void draw() {
  if (mousePressed){
background(rainbow);
}
image(unicorn, mouseX, mouseY);



  // 9. When the mouse is pressed, reload the rainbow background
}

