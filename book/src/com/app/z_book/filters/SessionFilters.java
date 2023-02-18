package com.app.z_book.filters;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebFilter(urlPatterns = {"*.do","*.html"}, initParams = {@WebInitParam(name ="whiteList", value = "/book/page.do?operate=page&page=/user/login,/book/user.do?null")})
public class SessionFilters implements Filter {

    private List<String> whiteList;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        String[] whiteLists = filterConfig.getInitParameter("whiteList").split(",");
        whiteList = Arrays.asList(whiteLists);

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req =(HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        System.out.println("req.getRequestURI() = " + req.getRequestURI());
        System.out.println("req.getRequestURL() = " + req.getRequestURL());
        System.out.println("req.getQueryString() = " + req.getQueryString());

        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        String requestURI = req.getRequestURI();
        String queryString = req.getQueryString();
        System.out.println((requestURI + "?" + queryString) );
        if (whiteList.contains(requestURI + "?" + queryString) || user != null){
            filterChain.doFilter(servletRequest, servletResponse);
        }else{
            resp.sendRedirect("page.do?operate=page&page=/user/login");
        }
    }

    @Override
    public void destroy() {

    }
}
