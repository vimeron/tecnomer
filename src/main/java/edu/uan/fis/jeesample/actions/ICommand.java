package edu.uan.fis.jeesample.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The command class is used to process data from an incoming request.
 * This is the most simplest execution pattern receiving unparsed data
 * @author wjforero
 */
public interface ICommand {
    
    CommandResult findAll(HttpServletRequest request, HttpServletResponse response);
    
    CommandResult findById(HttpServletRequest request, HttpServletResponse response);
    
    CommandResult create(HttpServletRequest request, HttpServletResponse response);
    
    CommandResult update(HttpServletRequest request, HttpServletResponse response);
    
    CommandResult delete(HttpServletRequest request, HttpServletResponse response);
    
}
