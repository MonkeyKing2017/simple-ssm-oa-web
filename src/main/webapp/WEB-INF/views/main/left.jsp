<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="oau" uri="http://www.shuiliangdong.com/jsp/jstl/oautil" %>
<script>
    var obj = '${result}';
    console.log(obj);
</script>
<oau:drawMenu leftMenuMO="${result}" baseUrl="${basePath}"></oau:drawMenu>

