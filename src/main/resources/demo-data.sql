-- Dados fictícios da versão de demonstração (perfil "demo")

INSERT INTO vaga (nome, descricao, data, salario) VALUES
('Desenvolvedor Java Júnior', 'Desenvolvimento de APIs REST com Spring Boot e PostgreSQL.', '2026-12-31', '4500'),
('Analista de Suporte', 'Atendimento a usuários, instalação de software e manutenção de computadores.', '2026-12-15', '3200'),
('Assistente de RH', 'Apoio aos processos de recrutamento e controle de documentos.', '2027-01-20', '2800');

INSERT INTO candidato (rg, nome_candidato, email, vaga_codigo) VALUES
('1234567', 'Ana Souza', 'ana.souza@exemplo.com', 1),
('2345678', 'Bruno Lima', 'bruno.lima@exemplo.com', 1),
('3456789', 'Carla Mendes', 'carla.mendes@exemplo.com', 2),
('4567890', 'Diego Rocha', 'diego.rocha@exemplo.com', 3);

INSERT INTO funcionario (nome, data, email) VALUES
('Eduardo Pires', '1990-03-12', 'eduardo.pires@exemplo.com'),
('Fernanda Costa', '1988-07-25', 'fernanda.costa@exemplo.com'),
('Gustavo Nunes', '1995-11-02', 'gustavo.nunes@exemplo.com');

INSERT INTO dependente (cpf, nome, datanascimento, funcionario_id) VALUES
('111.111.111-11', 'Helena Pires', '2018-05-09', 1),
('222.222.222-22', 'Igor Costa', '2015-09-30', 2),
('333.333.333-33', 'Júlia Costa', '2019-01-14', 2);
