package cn.com.taiji.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import cn.com.taiji.dto.DepartTreeDto;
import cn.com.taiji.service.DepartTreeService;

@Controller
@RequestMapping("/tree")
public class DepartTreeController {

	@Autowired
	DepartTreeService departTreeService;
	
	@RequestMapping(value="/showTree",method=RequestMethod.POST)
	@ResponseBody
	public String showTree() {
		List<String> list  = new ArrayList();
		try {
			
			String departTree = departTreeService.getDepartTree("b2707388d1cf42ffa2ee6dd7eb1c1dbd");
			list.add(departTree);
			
			
			
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		return list.toString();
	}
	
}
