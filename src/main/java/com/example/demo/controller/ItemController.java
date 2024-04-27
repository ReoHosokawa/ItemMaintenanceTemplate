package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.service.ItemService;

@Controller
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("items", itemService.findAll());
		return "index";
	}
	
	@GetMapping("{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("item", itemService.findOne(id));
		return "show";
	}
	
	@GetMapping("new")
	public String newItem(@ModelAttribute("item") Item item, Model model) {
		return "new";
	}
}
