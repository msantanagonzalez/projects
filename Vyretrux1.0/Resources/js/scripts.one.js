
$(document).ready(function(){

});


var numMenu = 510; //number of pixels before fix the menu

$(window).bind('scroll', function () {
    if ($(window).scrollTop() > numMenu) {
        $('.menu').addClass('menuFixed');

    } else {
        $('.menu').removeClass('menuFixed');
        clearHeaders();
    }

/*
    if ( $('#menuHome').hasClass('active') ) {
        clearHeaders();
        $('#homeIcon').addClass('hvr-bob-active');
        //$('#homeHeader').addClass('headerFixed');
      }

    if ( $('#menuTeam').hasClass('active') ) {
        clearHeaders();
        $('#menuIcon').addClass('hvr-bob-active');
        //$('#menuHeader').addClass('headerFixed');
      }

    if ( $('#menuNews').hasClass('active') ) {
        clearHeaders();
        $('#newsIcon').addClass('hvr-bob-active');
        //$('#newsHeader').addClass('headerFixed');
      }

    if ( $('#menuGame').hasClass('active') ) {
        clearHeaders();
        $('#gameIcon').addClass('hvr-bob-active');
        //$('#gameHeader').addClass('headerFixed');
      }

    if ( $('#menuContact').hasClass('active') ) {
        clearHeaders();
        $('#contactIcon').addClass('hvr-bob-active');
      }
*/
});

/*On click*/
$("#menuHome").click(function(){
  clearHeaders();
  $('#homeIcon').addClass('hvr-bob-active');
  //$('#homeHeader').addClass('headerFixed');
});

$("#menuTeam").click(function(){
  clearHeaders();
  $('#teamIcon').addClass('hvr-bob-active');
  //$('#teamHeader').addClass('headerFixed');
});

$("#menuNews").click(function(){
  clearHeaders();
  $('#newsIcon').addClass('hvr-bob-active');
  //$('#newsHeader').addClass('headerFixed');
});

$("#menuGame").click(function(){
  clearHeaders();
  $('#gameIcon').addClass('hvr-bob-active');
  //$('#gameHeader').addClass('headerFixed');
});

$("#menuContact").click(function(){
  clearHeaders();
  $('#contactIcon').addClass('hvr-bob-active');
});

function clearHeaders(){
  //$('#homeHeader').removeClass('headerFixed');
  //$('#teamHeader').removeClass('headerFixed');
  //$('#newsHeader').removeClass('headerFixed');
  //$('#gameHeader').removeClass('headerFixed');
  //$('#contactHeader').removeClass('headerFixed');

  $('#homeIcon').removeClass('hvr-bob-active');
  $('#teamIcon').removeClass('hvr-bob-active');
  $('#newsIcon').removeClass('hvr-bob-active');
  $('#gameIcon').removeClass('hvr-bob-active');
  $('#contactIcon').removeClass('hvr-bob-active');
}
/*
jQuery('.teamItem').hover(function () {
    jQuery("[id^=modal]").modal({
        show: true
    });
});
*/
