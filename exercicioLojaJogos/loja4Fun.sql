SELECT * FROM loja_jogos_4fun.tb_categoria;
SELECT * FROM loja_jogos_4fun.tb_produto;

use loja_jogos_4fun;

insert tb_categoria(desconto, descricao_categoria) values(1,"mídia física"); -- 1
insert tb_categoria(desconto, descricao_categoria) values(0, "mídia física"); -- 2
insert tb_categoria(desconto, descricao_categoria) values(1, "mídia digital"); -- 3
insert tb_categoria(desconto, descricao_categoria) values(0, "mídia digital"); -- 4
insert tb_categoria(desconto, descricao_categoria) values(1, "acessório"); -- 5
insert tb_categoria(desconto, descricao_categoria) values(0, "acessório"); -- 6

insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("o Xbox One S é o Xbox mais avançado que já existiu.","Console Xbox One S 1 Tera Bytes 1TB+ Controle One S Branco","12x de R$307,50 sem juros",3690.00, 4);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("design menor, economia de energia e o novo Dual Shock 4.", "Console PS4 - Modelo Slim 1TB - Preto", "12x de R$216,66 sem juros", 2599.90, 2);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("O PS4 Pro deixa o seu jogo mais perto de você.", "Console Playstation 4 PRO 1TB 4K - Sony","12x de R$280,00 sem juros", 3360.00, 2);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("Desfrute de jogos 4K a até 120 quadros por segundo, som 3D avançado especial e muito mais", "Console Xbox Series X 1TB + Controle Sem Fio - Preto","12x de R$657,50 sem juros", 7890.00, 2);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("Xbox Series S, nosso Xbox menor e mais elegante de todos os tempos.","Console Xbox Series S 500GB + Controle Sem Fio - Branco","12x de R$233,25", 2799.00,3);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("Miles deve assumir o manto do Homem-Aranha e torná-lo seu.","Jogo Marvel's Spider-Man: Miles Morales - PS5","8x de R$31,12", 249.00, 2);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("Ataque seus inimigos, amplie seu assentamento e consolide seu poder político na busca para ganhar um lugar entre os deuses de Valhalla.","Jogo Assassin's Creed Valhalla - Edição Limitada - Xbox One","8x de R$32,49",259.90, 2);
insert tb_produto(descricao_produto, nome, parcelamento, preco, categoria_id) values("É um novo começo para Kratos. ","Jogo God of War 4 - Playstation Hits - PS4","2x de R$44,95",89.90,1);



