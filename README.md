 #                  GESTIONALE - VENDITA BIGLIETTI AEREI
Si vuole realizzare un’applicazione per la vendita di biglietti aerei.
Ogni compagnia aerea (caratterizzata dal proprio nome) è costituita da diversi aerei, ognuno con un
codice identificativo e una capienza in termini di numero di posti disponibili per i passeggeri. Inoltre,
ogni aereo ha una capienza massima in termini di bagagli a bordo e bagagli in stiva.
Ogni aereo può percorrere diverse tratte in giorni diversi. Ogni tratta è caratterizzata da un aeroporto di
partenza, uno di destinazione e dalla durata prevista del volo. Ogni aeroporto è caratterizzato da nome e
città. Per ogni tratta la compagnia prevede un certo numero di voli al giorno, caratterizzati da un codice
identificativo, l’ora e l’aereo.
Il gestore dell’applicazione si occupa di aggiungere o rimuovere le compagnie aeree dall’applicazione.
Periodicamente, i voli disponibili per le diverse tratte ed il prezzo base del biglietto (comprensivo di un
singolo bagaglio a bordo) vengono reperiti automaticamente dal sistema presso i siti delle compagnie
aeree.
L’applicazione consente di acquistare biglietti aerei, validi per uno specifico volo in un determinato
giorno. Ogni utente dell’applicazione può visualizzare i voli disponibili specificando la tratta, il giorno
e l’orario di partenza. Di ogni volo viene anche riportato il prezzo base del biglietto.
L’utente può acquistare un biglietto inserendo il codice del volo, numero di bagagli (a bordo e/o in
stiva), i propri dati personali, un documento d’identità, la carta di credito per il pagamento ed una email
su cui ricevere i biglietti.
Prima di emettere un biglietto, il sistema deve valutare l’effettiva disponibilità dei bagagli e calcolare il
sovrapprezzo nel caso di bagagli aggiuntivi (pari a 10 € per quelli a bordo e 20 € per quelli da stiva). Il
posto a sedere viene assegnato in maniera casuale dal sistema.
Per ciascun biglietto acquistato, il sistema deve registrare i dati del passeggero (nome, cognome, codice
fiscale e numero del documento), data e ora di emissione del biglietto ed il prezzo pagato, aggiornando
il numero di posti e di bagagli disponibilissimi.
Ogni ultimo giorno del mese il sistema genera un report indicando il numero totale di biglietti venduti
per ogni tratta.
