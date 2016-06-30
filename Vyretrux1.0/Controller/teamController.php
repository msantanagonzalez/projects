<?php
require_once "Model/team.php";

//-------------------------------- CREATE OBJECTS ---------------------------------------//
//CLASS->(Name,Photo,Email,Description,Twitter,Facebook,Github)
$t1 = new team("Marco 'Tatiux' Santana","Resources/images/marcoSantana.jpg","tatiux.santana@vyretrux.com","Small/Large description","https://twitter.com/tatiuxsantana","https://www.facebook.com/tato.santana","https://github.com/msantanagonzalez");
$t2 = new team("Name Lastname","Resources/images/wIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t3 = new team("Name Lastname","Resources/images/mIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t4 = new team("Name Lastname","Resources/images/mIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t5 = new team("Name Lastname","Resources/images/wIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t6 = new team("Name Lastname","Resources/images/mIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t7 = new team("Name Lastname","Resources/images/wIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t8 = new team("Name Lastname","Resources/images/mIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
$t9 = new team("Name Lastname","Resources/images/wIcon.png","something@vyretrux.com","Small/Large description","https://twitter.com/","https://www.facebook.com/","https://github.com/");
//-------------------------------- ADD OBJECTS TO ARRAY ---------------------------------------//
$team=array($t1,$t2,$t3,$t4,$t5,$t6,$t7,$t8,$t9);
//-------------------------------- CREATE SESSION ARRAY ---------------------------------------//
$i=1;
foreach($team as $row)
	{
     $teamArray[$i]=$row->getData();
     $i++;
	}

$_SESSION['arrayTeam'] = $teamArray;
?>
