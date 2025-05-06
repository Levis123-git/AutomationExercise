
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
  <img src="[C:\Users\Levis\Desktop\Arquivos LEvi\conteudo curso QA\Evidencia.jpeg](https://private-user-images.githubusercontent.com/178955690/440883717-a268a691-b6d5-4bc0-ac1f-2e45df7a3e10.jpeg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NDY1NTE0NTAsIm5iZiI6MTc0NjU1MTE1MCwicGF0aCI6Ii8xNzg5NTU2OTAvNDQwODgzNzE3LWEyNjhhNjkxLWI2ZDUtNGJjMC1hYzFmLTJlNDVkZjdhM2UxMC5qcGVnP1gtQW16LUFsZ29yaXRobT1BV1M0LUhNQUMtU0hBMjU2JlgtQW16LUNyZWRlbnRpYWw9QUtJQVZDT0RZTFNBNTNQUUs0WkElMkYyMDI1MDUwNiUyRnVzLWVhc3QtMSUyRnMzJTJGYXdzNF9yZXF1ZXN0JlgtQW16LURhdGU9MjAyNTA1MDZUMTcwNTUwWiZYLUFtei1FeHBpcmVzPTMwMCZYLUFtei1TaWduYXR1cmU9MzcwNTk2NjI5NDA2YTk3ODRhMDNkN2Y3NjY1OWYyY2FjOGFiOTY0MDMwYmFhNjEwYjM1OWI1MDAzNzVkN2U0OSZYLUFtei1TaWduZWRIZWFkZXJzPWhvc3QifQ._0IIYNmpk2SxcbQ5nFAWp4Iwa1A8EfhosIs2Ubck9HY)" width="800">
  <br>
  <em>Execução bem-sucedida dos testes automatizados</em>
</p>



## 👤 Autor

Desenvolvido por [Levis123-git](https://github.com/Levis123-git) com foco em aprendizado e prática de automação de testes.


