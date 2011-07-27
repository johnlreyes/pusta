<#macro layout>
	<!DOCTYPE html>
	<html lang="en">
	<head>
		<#include "head.ftl" />
	</head>
	<body>
		<#include "header.ftl" />
		<div id="page">
			<div id="content">
				<#nested />
			</div>
			<#include "sidebar.ftl" />
		</div>
		<#include "footer.ftl" />
	</body>
	</html>
</#macro>
