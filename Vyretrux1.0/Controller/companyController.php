<?php
require_once "Model/company.php";
$companyData = new company("Vyretrux","info@Vyretrux.com","Resources/images/vyreLogo.png","vyretruxgames","pages/Vyretrux-Games/326389814227606");

$_SESSION['companyEmail'] = $companyData->getEmail();
$_SESSION['companyLogo'] = $companyData->getLogo();
$_SESSION['companyTwitter'] = $companyData->getTwitter();
$_SESSION['companyFacebook'] = $companyData->getFacebook();
?>
