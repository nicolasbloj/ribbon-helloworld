package com.nab.mszuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.LoggerFactory;
 
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
 
public class MyZuulFilter extends ZuulFilter {
 
    private static Logger LOGGER = LoggerFactory.getLogger(MyZuulFilter.class);
 
    private static final String FILTERTYPE = "pre";
 
    private static final Integer FILTERORDER = 1;
 
    public MyZuulFilter(){
        //For Spring
    }
 
    @Override
    public String filterType() {
        return FILTERTYPE;
    }
 
    @Override
    public int filterOrder() {
        return FILTERORDER;
    }
 
    @Override
    public boolean shouldFilter() {
        return true;
    }
 
    @Override
    public Object run() {
        final HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        LOGGER.info("{} petición a {}", request.getMethod(), request.getRequestURL().toString());
        return null;
    }
 
}