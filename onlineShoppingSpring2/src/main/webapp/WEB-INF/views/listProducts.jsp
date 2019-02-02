<input type="text" ${disabled == 'true' ? 'disabled="disabled"' : ''} />
<div class="container">

	<div class="row">

		<!-- Would be to display Side Bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- to display actuall products -->
		<div class="col-md-9">

			<!-- Added BreadCrumb Component -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name} </li>
						</ol>
					</c:if>
				</div>
			</div>

		</div>
	</div>
</div>