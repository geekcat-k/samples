<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>キャンペーン</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css" type="text/css">
</head>
<body>
    <h1>${f:h(campaign.title)}</h1>
    <hr />
    <div id="campaignDetail">
    	<img src="${pageContext.request.contextPath}/${f:h(campaign.mainImageUrl)}" />
       	<table>
           	<tr>
           		<th>期間</th>
           		<td><fmt:formatDate value="${campaign.campaignStart}" pattern="yyyy年MM月dd日"/>～
           		    <fmt:formatDate value="${campaign.campaignEnd}" pattern="yyyy年MM月dd日"/></td>
           	</tr>
       		<tr>
       			<th>詳細</th>
           		<td>${f:h(campaign.introductionText)}</td>
       		</tr>
       		<tr>
       			<th>注意事項</th>
           		<td>${f:h(campaign.caution)}</td>
       		</tr>
       		<tr>
           		<td colspan="2"><a href="${f:h(campaign.entryUrl)}" >お申し込みはこちら</a></td>
       		</tr>
        </table>
    </div>
</body>
</html>
