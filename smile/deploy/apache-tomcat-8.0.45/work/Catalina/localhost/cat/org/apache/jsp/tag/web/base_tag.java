/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.45
 * Generated at: 2019-04-16 11:05:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class base_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/web-core.tld", Long.valueOf(1539067812000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1533486250000L));
    _jspx_dependants.put("/WEB-INF/app.tld", Long.valueOf(1539067812000L));
    _jspx_dependants.put("jar:file:/E:/example/openSourceProject/cat/smile/deploy/apache-tomcat-8.0.45/webapps/cat/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/webres.tld", Long.valueOf(1538015570000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fres_005fbean_0026_005fid_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fres_005fbean_0026_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fres_005fbean_0026_005fid_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      com.dianping.cat.report.view.NavigationBar navBar = null;
      navBar = (com.dianping.cat.report.view.NavigationBar) _jspx_page_context.getAttribute("navBar", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (navBar == null){
        navBar = new com.dianping.cat.report.view.NavigationBar();
        _jspx_page_context.setAttribute("navBar", navBar, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      if (_jspx_meth_res_005fbean_005f0(_jspx_page_context))
        return;
      out.write("<html lang=\"en\"><head>\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>CAT</title>\n");
      out.write("\t<meta name=\"description\" content=\"Restyling jQuery UI Widgets and Elements\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/jquery-ui.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/ace-fonts.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/ace.min.css\" id=\"main-ace-style\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/ace-skins.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/css/ace-rtl.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/css/body.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/js/jquery.datetimepicker.css\"/>\n");
      out.write("\t\n");
      out.write("\t<script src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/jquery.min.js'> </script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/ace-extra.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/js/highcharts.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/js/baseGraph.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/js/jquery.datetimepicker.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/jquery-ui.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/ace-elements.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.webapp}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("/assets/js/ace.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"no-skin\">\n");
      out.write("\t\t<!-- #section:basics/navbar.layout -->\n");
      out.write("\t\t<div id=\"navbar\" class=\"navbar navbar-default\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('navbar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"navbar-container\" id=\"navbar-container\">\n");
      out.write("\t\t\t\t<!-- #section:basics/sidebar.mobile.toggle -->\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle menu-toggler pull-left\" id=\"menu-toggler\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle sidebar</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- /section:basics/sidebar.mobile.toggle -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header pull-left\">\n");
      out.write("\t\t\t\t\t<!-- #section:basics/navbar.layout.brand -->\n");
      out.write("\t\t\t\t\t<i class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t<span>CAT</span>\n");
      out.write("\t\t\t\t\t\t<small style=\"font-size:65%\">\n");
      out.write("\t\t\t\t\t\t\t（Central Application Tracking）\n");
      out.write("\t\t\t\t\t\t</small>\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-success btn-sm\" id=\"nav_application\" >\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-signal\"></i>Application\n");
      out.write("\t\t\t\t\t</button><!-- \n");
      out.write("\t\t\t\t\t<button class=\"btn btn-grey btn-sm\" id=\"nav_mobile\">\n");
      out.write("\t\t\t\t\t\t<i class=\"menu-icon glyphicon glyphicon-phone\"></i>Mobile\n");
      out.write("\t\t\t\t\t</button> -->\n");
      out.write("\t\t\t\t\t<!-- #section:basics/sidebar.layout.shortcuts -->\n");
      out.write("\t\t\t\t\t<!-- <button class=\"btn btn-warning btn-sm\" id=\"nav_browser\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-users\"></i>Browser\n");
      out.write("\t\t\t\t\t</button> -->\n");
      out.write("\t\t\t\t\t<!-- <button class=\"btn btn-purple btn-sm\" id=\"nav_server\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-cogs\"></i>Servers\n");
      out.write("\t\t\t\t\t</button> -->\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-inverse btn-sm\" id=\"nav_config\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-cogs\"></i>Configs\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-yellow btn-sm\" id=\"nav_document\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-cogs\"></i>Documents\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- #section:basics/navbar.dropdown -->\n");
      out.write("\t\t\t\t<div class=\"navbar-buttons navbar-header pull-right\" role=\"navigation\">\n");
      out.write("\t\t\t\t<ul class=\"nav ace-nav\" style=\"height:auto;\">\n");
      out.write("\t\t\t\t\t<li class=\"light-blue\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://github.com/dianping/cat/\" target=\"_blank\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ace-icon glyphicon glyphicon-star\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span>Star</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"light-blue\" >\n");
      out.write("\t\t\t\t\t\t<a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"user-info\" style=\"max-width:200px\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"loginInfo\"></span>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("<!-- \t\t\t\t\t\t\t<i class=\"ace-icon fa fa-caret-down\"></i>\n");
      out.write(" -->\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t");
      out.write("</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(function($) {\n");
      out.write("\t\t\t\t//override dialog's title function to allow for HTML titles\n");
      out.write("\t\t\t\t$.widget(\"ui.dialog\", $.extend({}, $.ui.dialog.prototype, {\n");
      out.write("\t\t\t\t\t_title: function(title) {\n");
      out.write("\t\t\t\t\t\tvar $title = this.options.title || '&nbsp;'\n");
      out.write("\t\t\t\t\t\tif( (\"title_html\" in this.options) && this.options.title_html == true )\n");
      out.write("\t\t\t\t\t\t\ttitle.html($title);\n");
      out.write("\t\t\t\t\t\telse title.text($title);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$(\".delete\").on('click', function(e) {\n");
      out.write("\t\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t\tvar anchor = this;\n");
      out.write("\t\t\t\t\tvar dialog = $( \"#dialog-message\" ).removeClass('hide').dialog({\n");
      out.write("\t\t\t\t\t\tmodal: true,\n");
      out.write("\t\t\t\t\t\ttitle: \"<div class='widget-header widget-header-small'><h4 class='smaller'><i class='ace-icon fa fa-check'></i>CAT提示</h4></div>\",\n");
      out.write("\t\t\t\t\t\ttitle_html: true,\n");
      out.write("\t\t\t\t\t\tbuttons: [ \n");
      out.write("\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\ttext: \"Cancel\",\n");
      out.write("\t\t\t\t\t\t\t\t\"class\" : \"btn btn-xs\",\n");
      out.write("\t\t\t\t\t\t\t\tclick: function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$( this ).dialog( \"close\" ); \n");
      out.write("\t\t\t\t\t\t\t\t} \n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\ttext: \"OK\",\n");
      out.write("\t\t\t\t\t\t\t\t\"class\" : \"btn btn-primary btn-xs\",\n");
      out.write("\t\t\t\t\t\t\t\tclick: function() {\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.location.href=anchor.href;\n");
      out.write("\t\t\t\t\t\t\t\t} \n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t]\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t//tooltips\n");
      out.write("\t\t\t\t$( \"#show-option\" ).tooltip({\n");
      out.write("\t\t\t\t\tshow: {\n");
      out.write("\t\t\t\t\t\teffect: \"slideDown\",\n");
      out.write("\t\t\t\t\t\tdelay: 250\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$( \"#hide-option\" ).tooltip({\n");
      out.write("\t\t\t\t\thide: {\n");
      out.write("\t\t\t\t\t\teffect: \"explode\",\n");
      out.write("\t\t\t\t\t\tdelay: 250\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$( \"#open-event\" ).tooltip({\n");
      out.write("\t\t\t\t\tshow: null,\n");
      out.write("\t\t\t\t\tposition: {\n");
      out.write("\t\t\t\t\t\tmy: \"left top\",\n");
      out.write("\t\t\t\t\t\tat: \"left bottom\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\topen: function( event, ui ) {\n");
      out.write("\t\t\t\t\t\tui.tooltip.animate({ top: ui.tooltip.position().top + 10 }, \"fast\" );\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t//Menu\n");
      out.write("\t\t\t\t$( \"#menu\" ).menu();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t//spinner\n");
      out.write("\t\t\t\tvar spinner = $( \"#spinner\" ).spinner({\n");
      out.write("\t\t\t\t\tcreate: function( event, ui ) {\n");
      out.write("\t\t\t\t\t\t//add custom classes and icons\n");
      out.write("\t\t\t\t\t\t$(this)\n");
      out.write("\t\t\t\t\t\t.next().addClass('btn btn-success').html('<i class=\"ace-icon fa fa-plus\"></i>')\n");
      out.write("\t\t\t\t\t\t.next().addClass('btn btn-danger').html('<i class=\"ace-icon fa fa-minus\"></i>')\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t//larger buttons on touch devices\n");
      out.write("\t\t\t\t\t\tif('touchstart' in document.documentElement) \n");
      out.write("\t\t\t\t\t\t\t$(this).closest('.ui-spinner').addClass('ui-spinner-touch');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t//slider example\n");
      out.write("\t\t\t\t$( \"#slider\" ).slider({\n");
      out.write("\t\t\t\t\trange: true,\n");
      out.write("\t\t\t\t\tmin: 0,\n");
      out.write("\t\t\t\t\tmax: 500,\n");
      out.write("\t\t\t\t\tvalues: [ 75, 300 ]\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t//jquery accordion\n");
      out.write("\t\t\t\t$( \"#accordion\" ).accordion({\n");
      out.write("\t\t\t\t\tcollapsible: true ,\n");
      out.write("\t\t\t\t\theightStyle: \"content\",\n");
      out.write("\t\t\t\t\tanimate: 250,\n");
      out.write("\t\t\t\t\theader: \".accordion-header\"\n");
      out.write("\t\t\t\t}).sortable({\n");
      out.write("\t\t\t\t\taxis: \"y\",\n");
      out.write("\t\t\t\t\thandle: \".accordion-header\",\n");
      out.write("\t\t\t\t\tstop: function( event, ui ) {\n");
      out.write("\t\t\t\t\t\t// IE doesn't register the blur when sorting\n");
      out.write("\t\t\t\t\t\t// so trigger focusout handlers to remove .ui-state-focus\n");
      out.write("\t\t\t\t\t\tui.item.children( \".accordion-header\" ).triggerHandler( \"focusout\" );\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t//jquery tabs\n");
      out.write("\t\t\t\t$( \"#tabs\" ).tabs();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\tfunction getcookie(objname) {\n");
      out.write("\t\t\tvar arrstr = document.cookie.split(\"; \");\n");
      out.write("\t\t\tfor ( var i = 0; i < arrstr.length; i++) {\n");
      out.write("\t\t\t\tvar temp = arrstr[i].split(\"=\");\n");
      out.write("\t\t\t\tif (temp[0] == objname) {\n");
      out.write("\t\t\t\t\treturn temp[1];\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn \"\";\n");
      out.write("\t\t}\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tvar ct = getcookie(\"ct\");\n");
      out.write("\t\t\tif (ct != \"\") {\n");
      out.write("\t\t\t\tvar length = ct.length;\n");
      out.write("\t\t\t\tvar realName = ct.split(\"|\");\n");
      out.write("\t\t\t\tvar temp = realName[0];\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(temp.charAt(0)=='\"'){\n");
      out.write("\t\t\t\t\ttemp =temp.substring(1,temp.length);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar name = decodeURI(temp);\n");
      out.write("\t\t\t\tvar loginInfo=document.getElementById('loginInfo');\n");
      out.write("\t\t\t\tloginInfo.innerHTML ='欢迎，'+name;\n");
      out.write("\t\t\t} else{\n");
      out.write("\t\t\t\t//var loginInfo=document.getElementById('loginInfo');\n");
      out.write("\t\t\t\t//loginInfo.innerHTML ='<a href=\"/cat/s/login\" data-toggle=\"modal\">登录</a>';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.moduleUri}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\" != \"/cat/s\") {\n");
      out.write("\t\t\t\tvar page = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.page.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("';\n");
      out.write("\t\t\t\t$('#'+page+\"_report\").addClass(\"active open\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//custom autocomplete (category selection)\n");
      out.write("\t\t\t$.widget( \"custom.catcomplete\", $.ui.autocomplete, {\n");
      out.write("\t\t\t\t_renderMenu: function( ul, items ) {\n");
      out.write("\t\t\t\t\tvar that = this,\n");
      out.write("\t\t\t\t\tcurrentCategory = \"\";\n");
      out.write("\t\t\t\t\t$.each( items, function( index, item ) {\n");
      out.write("\t\t\t\t\t\tif ( item.category != currentCategory ) {\n");
      out.write("\t\t\t\t\t\t\tul.append( \"<li class='ui-autocomplete-category'>\" + item.category + \"</li>\" );\n");
      out.write("\t\t\t\t\t\t\tcurrentCategory = item.category;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\tthat._renderItemData( ul, item );\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<script  type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"#nav_application\").click(function(){\n");
      out.write("\t\t\twindow.location.href = \"/cat/r/t?domain=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&ip=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.ipAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&date=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&reportType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.reportType}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&op=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.action.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\";\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#nav_mobile\").click(function(){\n");
      out.write("\t\t\twindow.location.href = \"/cat/r/app?domain=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&ip=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.ipAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&date=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&reportType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.reportType}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&op=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.action.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\";\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#nav_browser\").click(function(){\n");
      out.write("\t\t\twindow.location.href = \"/cat/r/browser?domain=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&ip=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.ipAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&date=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&reportType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.reportType}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&op=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.action.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\";\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#nav_server\").click(function(){\n");
      out.write("\t\t\twindow.location.href = \"/cat/r/server?domain=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&ip=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.ipAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&date=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&reportType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.reportType}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\";\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#nav_document\").click(function(){\n");
      out.write("\t\t\twindow.location.href = \"/cat/r/home?domain=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&ip=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.ipAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&date=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&reportType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.reportType}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("&op=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payload.action.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\";\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#nav_config\").click(function(){\n");
      out.write("\t\t\twindow.location.href = \"/cat/s/config?op=projects\";\n");
      out.write("\t\t});});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_res_005fbean_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  res:bean
    org.unidal.webres.taglib.basic.BeanTagHandler _jspx_th_res_005fbean_005f0 = (org.unidal.webres.taglib.basic.BeanTagHandler) _005fjspx_005ftagPool_005fres_005fbean_0026_005fid_005fnobody.get(org.unidal.webres.taglib.basic.BeanTagHandler.class);
    boolean _jspx_th_res_005fbean_005f0_reused = false;
    try {
      _jspx_th_res_005fbean_005f0.setPageContext(_jspx_page_context);
      _jspx_th_res_005fbean_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/base.tag(7,0) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_res_005fbean_005f0.setId("res");
      int _jspx_eval_res_005fbean_005f0 = _jspx_th_res_005fbean_005f0.doStartTag();
      if (_jspx_th_res_005fbean_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fres_005fbean_0026_005fid_005fnobody.reuse(_jspx_th_res_005fbean_005f0);
      _jspx_th_res_005fbean_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_res_005fbean_005f0, _jsp_getInstanceManager(), _jspx_th_res_005fbean_005f0_reused);
    }
    return false;
  }
}
