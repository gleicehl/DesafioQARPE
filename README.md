# DesafioRPE

PLANO DE TESTES: Desafio RPE											
Objetivo:												
Testar as funcionalidades da aplicação apresentada pela empresa RPE, a fim de garantir que se obtenha sucesso na validação dos requisitos,  proporcionando aos usuários, a confiabilidade que a empresa preza.								
Escopo:											
Autenticação do sistema
Cadastro de cliente
Transações de compra									
Referências:											
Requisitos documentados pela empresa
Aplicação: http://provaqa.prc.rpe.tech:9080/desafioqa/				
Estratégia de Teste										
Tipos de Teste:									
Testes Funcionais:								
Testes de Unidade:
Testes de Login: Verificar se as funções de autenticação, como campos obrigatórios, credenciais válidas/ inválidas, visualização de senha, etc., funcionam corretamente.
Testes de Integração:
Testes de Login: Testar a interação entre componentes como o sistema de autenticação e banco de dados, incluindo recuperação e alteração de senha.
Testes de Cadastro: Testar a integração do sistema de cadastro com o banco de dados.
Testes de Inclusão de Clientes: Verificar a integração entre a inserção de clientes e o gerenciamento de saldo.
Testes de Transações: Testar a interação entre a funcionalidade de transação e o banco de dados para atualizar saldos corretamente.
Testes de Integração (Específicos): Testar integração entre login e cadastro, cadastro e inclusão de clientes, login e recuperação de senha.
Testes de Sistema:
Testes de Login: Testar o sistema como um todo para garantir que ele atenda aos requisitos especificados, como a exibição correta de mensagens de erro e acesso concedido.
Testes de Cadastro: Testar o sistema de cadastro como um todo para garantir que ele funcione conforme esperado.
Testes de Inclusão de Clientes: Testar todo o fluxo de inserção de clientes, incluindo validação de CPF e saldo.
Testes de Transações: Testar o sistema de transações como um todo, incluindo a verificação de saldo após transações.
Testes de Aceitação:
Testes de Aceitação: Validar se a aplicação atende aos requisitos propostos para todas as funcionalidades principais, como autenticação, cadastro, inclusão de clientes e transações.
ii. Testes Não Funcionais:
Testes de Usabilidade:
Testes de Usabilidade (geral): Avaliar a experiência do usuário com a interface, incluindo navegação, visualização de listas, filtragem, organização da interface, responsividade, etc.
Testes de Desempenho:
Tempo de transação: Averiguar o tempo necessário para completar uma transação.
Verificação do limite de cadastros: Testar a performance ao atingir o limite de cadastros suportados.
Suporte a usuários simultâneos: Verificar a capacidade do sistema para suportar múltiplos usuários simultâneos.
Suporte a transações simultâneas: Verificar quantas transações simultâneas o sistema pode suportar.
Suporte a logins simultâneos: Verificar a capacidade do sistema para suportar múltiplos logins simultâneos.
Tempo em execução: Verificar a estabilidade da aplicação após longos períodos de execução.
Stress Test: Testar a aplicação sob condições extremas de carga.
Testes de Segurança:
Login com SQL Injection: Verificar a proteção contra ataques de SQL Injection.
Verificação de HTTPS: Garantir que a aplicação usa HTTPS para conexões seguras.
Backup da base de clientes: Verificar a capacidade de fazer backup da base de dados.
Bloqueio após múltiplas tentativas de login: Garantir que o sistema bloqueia a conta após várias tentativas erradas.
Sessão aberta por muito tempo: Verificar se a sessão expira após inatividade.
Acesso a URLs protegidas: Impedir o acesso não autorizado a URLs protegidas.
Criptografia de dados: Verificar se os dados sensíveis são armazenados e transmitidos de forma criptografada.
Verificação de XSS: Verificar a proteção contra ataques de Cross-Site Scripting.
Verificação de CSRF: Verificar a proteção contra ataques de Cross-Site Request Forgery.
Teste de Proteção contra Clickjacking: Garantir a configuração correta do cabeçalho X-Frame-Options.
Testes de Acessibilidade:
Navegação por Teclado: Verificar a acessibilidade dos elementos interativos via teclado.
Contraste de Cores: Garantir que o contraste de cores atende aos padrões de acessibilidade.
Legibilidade do Texto: Verificar se o texto é legível para todos os usuários.
Redimensionamento da Tela: Garantir que a aplicação mantém sua funcionalidade e legibilidade quando redimensionada.
Indicação de Foco: Verificar a indicação de foco visível em elementos interativos.
Uso de Leitores de Tela: Garantir compatibilidade e descrição correta do conteúdo com leitores de tela.		
Níveis de Teste:	
Testes de Unidade:
 Verificação das funcionalidades individuais em cada caso de teste, como autenticação, cadastro, transações, etc.
