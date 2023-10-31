<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Adicionar Clase</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="clase">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="nombre">Nombre: </form:label>
							<form:input path="nombre" type="text" class="form-control"
								required="required" />
							<form:errors path="nombre" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="horario">Horario: </form:label>
							<form:input path="horario" type="number" class="form-control"
								required="required" />
							<form:errors path="horarDocentesClass=" text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="nombreDocente">Docente: </form:label>
							<form:input path="nombreDocente" type="text" class="form-control"
								required="required" />
							<form:errors path="nombreDocente" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="salon">Salon: </form:label>
							<form:input path="salon" type="text" class="form-control"
								required="required" />
							<form:errors path="salon" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="estado">Estado: </form:label>
							<select name="salon" class="form-control" required="required">
								<option value="programada">Programada</option>
								<option value="en curso">En Curso</option>
								<option value="cancelada">Cancelada</option>
								<option value="aplazada">Aplazada</option>
							</select>

							<form:errors path="salon" cssClass="text-warning" />
						</fieldset>



						<button type="submit" class="btn btn-success">Guardar</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>