<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="../css/shopping_vehicle.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="https://code.jquery.com/jquery.js"></script>
	</head>
	<body>
		<br />
		<br />
		<div class="my_shopping">
			<img class="pic_shop" src="../images/pic_myshopping.gif" />

		</div>
		<div id="div_choice" class="choice_merch">
			<h2 id="cart_tips">
				您已选购以下商品
			</h2>
			<div class="choice_bord">
				<table class="tabl_buy" id="tbCartItemsNormal">
					<tr class="tabl_buy_title">
						<td class="buy_td_6">
							<span>&nbsp;</span>
						</td>
						<td>
							<span class="span_w1">商品名</span>
						</td>
						<td class="buy_td_5">
							<span class="span_w2">市场价</span>
						</td>
						<td class="buy_td_4">
							<span class="span_w3">当当价</span>
						</td>
						<td class="buy_td_1">
							<span class="span_w2">数量</span>
						</td>
						<td class="buy_td_2">
							<span>变更数量</span>
						</td>
						<td class="buy_td_1">
							<span>删除</span>
						</td>
					</tr>
					<tr class='objhide' over="no">
						<td colspan="8">
							&nbsp;
						</td>
					</tr>
					
                      <!-- 购物列表开始 -->
						<!-- <tr class='td_no_bord'>
							<td style='display: none'>
								9317290
							</td>
							<td class="buy_td_6">
								<span class="objhide"><img /> </span>
							</td>
							<td> 
								<a href="#">Java框架大全</a>
							</td>
							<td class="buy_td_5">
								<span class="c_gray">180</span>
							</td>
							<td class="buy_td_4">
								&nbsp;&nbsp;
								<span>￥35</span>
							</td>
							<td class="buy_td_1">
								&nbsp;&nbsp;100
							</td>

							<td >
								<input class="del_num" type="text" size="3" maxlength="4"/>
								<a href="#">变更</a>
							</td>
							<td>
								<a href="#">删除</a>
							</td>
						</tr>
						
						<tr class='td_no_bord'>
							<td style='display: none'>
								9317291
							</td>
							<td class="buy_td_6">
								<span class="objhide"><img /> </span>
							</td>
							<td>
								<a href="#">Struts2详解</a>
							</td>
							<td class="buy_td_5">
								<span class="c_gray">180</span>
							</td>
							<td class="buy_td_4">
								&nbsp;&nbsp;
								<span>￥35</span>
							</td>
							<td class="buy_td_1">
								&nbsp;&nbsp;100
							</td>

							<td >
								<input class="del_num" type="text" size="3" maxlength="4"/>
								<a href="#">变更</a>
							</td>
							<td>
								<a href="#">删除</a>
							</td>
						</tr> -->
					<!-- 购物列表结束 -->
				</table>
				<div id="div_no_choice" class="objhide">
					<div class="choice_title"></div>
					<div class="no_select">
						您还没有挑选商品
					</div>
				</div>
				<div class="choice_balance">
					<div class="select_merch">
						<a href='../main/main.jsp'> 继续挑选商品>></a>
					</div>
					<div class="total_balance">
						<div class="save_total">
							您共节省：
							<span class="c_red"> ￥<span id="total_economy"></span>
							</span>
							<span id='total_vip_economy' class='objhide'> ( 其中享有优惠： <span
								class="c_red"> ￥<span id='span_vip_economy'>0.00</span> </span>
								) </span>
							<span style="font-size: 14px">|</span>
							<span class="t_add">商品金额总计：</span>
							<span class="c_red_b"> ￥<span id='total_account'></span>
							</span>
						</div>
						<div id="balance" class="balance">
							<a name='checkout' href='../order/order_info.jsp' > 
								<img src="../images/butt_balance.gif" alt="结算" border="0" title="结算" />
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- 用户删除恢复区 -->


		<div id="divCartItemsRemoved" class="del_merch">
			<div class="del_title">
				您已删除以下商品，如果想重新购买，请点击“恢复”
			</div>
			<table class=tabl_del id=del_table>
				<tbody>


					<tr>
						<td width="58" class=buy_td_6>
							&nbsp;
						</td>
						<td width="365" class=t2>
							<a href="#">Java基础</a>
						</td>
						<td width="106" class=buy_td_5>
							￥56
						</td>
						<td width="134" class=buy_td_4>
							<span>￥50</span>
						</td>
						<td width="56" class=buy_td_1>
							<a href="#">恢复</a>
						</td>
						<td width="16" class=objhide>
							&nbsp;
						</td>
					</tr>



					<tr class=td_add_bord>
						<td colspan=8>
							&nbsp;
						</td>
					</tr>


				</tbody>
			</table>
		</div>
		<br />
		<br />
		<br />
		<br />
		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
		<script type="text/javascript">
		$(function(){
		$.ajax({
	//	alert(123);
		type:'get',
		url:'/dangdang/shop_car.do',
		success:function(response){
		if(response.result==2){
		alert(response.message);
		top.location="/dangdang/user/login_form.jsp";
		};
		if(response.result==0){
		alert(response.message);
		};
		if(response.result==1){
		 for(var i=0;i<response.data.length;i++){
			str="<tr class='td_no_bord'><td style='display: none'>";
			str+=response.data[i].id;
			str+="</td>";
			str+="<td class='buy_td_6'><span class='objhide'><img /> </span></td>"
			str+="<td>"+"<a href='#''>"+response.data[i].productName+"</a></td>";
			str+="<td class='buy_td_5'>"+"<span class='c_gray'style='text-decoration:line-through;'>"+response.data[i].fixedPrice*response.data[i].productNum+"</span></td>";
			str+="<td class='buy_td_4'>&nbsp;&nbsp;<span>"+response.data[i].dangPrice*response.data[i].productNum+"</span></td>"
			str+="<td class='buy_td_1'>&nbsp;&nbsp;"+response.data[i].productNum+"</td>";
			str+="<td ><input class='del_num' type='text' size='3' maxlength='4'/>"+"<a href='#'class='change_num' id='"+response.data[i].id+"'>变更</a></td>";
			str+="<td><a href='javascript:void(0)' id='"+response.data[i].id+"' class='del-btn'>删除</a></td>";
			str+="</tr>";				
			$("#tbCartItemsNormal").append(str);
			};
			$economy=0;
			$total=0;
			//alert($economy)
			for(var  j=0;j<response.data.length;j++){
			$economy+=(response.data[j].fixedPrice)*response.data[j].productNum-(response.data[j].dangPrice)*response.data[j].productNum;
			$total+=(response.data[j].dangPrice)*response.data[j].productNum;
		/* 	alert($economy); */
			};
			$("#total_economy").html($economy);
			$("#total_account").html($total);
			
		};
		},
		async:false
		});
		$(".del-btn").click(function(){
		$id=$(this).attr("id");
		$.ajax({
		type:'post',
		url:'/dangdang/delete/item/'+$id+'.do',
		success:function(response){
		alert(response.message);
		top.location="/dangdang/cart/cart_list.jsp";
		},
		async:false
		});
		
		});
		$(".change_num").click(function(){
		$id=$(this).attr("id");
		$input=$(this).parent().children("input")[0];
		var input1=$input;
		var num=input1.value;
		$num1=num;
		 $.ajax({
		type:'post',
		url:'/dangdang/change/item.do',
		data:{
		itemId:$id,
		num:$num1
		},
		success:function(response){
		alert(response.message);
		if(response.result==1){
		
		top.location="/dangdang/cart/cart_list.jsp";
		};
		},
		async:false
		});
		});
	});
		</script>
	</body>
</html>



