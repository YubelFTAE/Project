package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_charEncoding_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_charEncoding_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_charEncoding_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset = UTF-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Trang chủ</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("\t\n");
      out.write("\t<section id=\"slider\"><!--slider-->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t<div id=\"slider-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><span>E</span>-SHOPPER</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Free E-Commerce Template</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/girl1.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><span>E</span>-SHOPPER</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>100% Responsive Design</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/girl2.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><span>E</span>-SHOPPER</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Free Ecommerce Template</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/girl3.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/pricing.png\" class=\"pricing\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><!--/slider-->\n");
      out.write("\t\n");
      out.write("\t<section>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-sm-9 padding-right\">\n");
      out.write("\t\t\t\t\t<div class=\"features_items\"><!--features_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">Danh sách sản phẩm</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/product1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2>100.000 VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"overlay-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>100.000 VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                    <img src=\"images/home/new.png\" class=\"new\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"choose\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-plus-square\"></i>Chi tiết</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Thêm vào so sánh</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/product1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2>100.000 VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"overlay-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>100.000 VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                    <img src=\"images/home/sale.png\" class=\"new\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"choose\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-plus-square\"></i>Chi tiết</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Thêm vào so sánh</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div><!--features_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"category-tab\"><!--category-tab-->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#tshirt\" data-toggle=\"tab\">T-Shirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#blazers\" data-toggle=\"tab\">Blazers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#sunglass\" data-toggle=\"tab\">Sunglass</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#kids\" data-toggle=\"tab\">Kids</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#poloshirt\" data-toggle=\"tab\">Polo shirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade active in\" id=\"tshirt\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"blazers\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"sunglass\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"kids\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"poloshirt\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/category-tab-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"recommended_items\"><!--recommended_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">Sản phẩm hot</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"recommended-item-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item active\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>100.000 VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t <a class=\"left recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t\t  <a class=\"right recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t  </a>\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/recommended_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t");
      if (_jspx_meth_c_import_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.el.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.el.core.ImportTag) _jspx_tagPool_c_import_url_charEncoding_nobody.get(org.apache.taglibs.standard.tag.el.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("header.html");
    _jspx_th_c_import_0.setCharEncoding("utf-8");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_charEncoding_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.el.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.el.core.ImportTag) _jspx_tagPool_c_import_url_charEncoding_nobody.get(org.apache.taglibs.standard.tag.el.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setUrl("left.html");
    _jspx_th_c_import_1.setCharEncoding("utf-8");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url_charEncoding_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.el.core.ImportTag _jspx_th_c_import_2 = (org.apache.taglibs.standard.tag.el.core.ImportTag) _jspx_tagPool_c_import_url_charEncoding_nobody.get(org.apache.taglibs.standard.tag.el.core.ImportTag.class);
    _jspx_th_c_import_2.setPageContext(_jspx_page_context);
    _jspx_th_c_import_2.setParent(null);
    _jspx_th_c_import_2.setUrl("footer.html");
    _jspx_th_c_import_2.setCharEncoding("utf-8");
    int[] _jspx_push_body_count_c_import_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_2 = _jspx_th_c_import_2.doStartTag();
      if (_jspx_th_c_import_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_2.doFinally();
      _jspx_tagPool_c_import_url_charEncoding_nobody.reuse(_jspx_th_c_import_2);
    }
    return false;
  }
}
