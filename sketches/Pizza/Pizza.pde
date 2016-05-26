import ddf.minim.*;        
AudioSample sound;

void setup() {
  
  Minim minim = new Minim(this);     
  sound = minim.loadSample("burp.wav");

  size(750, 750);
  fill(252, 194, 129);
  ellipse(375, 375, 600, 600);
  fill(201, 0, 0);
  ellipse(375, 375, 525, 525);
  fill(253, 239, 180);
  ellipse(375, 375, 475, 475);
}

void draw() {

  if (mousePressed && (mouseButton == LEFT)) {
    sound.trigger();
    PImage drake = loadImage("search.png");
    drake.resize(60, 60);
    image(drake, mouseX, mouseY);
  }

  if (mousePressed && (mouseButton == RIGHT)) {
    sound.trigger();
    PImage kanye = loadImage("imgres.png");
    kanye.resize(60, 60);
    image(kanye, mouseX, mouseY);
  }
}

