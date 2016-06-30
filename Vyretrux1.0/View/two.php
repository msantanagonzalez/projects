<?php
echo "herer";
require_once "Controller/companyController.php";
require_once "Controller/teamController.php";
?>
<main id="hideContent" class="container-fluid-One hide">
			<div class="row" style="padding:0; margin-left:0; margin-right:0">

					<!-- LOGO -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="padding:0; margin-left:0; margin-right:0">
					<?php require_once "View/structure/logo.php"; ?>
					</div>

					<!-- SEPARATOR -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
					</div>

					<!-- CAROUSEL -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 carousel" style="padding:0; margin-left:0; margin-right:0">
						<?php require_once "View/structure/carousel.php"; ?>
					</div>


					<!-- MENU -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 menu" style="padding:0; margin-left:0; margin-right:0">
						<!-- SEPARATOR -->
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
						</div>
						<?php require_once "View/structure/menu.php"; ?>
					</div>

					<!-- SEPARATOR -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
					</div>

					<!-- Home -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="home">
						<div class="row">
							<!-- HomeIcon -->
							<div id="homeHeader" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 flatNoise" style="padding:0; margin-left:0; margin-right:0;">
					        <p class="text-center orangeText textM" style="margin-bottom:0; margin-top:70px;">
					          <span id="homeIcon" class="">
					            <span class="icon-home-detailed" aria-hidden="true"></span>
					            HOME
					          </span>
					        </p>
									<!-- SEPARATOR -->
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0;">
									</div>
					    </div>
							<!-- HomeContent -->
						<?php require_once "View/home.php"; ?>
						</div>
					</div>



					<!-- TEAM -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="team">
					  <div class="row">
					    <!-- TeamIcon -->
					    <div id="teamHeader" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 flatNoise" style="padding:0; margin-left:0; margin-right:0">
					        <p class="text-center orangeText textM" style="margin-bottom:0;margin-top:70px;">
					          <span id="teamIcon" class="">
					            <span class="icon-info" aria-hidden="true"></span>
					            TEAM
					          </span>
					        </p>
									<!-- SEPARATOR -->
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
									</div>
					    </div>
							<!-- TeamContent -->
							<?php require_once "View/team.php"; ?>
						</div>
					</div>

					<!-- NEWS -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="news">
					  <div class="row">
					    <!-- NewsIcon -->
					    <div id="newsHeader" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 flatNoise" style="padding:0; margin-left:0; margin-right:0">
					        <p class="text-center orangeText textM" style="margin-bottom:0;margin-top:70px;">
					          <span id="newsIcon" class="">
					            <span class="icon-megaphone" aria-hidden="true"></span>
					             NEWS
					          </span>
					        </p>
					    </div>
							<!-- SEPARATOR -->
					    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
					    </div>
							<!-- NewsContent -->
							<?php require_once "View/news.php"; ?>
						</div>
					</div>


					<!-- GAME -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="padding:0; margin-left:0; margin-right:0" id="game">
						<div class="row" style="padding:0; margin-left:0; margin-right:0">
						  <!-- GameIcon -->
							<div id="gameHeader" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 flatNoise" style="padding:0; margin-left:0; margin-right:0">
					        <p class="text-center orangeText textM" style="margin-bottom:0;margin-top:70px;">
					        <span id="gameIcon" class="">
					          <span class="icon-game" aria-hidden="true"></span>
					           1214
					        </span>
					      </p>
						  </div>
							<!-- SEPARATOR -->
					    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
					    </div>
							<!-- GameContent -->
							<?php require_once "View/game.php"; ?>
						</div>
					</div>


					<!-- CONTACT -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="contact">
					  <div class="row">
					    <!-- ContactIcon -->
							<div id="contactHeader" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 flatNoise" style="padding:0; margin-left:0; margin-right:0">
					        <p class="text-center orangeText textM" style="margin-bottom:0;margin-top:70px;">
					          <span id="contactIcon" class="">
					            <span class="icon-letter" aria-hidden="true"></span>
					           Contact us
					          </span>
					        </p>
					    </div>
							<!-- SEPARATOR -->
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0;">
							</div>
							<!-- ContactContent -->
							<?php require_once "View/contact.php"; ?>
						</div>
					</div>

					<!-- SEPARATOR -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0; margin-top:50px;">
					</div>
					<!-- Footer -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 footer" style="padding:0; margin-left:0; margin-right:0;">
						<?php require_once "View/structure/footer.php"; ?>
					</div>

			</div>
</main>
