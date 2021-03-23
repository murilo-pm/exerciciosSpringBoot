SELECT * FROM farmacia.tb_produto;
SELECT * FROM farmacia.tb_categoria;

insert tb_produto(nome, laboratorio_orgao, peso, preco, comprimidos) values("cloridrato de nortriptilina", "novartis", 25, 15.70, 20);
insert tb_produto(nome, laboratorio_orgao, peso, preco, comprimidos) values("cloridrato de amitriptilina", "anvisa", 25, 14.50, 20);
insert tb_produto(nome, laboratorio_orgao, peso, preco, comprimidos) values("hemifumarato de quetiapina", "anvisa", 25, 20.99, 30);
insert tb_produto(nome, laboratorio_orgao, peso, preco, comprimidos) values("cloridrato de loperamida", "janssen cilag", 2, 3.99, 12);
insert tb_produto(nome, laboratorio_orgao, peso, preco, comprimidos) values("doril", "cosmed", 530, 7.49, 6);

insert tb_categoria(original, generico, retencao_receita, descricao) values(1,0,1, "exija a receita"); -- 1
insert tb_categoria(original, generico, retencao_receita, descricao) values(0,1,1, "exija a receita"); -- 2
insert tb_categoria(original, generico, retencao_receita, descricao) values(0,1,0, "não é necessário receita médica"); -- 3
insert tb_categoria(original, generico, retencao_receita, descricao) values(1,0,0, "não é necessário receita médica"); -- 4