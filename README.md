## 🦸‍♂️ SuperHero Match
O SuperHero Match é um aplicativo Android desenvolvido em Kotlin que ajuda o usuário a descobrir qual super-herói mais combina com sua personalidade. Através de um quiz rápido, o app analisa as escolhas do usuário e apresenta o herói correspondente, permitindo ainda uma pesquisa direta na web sobre o personagem.

## ✨ Funcionalidades
- Fluxo Dinâmico: Navegação intuitiva entre telas de início, perguntas e resultados.
- Quiz de Personalidade: Sistema de seleção por RadioGroup que identifica traços como força, inteligência ou poder.
- Resultados Customizados: Exibição de imagem e texto específico para cada herói (Batman, Homem de Ferro, Hulk ou Superman).
- Integração com a Web: Uso de Intents Implícitas para realizar uma busca automática no Google sobre o herói sorteado.

## 🛠️ Tecnologias Utilizadas
- Linguagem: Kotlin
- Plataforma: Android Nativo
- Componentes de UI: * RadioGroup / RadioButton para escolhas.
 - ImageView para exibição dos resultados.
 - Intent para transporte de dados e navegação.
 - Uri para integração com o navegador externo.

## 📂 Estrutura das Activities
O projeto é dividido em três telas principais:
1. MainActivity: Tela de boas-vindas que inicia a experiência.
2. PerguntasActivity: Onde a lógica de escolha acontece. Filtra a opção selecionada e envia o "ID" do herói para a próxima tela.
3. ResultadoActivity: Recebe os dados, renderiza a imagem correta do diretório drawable e gerencia a Intent implícita de busca no Google.

## 🚀 Como Executar o Projeto
1. Clone o repositório:
- git clone https://github.com/seu-usuario/superhero-match.git
2. Abra no Android Studio:
- Selecione File > Open e aponte para a pasta do projeto.
3. Verifique os Recursos:
- Certifique-se de que as imagens (batman.png, hulk.png, etc.) estão na pasta res/drawable.
4. Execute o App:
- Utilize um emulador ou dispositivo físico com o Modo Desenvolvedor ativado.

## 📝 Exemplo de Lógica (Kotlin)
No app, utilizamos o when para definir o perfil do usuário:

when (idSelecionado) {
    - R.id.radioSombrio -> heroi = "batman"
    - R.id.radioBilionario -> heroi = "homem_de_ferro"
    - R.id.radioForca -> heroi = "hulk"
    - R.id.radioInvencivel -> heroi = "superman"
}
____________________________________________________________________________________________________________________________________________________________
Desenvolvido por Lucas Kronemberger 🚀⚡