Testes de Integração:
Avaliar as diferentes funcionalidades do sistema, como login e cadastro, interagem entre si.
Testes de Sistema:
Testar a aplicação como um todo, incluindo todos os fluxos principais como login, cadastro, inclusão de clientes e transações.
Testes de Aceitação:
Validar se a aplicação atende aos requisitos propostos, tanto funcionais quanto não funcionais, como desempenho e segurança.		
Critérios de Aceitação								
Todas as funcionalidades funcionam conforme especificado:
Autenticação do sistema
(Login/senha: admin/admin)
Preenchimento dos campos obrigatórios que contêm o símbolo(*)
Cadastro de cliente
Transações de compra.
Para realizar uma venda, apenas deverá ser permitido caso o saldo do cliente for igual ou superior ao valor da compra.
Nenhum bug ou defeito permanece em aberto.
Os testes automatizados foram executados e não apresentaram falhas.							
Objetivos de Teste conforme desafio proposto										
Objetivos Gerais: 									
Garantir que todos os requisitos documentados pela empresa sejam validados adequadamente.
Relatar bugs ou inconsistências encontradas.
Automatizar testes para aprimoramento da aplicação 			
Objetivos Específicos:								
Avaliar cada uma das funcionalidades de modo detalhado:		
Como o Login se comporta.
Garantir que o cadastramento de clientes esteja funcionando devidamente.
As transações estão sendo executadas conforme especificação.
Detalhar possibilidades de melhorias para garantir uma boa experiência do usuário.
Elaborar testes manuais.
Automatizar os principais requisitos: 
 fluxo de login
cadastro de cliente
 transação.				
Recursos de Teste										
Time:											
RPE
Candidata: Gleice Heloise de Araujo Silva					
Ambiente:											
Hardware: 									
Notebook 
Modelo: Acer Aspire 5 A515-45-R760
Processador: AMD Ryzen 7 5700U
Memória RAM: 8GB
Armazenamento: 256GB SSD NVMe
Tela: 15.6" IPS Full HD (1920 x 1080)
Placa Gráfica: Integrada AMD Radeon Graphics
Conectividade: Wi-Fi 6						
Software: 									
Windows 11 versão 21H2
Navegador Chrome
Ferramentas de automação: Selenium				
Cronograma de Teste:
Apresentação do Desafio
Criação do Plano e casos de testes
Testes manuais e BUGS
Testes automatizados e documentação
Entrega do Desafio
02/08/2024
03/08/2024
04/08/2024
05/08/2024 e 06/08/2024
07/08/2024


