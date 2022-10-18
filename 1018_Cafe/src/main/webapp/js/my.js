$(document).ready(function(){ // 이거 안한다고 큰일나지는 않는데 순서의 문제있을까봐 
	// meberInsert에 있는 js 호출이 헤드부분에 있어서 써준 것이다.
	$("#memberInsertBtn").click(function(){
		let name = $("#name").val();
		let id = $("#id").val();
		let pw = $("#pw").val();
		//alert(id+": "+pw+":  "+name);
		
		// 이렇게 버튼이 눌렸을 때 아이디로 입력받은 값들을  fetch로 보내겠다
		//$.post(url,data,function); // fetch 와 똑같다고 한다.
		$.get("../memberInsert.shop",{name,id,pw},function(data){// 여기서 {name,id,pw} 는 비구조화 할당이라고 한다.
			alert(data); // 갔다와서 라고 말씀하시는거 보니 위에서 이미 갔으니 돌아와서  alert
			window.close();
		}); // fetch를 쓰든 이런 것들은 전부 ajax 이다.
	});
	
	
	
	
	
	
	
	
});
