
# 🚀 AutomationExercise - Projeto de Automação de Testes E2E

Automação de testes end-to-end (E2E) para validação de funcionalidades de cadastro e login em uma aplicação web de treinamento.

---

## 📌 Visão Geral

Este projeto tem como objetivo desenvolver e manter uma suíte de testes automatizados utilizando Java e Selenium WebDriver, com estrutura modular baseada em boas práticas como Page Object Model (POM), reutilização de métodos e separação clara de responsabilidades.

---

## 🛠️ Tecnologias Utilizadas

- **Java 21** – Linguagem principal para desenvolvimento dos testes.
- **Selenium WebDriver** – Framework de automação de browsers.
- **JUnit** – Framework de testes.
- **Maven** – Gerenciador de dependências e build.
- **Eclipse** – IDE recomendada para desenvolvimento.
- **WebDriverManager** – Para gerenciamento automático de drivers.

---

## 📁 Estrutura de Diretórios

```
nopcommerce/
├── src/
│   ├── main/
│   │   ├── java/              
│   │   └── resources/         
│   └── test/
│       ├── drivers/            # Inicialização e configuração de drivers (Chrome, Firefox, etc.)
│       ├── elementos/          # Mapas de elementos (locators) organizados por página
│       ├── metodos/            # Métodos reutilizáveis para ações comuns na automação
│       ├── pages/              # Classes Page Object com comportamentos das páginas
│       ├── runner/             # Classe principal para execução dos testes
│       └── testes/             # Casos de teste escritos com base em cenários reais
├── pom.xml                     # Arquivo de build com dependências e configurações Maven
├── target/                     # Gerado automaticamente após o build com Maven
```

---

## 🔄 Padrão de Projeto Utilizado

**Page Object Model (POM)**:
- Ajuda a organizar o código separando os elementos e comportamentos das páginas.
- Facilita a manutenção e reutilização de componentes.

---

## ⚙️ Como Configurar e Executar

### 1. Clonar o Repositório

```bash
git clone https://github.com/Levis123-git/AutomationExercise.git
cd AutomationExercise
```

### 2. Importar o Projeto no Eclipse

- **File > Import > Existing Maven Project**
- Navegue até a pasta clonada e selecione o projeto.

### 3. Executar os Testes

- Navegue até a classe na pasta `runner/`.
- Clique com o botão direito e selecione **Run As > JUnit Test**.

### 4. Gerar o Build com Maven (opcional)

```bash
mvn clean install
```

---

## ✅ Funcionalidades Testadas

- Cadastro de novo usuário
- Login com credenciais válidas
- Login com credenciais inválidas
- Validação de mensagens de erro e sucesso
- Verificação de redirecionamento de páginas
---

<p align="center">
  <img src="https://user-images.githubusercontent.com/90231528/135812206-03e8c4ec-04a7-479f-b27c-b7a6f27de1c4.png" width="800">
  <br>
  <em>Execução bem-sucedida dos testes automatizados</em>
</p>



## 👤 Autor

Desenvolvido por [Levis123-git](https://github.com/Levis123-git) com foco em aprendizado e prática de automação de testes.


