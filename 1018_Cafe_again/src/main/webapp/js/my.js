$(document).ready(function(){
	$("#memberInsertBtn").click(function(){
		let name = $("#name").val();
		let id = $("#id").val();
		let pw = $("#pw").val();
		
//		$.get(url,data,function);
		$.get("../memberInsert.shop",{name,id,pw},function(data){
			alert(data);
			window.close();
		});
	})
});