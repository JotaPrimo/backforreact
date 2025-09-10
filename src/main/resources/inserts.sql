-- Perfis
INSERT INTO perfis (id, cargo, departamento, ativo) VALUES
                                                        (1, 'Administrador', 'TI', true),
                                                        (2, 'Usuário Padrão', 'Financeiro', true),
                                                        (3, 'Estagiário', 'Marketing', false);

-- Usuários (referenciando perfis)
INSERT INTO usuarios (id, nome, email, perfil_id) VALUES
                                                      (1, 'Jailson Ferreira', 'jailson@email.com', 1),
                                                      (2, 'Maria Oliveira', 'maria@email.com', 2),
                                                      (3, 'Carlos Silva', 'carlos@email.com', 3);

-- Postagens (relacionadas a usuários)
INSERT INTO postagens (id, titulo, conteudo, usuario_id, ativo) VALUES
                                                                    (1, 'Primeiro Post', 'Bem-vindo ao sistema!', 1, true),
                                                                    (2, 'Dicas de React', 'Vamos falar sobre hooks...', 1, true),
                                                                    (3, 'Relatório Financeiro', 'Resumo do mês de Agosto', 2, true),
                                                                    (4, 'Campanha de Marketing', 'Planejamento Q4', 3, false);


-- Perfis extras
INSERT INTO perfis (id, cargo, departamento, ativo) VALUES
                                                        (4, 'Gerente', 'Vendas', true),
                                                        (5, 'Analista', 'RH', true),
                                                        (6, 'Suporte', 'Atendimento', false);

-- Usuários extras (com novos perfis)
INSERT INTO usuarios (id, nome, email, perfil_id) VALUES
                                                      (4, 'Ana Costa', 'ana.costa@email.com', 4),
                                                      (5, 'Bruno Souza', 'bruno.souza@email.com', 5),
                                                      (6, 'Fernanda Lima', 'fernanda.lima@email.com', 6);

-- Postagens extras (para novos usuários e antigos)
INSERT INTO postagens (id, titulo, conteudo, usuario_id, ativo) VALUES
                                                                    (5, 'Estratégias de Vendas', 'Como aumentar o ticket médio.', 4, true),
                                                                    (6, 'Treinamento RH', 'Plano de desenvolvimento de carreira.', 5, true),
                                                                    (7, 'Atendimento ao Cliente', 'Melhoria no suporte técnico.', 6, false),
                                                                    (8, 'Atualização de Sistema', 'Versão 2.0 liberada.', 1, true),
                                                                    (9, 'Dicas de Estudo', 'Organize seu tempo para aprender React.', 2, true),
                                                                    (10, 'Campanha Publicitária', 'Nova campanha de Natal.', 3, true);

