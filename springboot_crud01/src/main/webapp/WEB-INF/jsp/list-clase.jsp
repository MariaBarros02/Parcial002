<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-clase">Adicionar Clase</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>Lista de Clases</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="40%">Nombre</th>
						<th width="40%">Horario</th>
						<th width="20%">Docente</th>
						<th width="20%">Salón</th>
						<th width="20%">Estado</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clase}" var="clase">
						<tr>
							<td>${clase.nombre}</td>
							<td>${clase.horario}</td>
							<td>${clase.nombreDocente}</td>
							<td>${clase.salon}</td>
							<td>${clase.estado}</td>
							<td><a type="button" class="btn btn-success"
								href="/update-todo?id=${clase.id}">Actualizar</a>
							<a type="button" class="btn btn-warning"
								href="/delete-todo?id=${clase.id}">Eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jsp"%>