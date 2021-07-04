const app = Vue.createApp({});
app.component('chuck-norris', {
  template: `
<div class="wrapper">
    <img alt="chuck-norris" src="/images/chuck-norris.png" class="img"/>
    <h1 class="quote">"{{ randomQuote }}"</h1>
</div>
  `,
  data() {
    return {
      randomQuote: 'Wenn alles funktioniert, steht hier ein Chuck Norris Spruch.',
    };
  },
  methods: {
    loadRandomQuote() {
      // ToDo: Rufen Sie hier den Rest-Endpunkt des Servers auf
    },
    getRandomInt(maxExclusive) {
      return Math.floor(Math.random() * maxExclusive);
    },
  },
});
app.mount('#chuck-norris-app');
