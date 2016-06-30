<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="padding-top:40px;padding-left:10%;padding-right:10%;">

  <!-- CONTENT HERE -->
      <div class="row">
          <?php
            $arrayTeam = $_SESSION['arrayTeam'];
            $modalId=1;
            foreach ($arrayTeam as $row) {
            ?>
            <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 teamItem">
              <div class="thumbnail transparent">
                <a href="#" data-toggle="modal" data-trigger="hover" data-target="<?php echo "#modal".$modalId; ?>">
                  <img class="img-thumbnail hvr-bounce-in" src="<?php echo $row['photo'];?>" alt="Team member photo" style="width:140px; height:140px;">
                </a>
              </div>
              <div class="caption">
                <p class="orangeText textCentered"><?php echo $row['name'];?></p>
              </div>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="<?php echo "modal".$modalId; ?>" tabindex="-1" role="dialog" aria-labelledby="basicModal" aria-hidden="true" data-trigger="hover">
                <div class="modal-dialog">
                    <div class="modal-content flatNoise">
                        <!-- Modal header -->
                        <div class="modal-header flatNoise">
                          <button type="button" class="close orangeText textL" data-dismiss="modal" aria-hidden="true" style="opacity:100;">X</button>
                          <p class="orangeText textCentered textM">
                          <img class="img-thumbnail hvr-bob" src="<?php echo $row['photo'];?>" alt="Team member photo" style="width:140px; height:140px;">
                          <?php echo $row['name'];?></p>
                        </div>
                        <!-- Modal body -->
                        <div class="modal-body">
                            <p class="blackText textCentered textM">
                              <?php echo $row['description'];?>
                            </p>
                        </div>
                        <!-- Modal footer -->
                        <div class="modal-footer">
                            <!-- twitter -->
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                              <p class="textCentered">
                              <a href="<?php echo $row['twitter'];?>" target="_blank" class="btn btn-social-icon btn-twitter hvr-bounce-in">
                                <i class="fa fa-twitter"></i>
                              </a>
                              </p>
                            </div>
                            <!-- facebook -->
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                              <p class="textCentered">
                              <a href="<?php echo $row['facebook'];?>" target="_blank" class="btn btn-social-icon btn-facebook hvr-bob">
                                <i class="fa fa-facebook"></i>
                              </a>
                            </p>
                            </div>
                            <!-- github -->
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                              <p class="textCentered">
                              <a href="<?php echo $row['github'];?>" target="_blank" class="btn btn-social-icon btn-github hvr-pulse-grow">
                                <i class="fa fa-github"></i>
                              </a>
                            </p>
                            </div>
                        </div>
                </div>
              </div>
            </div>
            <!-- end of Modal -->
          <?php
            $modalId++;
            }
          ?>

      </div>
  <!-- END OF CONTENT -->
</div>
