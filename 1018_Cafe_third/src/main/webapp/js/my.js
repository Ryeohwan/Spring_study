$(document).ready(function(){
	$("#memberInsertBtn").click(function(){//회원 가입 처리
	
		let name=$("#name").val();
		let id=$("#id").val();
		let pw=$("#pw").val();
		
		//alert(name+":"+id+":"+pw);
		
		$.post("../memberInsert.shop",{name,id,pw},function(data, status){
			alert( data);
			window.close();
			});
	});
});

$("#loginBtn").click(function(){//로그인 처리	
	
	var id=$("#id").val();
	var pw=$("#pw").val();
	
	//alert(id+":"+pw);		
	
	$.post("login.shop",
		  {			   
		    id:id,
		    pw:pw
		  },
		  function(data, status){	
		  var obj=JSON.parse(data);			  
		  	if(obj.name){
		  		data = obj.name+"<input type='button' value='logout' id='logoutBtn' class='btn btn-primary'>";	
		  		$.cookie("logined",data);	    
				$("#msgDiv").html(data );		
			}else{
				alert(obj.msg);
				location.reload();	
			}				   
		  }//end function
	);//end post() 
});//end 로그인 처리




$(document).on("click", "#logoutBtn", function(event) { //로그아웃 처리
	
	$.post("logout.shop",
		  {			   
		   
		  },
		  function(data, status){		  	
		  	
		  	$.removeCookie("logined");	    
			location.reload();						   
		  }
	);//end post() 
	
});
