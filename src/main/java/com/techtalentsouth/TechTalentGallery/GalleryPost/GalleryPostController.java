package com.techtalentsouth.TechTalentGallery.GalleryPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GalleryPostController {
	
	@GetMapping("/artcollection")
	public String artcollectionMethod() {
		ModelAndView mv1 = new ModelAndView("");
		return "galleryPost/artcollection";
	}	
	@Autowired
	private GalleryPostRepository galleryPostRepository;
        
	    @GetMapping(value="/")
		public String index(GalleryPost galleryPost) {
				return "gallerypost/index";
		}
	    
	private GalleryPost galleryPost;
	@PostMapping(value = "/")
	public String addNewGalleryPost(GalleryPost galleryPost, Model model) {
		galleryPostRepository.save(new GalleryPost(galleryPost.getTitle(), galleryPost.getArtist(), galleryPost.getArtDetails()));
		model.addAttribute("title", galleryPost.getTitle());
		model.addAttribute("artist", galleryPost.getArtist());
		model.addAttribute("artDetails", galleryPost.getArtDetails());
		return "gallerypost/result";
	        }

	@GetMapping("/about")
	public String aboutMethod() {
		ModelAndView mv2 = new ModelAndView("");
		return "galleryPost/about";
	}
	
	@GetMapping("/home")
	public String index1(GalleryPost galleryPost) {
		return "gallerypost/index";

	}
	
}
