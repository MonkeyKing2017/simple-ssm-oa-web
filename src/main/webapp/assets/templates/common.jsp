<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    String baseResources = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/assets";
    request.setAttribute("baseResources",baseResources);
%>
<script>
    var base = '${base}';
    var baseResources = base + 'assets';
    console.log(baseResources);
</script>
