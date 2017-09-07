package com.umteto.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class SiteController {

	@Inject private Result result;
	
	@Path("/")
	public void index(){
		result.include("msg", "hello world");
	}
}
