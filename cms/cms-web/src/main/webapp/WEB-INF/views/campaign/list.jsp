<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Campaign List</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css" type="text/css">
</head>
<body>
    <h1>Campaign List</h1>
    <hr />
    <div id="campaignList">
       	<table>
       		<tr>
       			<th>画像</th>
       			<th>キャンペーンタイトル</th>
       			<th>期間</th>
       		</tr>
            <c:forEach items="${campaigns}" var="campaign">
            	<tr>
            		<td><img class="list" src="${pageContext.request.contextPath}/${f:h(campaign.mainImageUrl)}" /></td>
            		<td><a href="${pageContext.request.contextPath}/campaign/detail?contentsId=${f:h(campaign.contentsId)}" >${f:h(campaign.title)}</a></td>
            		<td><fmt:formatDate value="${campaign.campaignStart}" pattern="yyyy年MM月dd日"/>～<fmt:formatDate value="${campaign.campaignEnd}" pattern="yyyy年MM月dd日"/></td>
            	</tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