Critérios de Entrada e Saída								
Critérios de Entrada:									
A aplicação deve está apta para ser submetida aos testes manuais e automatizados	.
Os cenários de testes e casos de aceite devem ser claramente documentados e devem responder como esperado aos requisitos solicitados.									
Critérios de Saída:									
Testes manuais bem elaborados com aqueles cenários apropriados para tal, e testes automatizados para os requisitos apresentados pelo desafio (fluxo de login, cadastro de cliente e transação).	
Os bugs e melhorias estarão documentados junto com todo o processo de gerenciamento do software.								
Escopo do Teste										
Funcionalidades a Serem Testadas: 						
Testes Manuais								
Testes de Login
1.1 Campos obrigatórios não preenchidos
1.2 Credenciais válidas
1.3 Credenciais inválidas
1.4 Variante de credenciais
1.5 Recuperação de senha
1.6 Alteração de senha ou login
1.7 Visualização da senha
1.8 Indicação de campos obrigatórios
1.9 Salvar/lembrar credenciais
Testes de Cadastro
2.1 Página de cadastramento inexistente
2.2 Cadastro com dados válidos
2.3 Cadastro com dados inválidos
2.4 Cadastro com login já existente
2.5 Cadastro de pessoas jurídicas ou organizações
2.6 Validação de Email
Testes de Inclusão de Clientes
3.1 Inserção de cliente com saldo disponível maior que 999.99
3.2 Inserção de cliente com saldo menor que zero
3.3 Alteração da validade do cartão
3.4 Inserção de clientes com o mesmo CPF
3.5 Inserção de clientes com o mesmo nome e CPF
3.6 Inserção de cliente com CPF inválido
3.7 Digitação do CPF no final do espaço
3.8 Anexar novo cartão
3.9 Atualização de Dados do Cliente
3.10 Não preenchimento de espaços obrigatórios que contém (*) na inserção de clientes
Testes de Transações
4.1 Filtragem de nome na lista de transações
4.2 Transação com valor menor que zero
4.3 Transação com valor maior que o saldo
4.4 Transação de cliente com saldo maior que 999.99
4.5 Verificação do saldo após transação
4.6 Cancelamento de Transações
Testes de Usabilidade
5.1 Navegação pela aplicação
5.2 Visualização de lista de clientes
5.3 Visualização de clientes bloqueados ou ativos
5.4 Filtragem por nome na aba de transações
5.5 Interface inicial organizada
5.6 Informações sobre formas de pagamento e dados do cartão
5.7 Facilidade de navegação entre páginas
5.8 Responsividade em Dispositivos Móveis
Testes de Segurança
6.2 Verificação de HTTPS
6.4 Bloqueio após múltiplas tentativas de login
6.5 Sessão aberta por muito tempo
6.6 Acesso a URLs protegidas
Testes de Acessibilidade
9.1 Navegação por Teclado
9.2 Contraste de Cores
9.3 Legibilidade do Texto
9.4 Redimensionamento da Tela
9.5 Indicação de Foco
9.6 Uso de Leitores de Tela					
Testes Automatizados								
Testes de Login
1.10 Ataque de Força Bruta
1.11 Verificação de email para recuperação de senha
1.12 Verificação de requisitos atendidos pela senha que vai ser alterada
Testes de Cadastro
2.6 Validação de Email (automatizar diferentes formatos inválidos)
Testes de Inclusão de Clientes
3.2 Inserção de cliente com saldo menor que zero (para muitos clientes)
3.4 Inserção de clientes com o mesmo CPF (automatizar variações)
3.6 Inserção de cliente com CPF inválido (automatizar variações)
Testes de Transações
4.2 Transação com valor menor que zero (automatizar várias tentativas)
4.3 Transação com valor maior que o saldo (automatizar várias tentativas)
4.5 Verificação do saldo após transação (automatizar para muitas transações)					
Funcionalidades que não serão testadas:						 
Testes Automatizados							
Testes de Segurança
6.1 Login com SQL Injection
6.3 Backup da base de clientes (automatizar testes de backup)
6.7 Criptografia de dados
6.8 Verificação de XSS
6.9 Verificação de CSRF
6.10 Teste de Proteção contra Clickjacking
Testes de Desempenho
8.1 Tempo de transação
8.2 Verificação do limite de cadastros
8.3 Suporte a usuários simultâneos
8.4 Suporte a transações simultâneas
8.5 Suporte a logins simultâneos
8.6 Tempo em execução
8.7 Stress Test
Testes de Integração
10.1 Integração Login e Cadastro
10.2 Integração Cadastro e Inclusão de Clientes
10.3 Integração Login e Recuperação de Senha
10.5 Integração Inclusão de Clientes e Transações
10.6 Integração Cadastro e Alteração de Senha
10.7 Integração Inclusão de Clientes e Filtragem de Transações							
Riscos e Contingências									
Riscos:											
A aplicação não possa ser devidamente testada devido ao tempo do desafio.
A aplicação não possa ser devidamente testada devido a limitação de material relacionado ao desenvolvimento da mesma
A aplicação não seja compatível com o ambiente ou ferramentas utilizadas
Erro ao Acessar a aplicação							
Mitigação:										
O foco dos testes se estenderá ao que foi solicitado na descrição do desafio e ao escopo descrito							
Planos de Contingência:								
Caso o tempo seja limitado, priorizar a criação do plano de teste e a descrição dos cenários de teste, além do detalhamento de melhorias na aplicação.
Caso alguns testes automatizados não possam ser realizados devido a limitação de material, criar casos de testes manuais, ou seja, realizar testes diretamente na aplicação.									
Ferramentas de Teste:									
Ferramentas:										
Selenium WebDriver como ferramenta de automação.
Jira para elaborar toda a gestão do software e documentar os testes.
Linguagem de programação Java (JDK 17)	
JUnit
IDE: VScode												
Configuração:										
Instalação do Selenium WebDriver e ChromeDriver
Instalação de versão mais atualizada e estável do Java JDK		
Métricas de Teste										
Métricas: 											
Quantos casos de testes foram executados?
Qual a quantidade de bugs que foi encontrada?
Qual a porcentagem de aceitação que a aplicação obteve após os testes: 
Porcentagem: 100% = Todos os testes, X% dos testes tiveram sucesso								
Relatórios: 										
Documentação completa de todo o desenvolvimento dos testes
Documentação dos Bugs encontrados
Documentação das melhorias que podem ser feitas na aplicação		
Plano de Comunicação									
Comunicação:											
Comunicação via email com a equipe da RPE.				
Stakeholders:										
Equipe de recrutamento e seleção da RPE.
Gestores da área de QA.

