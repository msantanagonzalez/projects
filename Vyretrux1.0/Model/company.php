<?php

class company{
	private $comName;
	private $comEmail;
	private $comLogo;
	private $comTwitter;
	private $comFacebook;


	function __construct($name, $email, $logo, $twitter, $facebook){
		$this->comName=$name;
		$this->comEmail=$email;
		$this->comLogo=$logo;
		$this->comTwitter=$twitter;
		$this->comFacebook=$facebook;
	}

	public function getName(){
      return $this->comName;
  }
  public function getEmail(){
      return $this->comEmail;
  }
  public function getLogo(){
      return $this->comLogo;
  }
  public function getTwitter(){
      return $this->comTwitter;
  }
  public function getFacebook(){
      return $this->comFacebook;
  }
}
