<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>更新信息</title>
    <link href="<%=basePath%>assets/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="<%=basePath%>assets/plugins/bootstrap-3.3.7-dist/css/bootstrap-table.min.css" rel="stylesheet" type="text/css">
    <script src="<%=basePath%>assets/plugins/jquery-1.10.2.min.js"></script>
    <script src="<%=basePath%>assets/plugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>assets/plugins/bootstrap-3.3.7-dist/js/bootstrap-table.min.js"></script>
    <script>
    var base = '<%=basePath%>';
    </script>
</head>
<body>
<div class="panel-body" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">
            <form id="formSearch" class="form-horizontal">
                <div class="form-group" style="margin-top:15px">
                    <label class="control-label col-sm-1" for="txt_search_departmentname">员工姓名</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="name">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_statu">员工年龄</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="age">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_departmentname">员工身份证号</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="idCard">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_statu">状态</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="status">
                    </div>
                    
                    <label class="control-label col-sm-1" for="txt_search_departmentname">入职时间</label>
                    <div class="col-sm-3">
                        <input type="datetime-local" class="form-control" id="joinDate">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_statu">离职时间</label>
                    <div class="col-sm-3">
                        <input type="datetime-local" class="form-control" id="leaveDate">
                    </div>
                    <div class="col-sm-4" style="text-align:left;">
                        <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">上传更新
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
	$('#btn_query').click(function(){
		var name = $('#name').val();
		var age = $('#age').val();
		var idCard = $('#idCard').val();
		var status = $('#status').val();
		var joinDate = new Date($('#joinDate').val());
		var leaveDate = new Date($('#leaveDate').val());
		var urlStr = base+"/employee/updateData";
		$.ajax({
			type: "POST",
	        dataType: 'text',
	        data:{
	        	name:name,
	        	age:age,
	        	idCard:idCard,
	        	status:status,
	        	joinDate:joinDate,
	        	leaveDate:leaveDate
	        },
	        url: urlStr,
	        
	        success: function(data) {
	        	if(data == 'success'){
	        		alert("更新成功");//TODO 页面跳转
	        	}else{
	        		alert("更新失败");
	        	}
	        }
		});
	})
</script>
</html>
