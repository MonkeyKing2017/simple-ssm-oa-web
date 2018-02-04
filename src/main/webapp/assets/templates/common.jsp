<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    String baseResources = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/assets";
    // 设置资源路径
    request.setAttribute("basePath",basePath);
    // 设置资源路径
    request.setAttribute("baseResources",baseResources);
%>
<script>
    var base = '${base}';
</script>
