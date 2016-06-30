<?php
//session_start();
//---------------------| Configuration |---------------------//
//Down page
$down = 0;
//Set the animation
$animation = 0;
//Set the video
$video = 0;
//Note: WORK WITH PAGE 2,PAGE ONE INCOMPLETE
$page = 2;
//-----------------------------------------------------------//

//Load the head
require_once "View/structure/head.php";

//Check and build the "Load Animation"
  switch ($animation){
    case 1:
      dotsAnimation();
      break;
  }

//Check and build the "video"
  if($video == 1){
    videoAnimation();
  }

//Check if page under construction
if ($down == 1){
  //Load the under construction page
  require_once "down.php";
}else{
  //Load the page
  switch ($page) {
    case 1:
      require_once "View/one.php";
      break;

    case 2:
    require_once "View/two.php";
    break;

  }
}

//Load the bottom
require_once "View/structure/bottom.php";

//Define the animations

function dotsAnimation(){
  ?>
  <div id="cover" class="cover">
    <?php require_once "View/dotsLoader.php"; ?>
  </div>
  <?php
}
function videoAnimation(){
  require_once "View/videoLoader.php";
}
?>
