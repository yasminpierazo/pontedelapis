package net.codejava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.codejava.models.Doacao;
import net.codejava.models.InfoAluno;
import net.codejava.models.InfoEscola;
import net.codejava.models.Lista;
import net.codejava.models.User;
import net.codejava.repositories.DoacaoRepository;
import net.codejava.repositories.ListaRepository;
import net.codejava.repositories.UserRepository;


@Controller
public class AppController {

	@Autowired
	private ListaRepository listRepo;

	@Autowired
	private DoacaoRepository doaRepo;

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public String viewHomePage() {
		return "home";
	}

	@GetMapping("/cadastro_usuario")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "cadastroUsuario";
	}
	
	@PostMapping("/registroSucesso")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getSenha());
		user.setSenha(encodedPassword);
		
		userRepo.save(user);
		
		return "registrado_sucesso";
	}
	
	@GetMapping("/doacoes")
	public String listUsers(Model model) {
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		//User user = user.findByEmail(auth.getName());
		
		List<Lista> arrListas = listRepo.findAll();
		Doacao doacao = new Doacao();
		model.addAttribute("doacao", doacao);
		model.addAttribute("arrListas", arrListas);
		
		return "doacoes";
	}


	@GetMapping("/menuu")
		public String menu(){
			return "menunavegacao";

		
	}


	@GetMapping("/cadastro_aluno")
	public String dk(){
	
		return "CadastroAluno";
	}

	
	@GetMapping("/info_doacao")
	public String confirmDonation(Doacao doa, Model model){
		model.addAttribute("doacao", doa);
		return "confirmarDoacao";
	}

	@GetMapping("/about")
	public String about(){
	
		return "sobrenós";
	}

	@PostMapping("/confirmation")
	public String confirmation(Doacao doa) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userRepo.findByEmail(auth.getName());
		Lista lista = listRepo.findByIdLista(doa.getIdLista());
		InfoAluno aluno = new InfoAluno();
		aluno.setMatricula(lista.getInfoAluno().getMatricula());
		aluno.setNomeAluno(lista.getInfoAluno().getNomeAluno());
		doa.setInfoAluno(aluno);	
			InfoEscola escola = new InfoEscola();
			escola.setEstadoEscola(lista.getInfoEscola().getEstadoEscola());
			escola.setCepEscola(lista.getInfoEscola().getCepEscola());
			escola.setCidadeEscola(lista.getInfoEscola().getCidadeEscola());
			escola.setNomeEscola(lista.getInfoEscola().getNomeEscola());
		doa.setInfoEscola(escola);
					
		doa.setEmailDoador(user.getEmail());
		doaRepo.save(doa);
		return "redirect:info_doacao";
	}

	@GetMapping("/cadastro_materiais")
	public String cadastroMateriais(){
		return "cadastroLista";


	}

	@PostMapping("/lista_salva")
	public String processLista(Lista lista) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		//User user = user.findByEmail(auth.getName());
		
		//List<Lista> arrListas = listRepo.findAll();
		lista.setEmailUsuario(auth.getName());
		lista.setDoada(false);

		listRepo.save(lista);
		
		return "success";
	}


	@GetMapping("/escolhaPerfil")
	public String escolherPerfil(){
		return "escolhaPerfil";


	}


}
