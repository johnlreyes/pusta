<#import "template/layout.ftl" as layout>
<@layout.layout>
	<div class="post">
		<h2 class="title">Login:</h2>
		<div class="entry">
			<form>
			<table>
				<tr>
					<td>
						<label for="email">Email: </label>
						<input type="text" id="email" name="email" size="50" maxlength="20" />
					</td>
				</tr>
				<tr>
					<td>
						<label for="password">Password: </label>
						<input type="password" id="password" name="password" size="50" maxlength="20" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Login" />
					</td>
				</tr>
			</table>
			</form>
		</div>
	</div>		
</@layout.layout>
