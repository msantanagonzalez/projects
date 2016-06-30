<?php

class team{
	private $name;
  private $photo;
	private $email;
  private $description;
	private $twitter;
	private $facebook;
  private $github;


	function __construct($name, $photo, $email, $description, $twitter, $facebook, $github){
		$this->name=$name;
    $this->photo=$photo;
		$this->email=$email;
		$this->description=$description;
		$this->twitter=$twitter;
		$this->facebook=$facebook;
    $this->github=$github;
	}

	public function getData(){
		$teamArray = array();
		$teamArray = array( 'name' => $this->name,
		'photo' => $this->photo,
		'email' => $this->email,
		'description' => $this->description,
		'twitter' => $this->twitter,
		'facebook' => $this->facebook,
		'github' => $this->github);
		return $teamArray;
	}

	public function getName(){
      return $this->name;
  }
  public function getPhoto(){
      return $this->photo;
  }
  public function getEmail(){
      return $this->email;
  }
  public function getDescription(){
      return $this->description;
  }
  public function getTwitter(){
      return $this->twitter;
  }
  public function getFacebook(){
      return $this->facebook;
  }
  public function getGithub(){
      return $this->github;
  }
}
