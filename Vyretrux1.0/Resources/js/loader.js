
	// Wait for window load
	$(window).load(function() {
		var v = document.getElementsByTagName("video")[0];
		var s = document.getElementsByTagName("audio")[0];

		setTimeout(function() {
			fadeOut("#loader");
		}, 2000); //1000 ms = 1 second

		setTimeout(function() {
		fadeOut("#cover");
		s.play();
		}, 2500); //1000 ms = 1 second

		setTimeout(function() {
		$("#videoIntro").removeClass('hide');
		v.play();
		}, 4400); //1000 ms = 1 second

		v.onended  = function() {
			setTimeout(function() {
//			fadeOut("#hideContent");
				$("#hideContent").removeClass('hide');
				fadeOut("#videoIntro");
				fadeIn("#hideContent");
				s.pause();
			}, 2000); //1000 ms = 1 second
		};

		v.onpause  = function() {
			fadeOut("#videoIntro");
			setTimeout(function() {
			fadeOut("#hideContent");
			$("#hideContent").removeClass('hide');
			fadeIn("#hideContent");
			s.pause();
			}, 2000); //1000 ms = 1 second
		};
		/*
		setTimeout(function() {
		$("#hideContent").removeClass('hide');
		}, 2500); //1000 ms = 1 second

		/*
		setTimeout(function() {
    $(".cover").fadeOut("slow",complete);;
		}, 2000); //1000 ms = 1 second

		//showElement("#logo");
		//showElement("#video");
		//
		//fadeOut(".loader");
		//fadeOut(".cover");
    //fadeOut(".cssload-wrap");
		*/
	});

  function fadeOut(idElement){
	$(idElement).fadeOut("slow",complete);;
    function complete(){
    }
  }

function showElement(idElement){
  $(idElement).removeClass('hide');
}

function fadeIn(idElement){
	$(idElement).fadeIn("slow");;
}
