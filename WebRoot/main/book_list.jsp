<%@page import="org.springframework.web.context.annotation.SessionScope"%>
<%@page import="java.util.List"%>
<%@page import="entity.vo.BookDetailVo"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<script type="text/javascript" src="../js/prototype-1.6.0.3.js">
		</script>
		<script type="text/javascript" src="https://code.jquery.com/jquery.js">

</script>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="../css/list.css" rel="stylesheet" type="text/css" />
		
	</head>
	
	<body>
		&nbsp;

		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->

		<div style="width: 962px; margin: auto;">
			<a href="#"><img src="../images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>
		<div class='your_position'>
			您现在的位置:&nbsp;
			<a href='#'>当当图书</a> &gt;&gt;
			<font style='color: #cc3300'><strong>小说</strong> </font>
		</div>

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
				<div id="__fenleiliulan">
					<div class=second_l_border2>
						<h2>
							分类浏览
						</h2>
						<ul>
							<li>
								<div>
									<div class=second_fenlei>
										&middot;全部&nbsp;(23)
									</div>
								</div>
							</li>
							<div class="clear"></div>
							
							<!--2级分类开始-->
							<li>
								<div>
									<div class=second_fenlei>
										&middot;
									</div>
									<div class=second_fenlei>
										<a href="#">武侠小说&nbsp;(10)</a>
									</div>
								</div>
							</li>
						    <div class="clear"></div>
							<li>
								<div>
									<div class=second_fenlei>
										&middot;
									</div>
									<div class=second_fenlei3>
										<a href="#">近现在小说&nbsp;(8)</a>
									</div>
								</div>
							</li>
							<div class="clear"></div>
							<li>
								<div>
									<div class=second_fenlei>
											&middot;
									</div>
									<div class=second_fenlei>
										<a href="#">四大名著&nbsp;(5)</a>
									</div>
								</div>
							</li>
							<div class="clear"></div>
							<!--2级分类结束-->
							
							<li>
								<div></div>
							</li>
						</ul>
					</div>
				</div>
			</div>

			<!--左栏结束-->

			<!--中栏开始-->
			<div class="book_center">

				<!--图书列表开始-->
				<div id="divRight" class="list_right">

					<div id="book_list" class="list_r_title">
						<div class="list_r_title_text">
							排序方式
						</div>
						<select onchange='' name='select_order' size='1'
							class='list_r_title_ml'>
							<option value="">
								按上架时间 降序
							</option>
						</select>
						<div id="divTopPageNavi" class="list_r_title_text3">

							<!--分页导航开始-->
							</div>
							<%
							int currentPage=(Integer)session.getAttribute("currentPage");
							int nextPage=currentPage;
							nextPage++;
							int prePage=currentPage;
							prePage--;
							 %>
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href='/dangdang/list/book/page/<%=prePage %>.do'>
								<img src='../images/page_up.gif' /> </a>
							</div>
	
							<div class='list_r_title_text3a'>
								<img src='../images/page_up_gray.gif' />
							</div>
				
							<div class='list_r_title_text3b'>
								第${sessionScope.currentPage}页/共${sessionScope.totalPage}页
							
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href='/dangdang/list/book/page/<%=nextPage %>.do'>
									<img src='../images/page_down.gif' /> </a>
							</div>
			
							<div class='list_r_title_text3a'>
								<img src='../images/page_down_gray.gif' />
							</div>

							<!--分页导航结束-->
						</div>
					</div>
					
					<!--商品条目开始-->
						
						<div class="list_r_line"></div>
						<div class="clear"></div>

						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href='#'>
								<img src="../productImages/1.jpg" /> </a> </span>
							<h2>
								<a name="link_prd_name" " href='#'>${sessionScope.bookVo[0].ddProduct.productName}</a>
							</h2>
							<h3>
								顾客评分：100
							</h3>
							<h4 class="list_r_list_h4">
								作 者:
								<a href='#' name='作者'>${sessionScope.bookVo[0].ddBook.author}</a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'>${sessionScope.bookVo[0].ddBook.publishing}</a>
							</h4>
							<h4>
							<%
							List<BookDetailVo> books=(List<BookDetailVo>)session.getAttribute("bookVo");
							long date=books.get(0).getDdBook().getPrintTime();
							long date2=books.get(1).getDdBook().getPrintTime();
							long date3=books.get(2).getDdBook().getPrintTime();
							 %>
								出版时间：<%=new Date(date) %>
							</h4>
							<h5>
							${sessionScope.bookVo[0].ddBook.catalogue}
							</h5>
							<div class="clear"></div>
							<h6>
								<span class="del">￥${sessionScope.bookVo[0].ddProduct.fixedPrice}</span>
								<span class="red">￥${sessionScope.bookVo[0].ddProduct.dangPrice}</span>
								节省：￥${sessionScope.bookVo[0].savePrice}
							</h6>
							<span class="list_r_list_button"> 
							<a id="${sessionScope.bookVo[0].ddProduct.id}"  href="javascript:void(0)"> 
							<img class="add-btn" src='../images/buttom_goumai.gif' /> </a>
							<span id="cartinfo"></span>
						</div>
						<div class="clear"></div>

						<div class="clear"></div>
						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href='#'>
								<img src="../productImages/1.jpg" /> </a> </span>
							<h2>
								<a name="link_prd_name"  href='#'>${sessionScope.bookVo[1].ddProduct.productName}</a>
							</h2>
							<h3>
								顾客评分：100
							</h3>
							<h4 class="list_r_list_h4">
								作 者:
								<a href='#' name='作者'>${sessionScope.bookVo[1].ddBook.author}</a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'>${sessionScope.bookVo[1].ddBook.publishing}</a>
							</h4>
							<h4>
								出版时间：<%=new Date(date2) %>
							</h4>
							<h5>
									${sessionScope.bookVo[1].ddBook.catalogue}
							</h5>
							<div class="clear"></div>
							<h6>
								<span class="del">￥${sessionScope.bookVo[1].ddProduct.fixedPrice}</span>
								<span class="red">￥${sessionScope.bookVo[1].ddProduct.dangPrice}</span>
								节省：￥${sessionScope.bookVo[1].savePrice}
							</h6>
							<span class="list_r_list_button"> 
							<a id="${sessionScope.bookVo[1].ddProduct.id}"  href="javascript:void(0)"> 
							<img class="add-btn" src='../images/buttom_goumai.gif' /> </a>
							<span id="cartinfo"></span>
						</div>
						<div class="clear"></div>
						
												<div class="clear"></div>
						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href='#'>
								<img src="../productImages/1.jpg" /> </a> </span>
							<h2>
								<a name="link_prd_name" href='#'>${sessionScope.bookVo[2].ddProduct.productName}</a>
							</h2>
							<h3>
								顾客评分：100
							</h3>
							<h4 class="list_r_list_h4">
								作 者:
								<a href='#' name='作者'>${sessionScope.bookVo[2].ddBook.author}</a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'>${sessionScope.bookVo[2].ddBook.publishing}</a>
							</h4>
							<h4>
								出版时间：<%=new Date(date3) %>
							</h4>
							<h5>
								${sessionScope.bookVo[2].ddBook.catalogue}
							</h5>
							<div class="clear"></div>
							<h6>
								<span class="del">￥${sessionScope.bookVo[2].ddProduct.fixedPrice}</span>
								<span class="red">￥${sessionScope.bookVo[2].ddProduct.dangPrice}</span>
								节省：￥${sessionScope.bookVo[2].savePrice}
							</h6>
							<span class="list_r_list_button"> 
							<a id="${sessionScope.bookVo[2].ddProduct.id}"  href="javascript:void(0)"> 
							<img class="add-btn" src='../images/buttom_goumai.gif' /> </a>
							<span id="cartinfo"></span>
						</div>
						<div class="clear"></div>
					
						<!--商品条目结束-->

					<div class="clear"></div>
					<div id="divBottomPageNavi" class="fanye_bottom">
					</div>

				</div>
				<!--图书列表结束-->

			</div>
			<!--中栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
	<script type="text/javascript">
	
	$(function(){
	$(".add-btn").click(function(){
		var btn=$(this);
		/* id=btn.parentElement.getAttribute("id"); */
		$id=$(this).parent().attr("id");
		$.ajax({
		type:'post',
		url:'/dangdang/add_book/'+$id+'.do',
		success:function(response){	
		alert(response.message);
		}
		
		});
	
		});
	});
	</script>
</html>
