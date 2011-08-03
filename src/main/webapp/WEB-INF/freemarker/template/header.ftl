<header>
	<hgroup id="logo">
		<h1><a href="#">Pusta</a></h1>
		<h2>hmmmmmmm</h2>
	</hgroup>
	<nav id="menu">
		<ul>
			<li class="first">
                <a href="home" accesskey="2" title="home">
                    <#if menuState.home>
                        <div style="color:green">Home</div>
                    <#else>
                        Home
                    </#if>
                </a>
            </li>
			<li>
                <a href="login" accesskey="2" title="login">
                    <#if menuState.login>
                        <div style="color:green">Login</div>
                    <#else>
                        Login
                    </#if>
                </a>
            </li>
			<li>
                <a href="main" accesskey="2" title="main">
                    <#if menuState.main>
                        <div style="color:green">Main</div>
                    <#else>
                        Main
                    </#if>
                </a>
            </li>
		</u>
	</nav>
	<hr />
	<div id="separator" />
</header>
