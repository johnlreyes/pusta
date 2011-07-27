<#import "template/layout.ftl" as layout>
<@layout.layout>
	<div class="post">
		<h2 class="title">Register:</h2>
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
						<label for="password_v">Password Verify: </label>
						<input type="password" id="password_v" name="password_v" size="50" maxlength="20" />
					</td>					
				</tr>
				<tr>
					<td>
						<input type="submit" value="Send Activation Link" />
					</td>
				</tr>
			</table>
			</form>
		</div>
	</div>		
</@layout.layout>
