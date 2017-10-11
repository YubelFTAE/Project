package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>Chi tiết sản phẩm</title>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->       \r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head><!--/head-->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-9 padding-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"product-details\"><!--product-details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-details/1.jpg\" alt=\"\" />\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<h3>ZOOM</h3>-->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"similar-product\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t  <!-- Wrapper for slides -->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t    <div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar1.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar2.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar1.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar2.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar1.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar2.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"images/product-details/similar3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  <!-- Controls -->\r\n");
      out.write("\t\t\t\t\t\t\t\t  <a class=\"left item-control\" href=\"#similar-product\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <a class=\"right item-control\" href=\"#similar-product\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-information\"><!--/product-information-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-details/new.jpg\" class=\"newarrival\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Anne Klein Sleeveless Colorblock Scuba</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Web ID: 1089772</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-details/rating.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("                                                                    <span>100.000VNĐ</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Số lượng:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"3\" />\r\n");
      out.write("                                                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-fefault cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tThêm vào giỏ\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><b>Số lượng còn lại:</b> 30</p>\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<p><b>Condition:</b> New</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><b>Brand:</b> E-SHOPPER</p>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><img src=\"images/product-details/share.png\" class=\"share img-responsive\"  alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div><!--/product-information-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--/product-details-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"category-tab shop-details-tab\"><!--category-tab-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#details\" data-toggle=\"tab\">Chi tiết</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#reviews\" data-toggle=\"tab\">Đánh giá</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"details\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"companyprofile\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"tag\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade active in\" id=\"reviews\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-user\"></i>NhatNH</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-clock-o\"></i>12:41 PM</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-calendar-o\"></i>31 DEC 2014</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><b>Viết đánh giá của bạn</b></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your Name\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" placeholder=\"Email Address\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea name=\"\" ></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Rating: </b> <img src=\"images/product-details/rating.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tGửi\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--/category-tab-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"recommended_items\"><!--recommended_items-->\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">sản phẩm liên quan</h2>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div id=\"recommended-item-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item active\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend3.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend3.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t <a class=\"left recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t  </a>\r\n");
      out.write("\t\t\t\t\t\t\t  <a class=\"right recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t  </a>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--/recommended_items-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_import_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/price-range.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
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
