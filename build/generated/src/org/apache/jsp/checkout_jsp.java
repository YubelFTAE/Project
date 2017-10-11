package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Checkout | E-Shopper</title>\n");
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
      out.write("\t");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<section id=\"cart_items\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"shopper-informations\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"shopper-info\">\n");
      out.write("\t\t\t\t\t\t\t<p>Thông tin người mua hàng</p>\n");
      out.write("\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Tên người dùng\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Mật khẩu\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Xác nhận mật khẩu\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-primary\" href=\"\">Tiếp tục</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-5 clearfix\">\n");
      out.write("\t\t\t\t\t\t<div class=\"bill-to\">\n");
      out.write("\t\t\t\t\t\t\t<p>Hóa đơn đến</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-one\">\n");
      out.write("\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t    <input type=\"text\" placeholder=\"Nội dung\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Tên công ty\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Email*\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Họ tên người nhận*\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Tên khác\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-two\">\n");
      out.write("\t\t\t\t\t\t\t\t<form>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Địa chỉ nhận 1 *\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Địa chỉ nhận 2\">\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Số điện thoại *\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Số máy bàn\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>-- Chuyển phát nhanh --</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Yêu cầu</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Không</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"order-message\">\n");
      out.write("\t\t\t\t\t\t\t<p>Thêm</p>\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"message\"  placeholder=\"Ghi chú về đơn đặt hàng của bạn, Ghi chú đặc biệt cho Giao hàng\" rows=\"16\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t<label><input type=\"checkbox\">Vận chuyển đến địa chỉ hóa đơn</label>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"review-payment\">\n");
      out.write("\t\t\t\t<h2>Thông tin mặt hàng</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"table-responsive cart_info\">\n");
      out.write("\t\t\t\t<table class=\"table table-condensed\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr class=\"cart_menu\">\n");
      out.write("\t\t\t\t\t\t\t<td class=\"image\">Sản phẩm</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"description\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"price\">Giá</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"quantity\">Số lượng</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"total\">Tổng tiển</td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><img src=\"images/cart/one.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Web ID: 1089772</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_price\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>$59</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_quantity_button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_total\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\">$59</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_delete\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><img src=\"images/cart/two.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Web ID: 1089772</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_price\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>$59</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_quantity_button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_total\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\">$59</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_delete\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><img src=\"images/cart/three.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Web ID: 1089772</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_price\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>$59</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_quantity_button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_total\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\">$59</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_delete\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"4\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-condensed total-result\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Tổng giá Giỏ Hàng</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>...</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Thuế</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>...</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"shipping-cost\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Phí vận chuyển</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>...</td>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Tổng giá</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><span>...</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"payment-options\">\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t<label><input type=\"checkbox\"> Chuyển khoản trực tiếp</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t<label><input type=\"checkbox\"> Yêu cầu hóa đơn</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!--/#cart_items-->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
    _jspx_th_c_import_1.setUrl("footer.html");
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
}
