<#import "template/layout.ftl" as layout>
<@layout.layout>
	<div class="post">
		<h2 class="title">Your Combination:</h2>
		<div class="entry">
			<h3>6/42</h3>
			<table>
				<tr>
					<td>
						<label for="no1">#1</label>
					</td>
					<td>
						<label for="no2">#2</label>
					</td>
					<td>
						<label for="no3">#3</label>
					</td>
					<td>
						<label for="no4">#4</label>
					</td>
					<td>
						<label for="no5">#5</label>
					</td>
					<td>
						<label for="no6">#6</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" id="no1" name="no2" size="5" maxlength="2" />
					</td>
					<td>
						<input type="text" id="no2" name="no2" size="5" maxlength="2" />
					</td>
					<td>
						<input type="text" id="no3" name="no3" size="5" maxlength="2" />
					</td>
					<td>
						<input type="text" id="no4" name="no4" size="5" maxlength="2" />
					</td>
					<td>
						<input type="text" id="no5" name="no5" size="5" maxlength="2" />
					</td>
					<td>
						<input type="text" id="no6" name="no6" size="5" maxlength="2" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Submit" />
					</td>
				</tr>
			</table>
		</div>
	</div>
	
	<div class="post">
		<h2 class="title">Current Date:</h2>
		<div class="entry">
			<h3>${current_date}</h3>
		</div>
	</div>
	
</@layout.layout>
