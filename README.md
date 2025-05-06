
# AutomationExercise

Automação E2E em uma aplicação de treinamento, validando formulários de cadastro e login.

## 📌 Descrição

Este projeto tem como objetivo automatizar testes de ponta a ponta (E2E) em uma aplicação de treinamento, focando na validação dos formulários de cadastro e login. A automação é realizada utilizando a linguagem Java.

## 🛠 Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework de Automação:** [Selenium WebDriver](https://www.selenium.dev/)
- **Gerenciador de Dependências:** [Maven](https://maven.apache.org/)
- **IDE Recomendada:** [Eclipse](https://www.eclipse.org/)
- **Java Version:** Java 21

## 📁 Estrutura do Projeto

```
nopcommerce/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── drivers/
│       ├── elementos/
│       ├── metodos/
│       ├── pages/
│       ├── runner/
│       └── testes/
├── pom.xml
├── target/
```

- `drivers/`: Configuração dos drivers utilizados (ex: ChromeDriver).
- `elementos/`: Mapeamento dos elementos da aplicação (Page Objects).
- `metodos/`: Métodos reutilizáveis para ações nas páginas.
- `pages/`: Lógica das páginas encapsulando interações.
- `runner/`: Classes responsáveis por executar os testes.
- `testes/`: Casos de teste automatizados.

## ⚙️ Como Executar o Projeto

### 1. Clonar o Repositório

```bash
git clone https://github.com/Levis123-git/AutomationExercise.git
cd AutomationExercise
```

### 2. Importar no Eclipse

- Abra o Eclipse.
- Selecione **File > Import > Existing Projects into Workspace**.
- Navegue até o diretório do projeto clonado e importe-o.

### 3. Executar os Testes

- No Eclipse, clique com o botão direito sobre o arquivo de teste desejado.
- Selecione **Run As > JUnit Test**.

## ✅ Funcionalidades Testadas

- Validação do formulário de cadastro.
- Validação do formulário de login.

