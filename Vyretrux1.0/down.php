<!-- Load the body -->
<main id="hideContent" class="container-fluid-One hide">
    <section class="row container">
      <!-- Load the logo -->
      <header>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 textCentered">
          <?php require_once "View/structure/logo.php"; ?>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 textCentered">
          <?php require_once "View/structure/textLogo.php"; ?>
        </div>
      </header>
      <footer class="col-lg-12 col-md-12 col-sm-12 col-xs-12 textCentered">
        <!-- Load the media buttons -->
          <?php require_once "View/structure/socialMedia.php"; ?>
      </footer>
    </section>

    <section class="row container">
      <!-- SEPARATOR -->
      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 separator" style="padding:0; margin-left:0; margin-right:0">
      </div>
      <br/>
      <!-- Load the alert and video -->
      <aside class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
        <?php require_once "View/alert.php"; ?>
      </aside>
      <header class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
        <?php require_once "View/video.php"; ?>
      </header>
    </section>
</main>
