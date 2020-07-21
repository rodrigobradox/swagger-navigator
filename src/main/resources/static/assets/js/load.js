
//DEPRECATED

var Swagger = function(nome, descricao, json) {
	this.nome = nome;
	this.descricao = descricao;
	this.json = json;
}

$(document).ready(function() {
	
	var reg1 = new Swagger("Petstore 1", "API Petstore 1", "https://petstore.swagger.io/v2/swagger.json");
	var reg2 = new Swagger("Petstore 2", "API Petstore 2", "https://petstore.swagger.io/v2/swagger.json");
	var reg3 = new Swagger("Petstore 3", "API Petstore 3", "https://petstore.swagger.io/v2/swagger.json");
	
	var swaggers = [];
	swaggers.push(reg1);
	swaggers.push(reg2);
	swaggers.push(reg3);

	//
	for (i = 0; i < swaggers.length; i++) {
		$('.table').children('tbody').append('<tr>'
							  + '  <td>'+ swaggers[i].nome +'</td>'
							  + '  <td>'+ swaggers[i].descricao +'</td>'
							  + '  <td><a href="'+ swaggers[i].json +'">'+ swaggers[i].json +'</a></td>'
							  + '  <td width="120px"><a class="btn btn-swagger btn-block btn-sm" href="/swagger-ui/V2.2.8/index.html?json='+ swaggers[i].json +'"><i class="fas fa-book-open mr-2"></i>2.2.8</a></td>'
							  + '  <td width="120px"><a class="btn btn-swagger btn-block btn-sm" href="/swagger-ui/V3.0.3/index.html?json='+ swaggers[i].json +'"><i class="fas fa-book-open mr-2"></i>3.0.3</a></td>'							
						      + '</tr>');	
	}
	
});