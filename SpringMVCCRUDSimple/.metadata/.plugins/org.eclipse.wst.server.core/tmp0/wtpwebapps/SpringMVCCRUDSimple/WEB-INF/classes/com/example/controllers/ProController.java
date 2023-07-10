package com.example.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.beans.Pro;
import com.example.dao.ProDao;

@Controller
public class ProController {
	@Autowired
	ProDao dao;

	@RequestMapping("/proform")
	public String showform(Model m) {
		m.addAttribute("command", new Pro());
		return "proform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("pro") Pro pro) {
		dao.save(pro);
		return "redirect:/viewpro";
	}

	@RequestMapping("/viewpro")
	public String viewpro(Model m) {
		List<Pro> list = dao.getProduct();
		m.addAttribute("list", list);
		return "viewpro";
	}

	@RequestMapping(value = "/editpro/{id}")
	public String edit(@PathVariable int id, Model m) {
		Pro pro = dao.getProductById(id);
		m.addAttribute("command", pro);
		return "proeditform";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("pro") Pro pro) {
		dao.update(pro);
		return "redirect:/viewpro";
	}

	@RequestMapping(value = "/deletepro/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		dao.delete(id);
		return "redirect:/viewpro";
	}
}