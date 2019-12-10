var settingsStrings;
var tileorderStrings;

function setup() {
  settingsStrings = loadStrings('settings.txt');
  tileOrderStrings = loadStrings('TileSwapper/tileorder.txt');
  createCanvas(400, 400);
  textSize(15);
  fill(255,255,255);
}

function draw() {
  background(color(0,0,0));
  text(tileOrderStrings[0],50,30);
}
