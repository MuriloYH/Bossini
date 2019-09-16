package br.usjt.hellospringboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.usjt.hellospringboot.model.Usuario;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			
			HttpSession session = request.getSession();
			
			Usuario usuario = (Usuario)session.getAttribute("usuarioLogado");
			
			if (usuario == null) {
				response.sendRedirect("login");
			}
			else if(usuario.isAdm() && request.getRequestURI().substring(request.getContextPath().length()).equals("/veiculos")) {
				response.sendRedirect("veiculoAdmin");
			}
			else if(!usuario.isAdm() && request.getRequestURI().substring(request.getContextPath().length()).equals("/veiculoAdmin")) {
				response.sendRedirect("veiculos");
			}
			return true;
		}

}
