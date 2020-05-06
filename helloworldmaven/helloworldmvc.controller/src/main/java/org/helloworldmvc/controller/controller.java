package org.helloworldmvc.controller;

import java.awt.List;
import java.util.ArrayList;

import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;

public class controller {
	private IView view = null;
	private IModel model = null;
	
	public void Controller (final IView view, final IModel model) {
		this.view = view;
		this.model = model;
	}
	public void run() {
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
