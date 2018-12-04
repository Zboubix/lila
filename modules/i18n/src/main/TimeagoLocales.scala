package lila.i18n

// This file is generated by bin/gen/timeago-to-scala.py
// Do not edit it manually!
object TimeagoLocales {
  val js: Map[String, String] = Map(
    "ar" -> """(function(){function formatTime(s,e){return e<3?timeTypes[s][e-1]:e>=3&&e<=10?timeTypes[s][2]:timeTypes[s][3]}lichess.timeagoLocale=function(s,e){if(0===e)return["منذ لحظات","بعد لحظات"];var t=formatTime(Math.floor(e/2),s);return["منذ "+t,"بعد "+t]};var timeTypes=[["ثانية","ثانيتين","%s ثوان","%s ثانية"],["دقيقة","دقيقتين","%s دقائق","%s دقيقة"],["ساعة","ساعتين","%s ساعات","%s ساعة"],["يوم","يومين","%s أيام","%s يوماً"],["أسبوع","أسبوعين","%s أسابيع","%s أسبوعاً"],["شهر","شهرين","%s أشهر","%s شهراً"],["عام","عامين","%s أعوام","%s عاماً"]];
})()""",
    "be" -> """(function(){function formatNum(s,e,n,r,u){var a=u%10,t=r;return 1===u?t=s:1===a&&u>20?t=e:a>1&&a<5&&(u>20||u<10)&&(t=n),t}var seconds=formatNum.bind(null,"секунду","%s секунду","%s секунды","%s секунд"),minutes=formatNum.bind(null,"хвіліну","%s хвіліну","%s хвіліны","%s хвілін"),hours=formatNum.bind(null,"гадзіну","%s гадзіну","%s гадзіны","%s гадзін"),days=formatNum.bind(null,"дзень","%s дзень","%s дні","%s дзён"),weeks=formatNum.bind(null,"тыдзень","%s тыдзень","%s тыдні","%s тыдняў"),months=formatNum.bind(null,"месяц","%s месяц","%s месяцы","%s месяцаў"),years=formatNum.bind(null,"год","%s год","%s гады","%s гадоў");lichess.timeagoLocale=function(s,e){switch(e){case 0:return["толькі што","праз некалькі секунд"];case 1:return[seconds(s)+" таму","праз "+seconds(s)];case 2:case 3:return[minutes(s)+" таму","праз "+minutes(s)];case 4:case 5:return[hours(s)+" таму","праз "+hours(s)];case 6:case 7:return[days(s)+" таму","праз "+days(s)];case 8:case 9:return[weeks(s)+" таму","праз "+weeks(s)];case 10:case 11:return[months(s)+" таму","праз "+months(s)];case 12:case 13:return[years(s)+" таму","праз "+years(s)];default:return["",""]}};
})()""",
    "bg" -> """(function(){lichess.timeagoLocale=function(s,e){return[["току що","съвсем скоро"],["преди %s секунди","след %s секунди"],["преди 1 минута","след 1 минута"],["преди %s минути","след %s минути"],["преди 1 час","след 1 час"],["преди %s часа","след %s часа"],["преди 1 ден","след 1 ден"],["преди %s дни","след %s дни"],["преди 1 седмица","след 1 седмица"],["преди %s седмици","след %s седмици"],["преди 1 месец","след 1 месец"],["преди %s месеца","след %s месеца"],["преди 1 година","след 1 година"],["преди %s години","след %s години"]][e]};
})()""",
    "ca" -> """(function(){lichess.timeagoLocale=function(a,s){return[["fa un moment","d'aquí un moment"],["fa %s segons","d'aquí %s segons"],["fa 1 minut","d'aquí 1 minut"],["fa %s minuts","d'aquí %s minuts"],["fa 1 hora","d'aquí 1 hora"],["fa %s hores","d'aquí %s hores"],["fa 1 dia","d'aquí 1 dia"],["fa %s dies","d'aquí %s dies"],["fa 1 setmana","d'aquí 1 setmana"],["fa %s setmanes","d'aquí %s setmanes"],["fa 1 mes","d'aquí 1 mes"],["fa %s mesos","d'aquí %s mesos"],["fa 1 any","d'aquí 1 any"],["fa %s anys","d'aquí %s anys"]][s]};
})()""",
    "da" -> """(function(){lichess.timeagoLocale=function(e,o){return[["for et øjeblik siden","om et øjeblik"],["for %s sekunder siden","om %s sekunder"],["for 1 minut siden","om 1 minut"],["for %s minutter siden","om %s minutter"],["for 1 time siden","om 1 time"],["for %s timer siden","om %s timer"],["for 1 dag siden","om 1 dag"],["for %s dage siden","om %s dage"],["for 1 uge siden","om 1 uge"],["for %s uger siden","om %s uger"],["for 1 måned siden","om 1 måned"],["for %s måneder siden","om %s måneder"],["for 1 år siden","om 1 år"],["for %s år siden","om %s år"]][o]};
})()""",
    "de" -> """(function(){lichess.timeagoLocale=function(n,e){return[["gerade eben","vor einer Weile"],["vor %s Sekunden","in %s Sekunden"],["vor 1 Minute","in 1 Minute"],["vor %s Minuten","in %s Minuten"],["vor 1 Stunde","in 1 Stunde"],["vor %s Stunden","in %s Stunden"],["vor 1 Tag","in 1 Tag"],["vor %s Tagen","in %s Tagen"],["vor 1 Woche","in 1 Woche"],["vor %s Wochen","in %s Wochen"],["vor 1 Monat","in 1 Monat"],["vor %s Monaten","in %s Monaten"],["vor 1 Jahr","in 1 Jahr"],["vor %s Jahren","in %s Jahren"]][e]};
})()""",
    "el" -> """(function(){lichess.timeagoLocale=function(s,e){return[["μόλις τώρα","σε λίγο"],["%s δευτερόλεπτα πριν","σε %s δευτερόλεπτα"],["1 λεπτό πριν","σε 1 λεπτό"],["%s λεπτά πριν","σε %s λεπτά"],["1 ώρα πριν","σε 1 ώρα"],["%s ώρες πριν","σε %s ώρες"],["1 μέρα πριν","σε 1 μέρα"],["%s μέρες πριν","σε %s μέρες"],["1 εβδομάδα πριν","σε 1 εβδομάδα"],["%s εβδομάδες πριν","σε %s εβδομάδες"],["1 μήνα πριν","σε 1 μήνα"],["%s μήνες πριν","σε %s μήνες"],["1 χρόνο πριν","σε 1 χρόνο"],["%s χρόνια πριν","σε %s χρόνια"]][e]};
})()""",
    "en" -> """(function(){lichess.timeagoLocale=function(s,n){return[["just now","right now"],["%s seconds ago","in %s seconds"],["1 minute ago","in 1 minute"],["%s minutes ago","in %s minutes"],["1 hour ago","in 1 hour"],["%s hours ago","in %s hours"],["1 day ago","in 1 day"],["%s days ago","in %s days"],["1 week ago","in 1 week"],["%s weeks ago","in %s weeks"],["1 month ago","in 1 month"],["%s months ago","in %s months"],["1 year ago","in 1 year"],["%s years ago","in %s years"]][n]};
})()""",
    "es" -> """(function(){lichess.timeagoLocale=function(e,s){return[["justo ahora","en un rato"],["hace %s segundos","en %s segundos"],["hace 1 minuto","en 1 minuto"],["hace %s minutos","en %s minutos"],["hace 1 hora","en 1 hora"],["hace %s horas","en %s horas"],["hace 1 día","en 1 día"],["hace %s días","en %s días"],["hace 1 semana","en 1 semana"],["hace %s semanas","en %s semanas"],["hace 1 mes","en 1 mes"],["hace %s meses","en %s meses"],["hace 1 año","en 1 año"],["hace %s años","en %s años"]][s]};
})()""",
    "eu" -> """(function(){lichess.timeagoLocale=function(u,r){return[["orain","denbora bat barru"],["duela %s segundu","%s segundu barru"],["duela minutu 1","minutu 1 barru"],["duela %s minutu","%s minutu barru"],["duela ordu 1","ordu 1 barru"],["duela %s ordu","%s ordu barru"],["duela egun 1","egun 1 barru"],["duela %s egun","%s egun barru"],["duela aste 1","aste 1 barru"],["duela %s aste","%s aste barru"],["duela hillabete 1","hillabete 1 barru"],["duela %s hillabete","%s hillabete barru"],["duela urte 1","urte 1 barru"],["duela %s urte","%s urte barru"]][r]};
})()""",
    "fa" -> """(function(){lichess.timeagoLocale=function(s,e){return[["همین الآن","لحظاتی پیش"],["%s ثانیه پیش","حدود %s ثانیه پیش"],["1 دقیقه پیش","حدود 1 دقیقه پیش"],["%s دقیقه پیش","حدود %s دقیقه پیش"],["1 ساعت پیش","حدود 1 ساعت پیش"],["%s ساعت پیش","حدود %s ساعت پیش"],["1 روز پیش","حدود 1 روز پیش"],["%s روز پیش","حدود %s روز پیش"],["1 هفته پیش","حدود 1 هفته پیش"],["%s هفته پیش","حدود %s هفته پیش"],["1 ماه پیش","حدود 1 ماه پیش"],["%s ماه پیش","حدود %s ماه پیش"],["1 سال پیش","حدود 1 سال پیش"],["%s سال پیش","حدود %s سال پیش"]][e]};
})()""",
    "fi" -> """(function(){lichess.timeagoLocale=function(t,s){return[["juuri äsken","juuri nyt"],["%s sekuntia sitten","%s sekunnin päästä"],["minuutti sitten","minuutin päästä"],["%s minuuttia sitten","%s minuutin päästä"],["tunti sitten","tunnin päästä"],["%s tuntia sitten","%s tunnin päästä"],["päivä sitten","päivän päästä"],["%s päivää sitten","%s päivän päästä"],["viikko sitten","viikon päästä"],["%s viikkoa sitten","%s viikon päästä"],["kuukausi sitten","kuukauden päästä"],["%s kuukautta sitten","%s kuukauden päästä"],["vuosi sitten","vuoden päästä"],["%s vuotta sitten","%s vuoden päästä"]][s]};
})()""",
    "fr" -> """(function(){lichess.timeagoLocale=function(s,a){return[["à l'instant","dans un instant"],["il y a %s secondes","dans %s secondes"],["il y a 1 minute","dans 1 minute"],["il y a %s minutes","dans %s minutes"],["il y a 1 heure","dans 1 heure"],["il y a %s heures","dans %s heures"],["il y a 1 jour","dans 1 jour"],["il y a %s jours","dans %s jours"],["il y a 1 semaine","dans 1 semaine"],["il y a %s semaines","dans %s semaines"],["il y a 1 mois","dans 1 mois"],["il y a %s mois","dans %s mois"],["il y a 1 an","dans 1 an"],["il y a %s ans","dans %s ans"]][a]};
})()""",
    "gl" -> """(function(){lichess.timeagoLocale=function(s,a){return[["xusto agora","daquí a un pouco"],["hai %s segundos","en %s segundos"],["hai 1 minuto","nun minuto"],["hai %s minutos","en %s minutos"],["hai 1 hora","nunha hora"],["hai %s horas","en %s horas"],["hai 1 día","nun día"],["hai %s días","en %s días"],["hai 1 semana","nunha semana"],["hai %s semanas","en %s semanas"],["hai 1 mes","nun mes"],["hai %s meses","en %s meses"],["hai 1 ano","nun ano"],["hai %s anos","en %s anos"]][a]};
})()""",
    "he" -> """(function(){lichess.timeagoLocale=function(s,e){return[["זה עתה","עכשיו"],["לפני %s שניות","בעוד %s שניות"],["לפני דקה","בעוד דקה"],["לפני %s דקות","בעוד %s דקות"],["לפני שעה","בעוד שעה"],["לפני %s שעות","בעוד %s שעות"],["אתמול","מחר"],["לפני %s ימים","בעוד %s ימים"],["לפני שבוע","בעוד שבוע"],["לפני %s שבועות","בעוד %s שבועות"],["לפני חודש","בעוד חודש"],["לפני %s חודשים","בעוד %s חודשים"],["לפני שנה","בעוד שנה"],["לפני %s שנים","בעוד %s שנים"]][e]};
})()""",
    "hu" -> """(function(){lichess.timeagoLocale=function(e,l){return[["éppen most","éppen most"],["%s másodperce","%s másodpercen belül"],["1 perce","1 percen belül"],["%s perce","%s percen belül"],["1 órája","1 órán belül"],["%s órája","%s órán belül"],["1 napja","1 napon belül"],["%s napja","%s napon belül"],["1 hete","1 héten belül"],["%s hete","%s héten belül"],["1 hónapja","1 hónapon belül"],["%s hónapja","%s hónapon belül"],["1 éve","1 éven belül"],["%s éve","%s éven belül"]][l]};
})()""",
    "in_BG" -> """(function(){lichess.timeagoLocale=function(s,e){return[["এইমাত্র","একটা সময়"],["%s সেকেন্ড আগে","%s এর সেকেন্ডের মধ্যে"],["1 মিনিট আগে","1 মিনিটে"],["%s এর মিনিট আগে","%s এর মিনিটের মধ্যে"],["1 ঘন্টা আগে","1 ঘন্টা"],["%s ঘণ্টা আগে","%s এর ঘন্টার মধ্যে"],["1 দিন আগে","1 দিনের মধ্যে"],["%s এর দিন আগে","%s এর দিন"],["1 সপ্তাহ আগে","1 সপ্তাহের মধ্যে"],["%s এর সপ্তাহ আগে","%s সপ্তাহের মধ্যে"],["1 মাস আগে","1 মাসে"],["%s মাস আগে","%s মাসে"],["1 বছর আগে","1 বছরের মধ্যে"],["%s বছর আগে","%s বছরে"]][e]};
})()""",
    "in_HI" -> """(function(){lichess.timeagoLocale=function(s,e){return[["अभी","कुछ समय"],["%s सेकंड पहले","%s सेकंड में"],["1 मिनट पहले","1 मिनट में"],["%s मिनट पहले","%s मिनट में"],["1 घंटे पहले","1 घंटे में"],["%s घंटे पहले","%s घंटे में"],["1 दिन पहले","1 दिन में"],["%s दिन पहले","%s दिनों में"],["1 सप्ताह पहले","1 सप्ताह में"],["%s हफ्ते पहले","%s हफ्तों में"],["1 महीने पहले","1 महीने में"],["%s महीने पहले","%s महीनों में"],["1 साल पहले","1 साल में"],["%s साल पहले","%s साल में"]][e]};
})()""",
    "in_ID" -> """(function(){lichess.timeagoLocale=function(a,l){return[["baru saja","sebentar"],["%s detik yang lalu","dalam %s detik"],["1 menit yang lalu","dalam 1 menit"],["%s menit yang lalu","dalam %s menit"],["1 jam yang lalu","dalam 1 jam"],["%s jam yang lalu","dalam %s jam"],["1 hari yang lalu","dalam 1 hari"],["%s hari yang lalu","dalam %s hari"],["1 minggu yang lalu","dalam 1 minggu"],["%s minggu yang lalu","dalam %s minggu"],["1 bulan yang lalu","dalam 1 bulan"],["%s bulan yang lalu","dalam %s bulan"],["1 tahun yang lalu","dalam 1 tahun"],["%s tahun yang lalu","dalam %s tahun"]][l]};
})()""",
    "it" -> """(function(){lichess.timeagoLocale=function(a,n){return[["poco fa","fra poco"],["%s secondi fa","fra %s secondi"],["un minuto fa","fra un minuto"],["%s minuti fa","fra %s minuti"],["un'ora fa","fra un'ora"],["%s ore fa","fra %s ore"],["un giorno fa","fra un giorno"],["%s giorni fa","fra %s giorni"],["una settimana fa","fra una settimana"],["%s settimane fa","fra %s settimane"],["un mese fa","fra un mese"],["%s mesi fa","fra %s mesi"],["un anno fa","fra un anno"],["%s anni fa","fra %s anni"]][n]};
})()""",
    "ja" -> """(function(){lichess.timeagoLocale=function(s,e){return[["すこし前","すぐに"],["%s秒前","%s秒以内"],["1分前","1分以内"],["%s分前","%s分以内"],["1時間前","1時間以内"],["%s時間前","%s時間以内"],["1日前","1日以内"],["%s日前","%s日以内"],["1週間前","1週間以内"],["%s週間前","%s週間以内"],["1ヶ月前","1ヶ月以内"],["%sヶ月前","%sヶ月以内"],["1年前","1年以内"],["%s年前","%s年以内"]][e]};
})()""",
    "ko" -> """(function(){lichess.timeagoLocale=function(s,e){return[["방금","곧"],["%s초 전","%s초 후"],["1분 전","1분 후"],["%s분 전","%s분 후"],["1시간 전","1시간 후"],["%s시간 전","%s시간 후"],["1일 전","1일 후"],["%s일 전","%s일 후"],["1주일 전","1주일 후"],["%s주일 전","%s주일 후"],["1개월 전","1개월 후"],["%s개월 전","%s개월 후"],["1년 전","1년 후"],["%s년 전","%s년 후"]][e]};
})()""",
    "ml" -> """(function(){lichess.timeagoLocale=function(s,e){return[["ഇപ്പോള്‍","കുറച്ചു മുന്‍പ്"],["%s സെക്കന്റ്‌കള്‍ക്ക് മുന്‍പ്","%s സെക്കന്റില്‍"],["1 മിനിറ്റിനു മുന്‍പ്","1 മിനിറ്റില്‍"],["%s മിനിറ്റുകള്‍ക്ക് മുന്‍പ","%s മിനിറ്റില്‍"],["1 മണിക്കൂറിനു മുന്‍പ്","1 മണിക്കൂറില്‍"],["%s മണിക്കൂറുകള്‍ക്കു മുന്‍പ്","%s മണിക്കൂറില്‍"],["1 ഒരു ദിവസം മുന്‍പ്","1 ദിവസത്തില്‍"],["%s ദിവസങ്ങള്‍ക് മുന്‍പ്","%s ദിവസങ്ങള്‍ക്കുള്ളില്‍"],["1 ആഴ്ച മുന്‍പ്","1 ആഴ്ചയില്‍"],["%s ആഴ്ചകള്‍ക്ക് മുന്‍പ്","%s ആഴ്ചകള്‍ക്കുള്ളില്‍"],["1 മാസത്തിനു മുന്‍പ്","1 മാസത്തിനുള്ളില്‍"],["%s മാസങ്ങള്‍ക്ക് മുന്‍പ്","%s മാസങ്ങള്‍ക്കുള്ളില്‍"],["1 വര്‍ഷത്തിനു  മുന്‍പ്","1 വര്‍ഷത്തിനുള്ളില്‍"],["%s വര്‍ഷങ്ങള്‍ക്കു മുന്‍പ്","%s വര്‍ഷങ്ങള്‍ക്കുല്ല്ളില്‍"]][e]};
})()""",
    "my" -> """(function(){lichess.timeagoLocale=function(s,e){return[["ယခုအတွင်း","ယခု"],["%s စက္ကန့် အကြာက","%s စက္ကန့်အတွင်း"],["1 မိနစ် အကြာက","1 မိနစ်အတွင်း"],["%s မိနစ် အကြာက","%s မိနစ်အတွင်း"],["1 နာရီ အကြာက","1 နာရီအတွင်း"],["%s နာရီ အကြာက","%s နာရီအတွင်း"],["1 ရက် အကြာက","1 ရက်အတွင်း"],["%s ရက် အကြာက","%s ရက်အတွင်း"],["1 ပတ် အကြာက","1 ပတ်အတွင်း"],["%s ပတ် အကြာက","%s ပတ်အတွင်း"],["1 လ အကြာက","1 လအတွင်း"],["%s လ အကြာက","%s လအတွင်း"],["1 နှစ် အကြာက","1 နှစ်အတွင်း"],["%s နှစ် အကြာက","%s နှစ်အတွင်း"]][e]};
})()""",
    "nb_NO" -> """(function(){lichess.timeagoLocale=function(e,s){return[["akkurat nå","om litt"],["%s sekunder siden","om %s sekunder"],["1 minutt siden","om 1 minutt"],["%s minutter siden","om %s minutter"],["1 time siden","om 1 time"],["%s timer siden","om %s timer"],["1 dag siden","om 1 dag"],["%s dager siden","om %s dager"],["1 uke siden","om 1 uke"],["%s uker siden","om %s uker"],["1 måned siden","om 1 måned"],["%s måneder siden","om %s måneder"],["1 år siden","om 1 år"],["%s år siden","om %s år"]][s]};
})()""",
    "nl" -> """(function(){lichess.timeagoLocale=function(n,e){return[["recent","binnenkort"],["%s seconden geleden","binnen %s seconden"],["1 minuut geleden","binnen 1 minuut"],["%s minuten geleden","binnen %s minuten"],["1 uur geleden","binnen 1 uur"],["%s uren geleden","binnen %s uren"],["1 dag geleden","binnen 1 dag"],["%s dagen geleden","binnen %s dagen"],["1 week geleden","binnen 1 week"],["%s weken geleden","binnen %s weken"],["1 maand geleden","binnen 1 maand"],["%s maanden geleden","binnen %s maanden"],["1 jaar geleden","binnen 1 jaar"],["%s jaren geleden","binnen %s jaren"]][e]};
})()""",
    "nn_NO" -> """(function(){lichess.timeagoLocale=function(s,n){return[["nett no","om litt"],["%s sekund sidan","om %s sekund"],["1 minutt sidan","om 1 minutt"],["%s minutt sidan","om %s minutt"],["1 time sidan","om 1 time"],["%s timar sidan","om %s timar"],["1 dag sidan","om 1 dag"],["%s dagar sidan","om %s dagar"],["1 veke sidan","om 1 veke"],["%s veker sidan","om %s veker"],["1 månad sidan","om 1 månad"],["%s månadar sidan","om %s månadar"],["1 år sidan","om 1 år"],["%s år sidan","om %s år"]][n]};
})()""",
    "pl" -> """(function(){var l=[["w tej chwili","za chwilę"],["%s sekund temu","za %s sekund"],["1 minutę temu","za 1 minutę"],["%s minut temu","za %s minut"],["1 godzinę temu","za 1 godzinę"],["%s godzin temu","za %s godzin"],["1 dzień temu","za 1 dzień"],["%s dni temu","za %s dni"],["1 tydzień temu","za 1 tydzień"],["%s tygodni temu","za %s tygodni"],["1 miesiąc temu","za 1 miesiąc"],["%s miesięcy temu","za %s miesięcy"],["1 rok temu","za 1 rok"],["%s lat temu","za %s lat"],["%s sekundy temu","za %s sekundy"],["%s minuty temu","za %s minuty"],["%s godziny temu","za %s godziny"],["%s dni temu","za %s dni"],["%s tygodnie temu","za %s tygodnie"],["%s miesiące temu","za %s miesiące"],["%s lata temu","za %s lata"]];lichess.timeagoLocale=function(e,i){return l[1&i?e%10>4||e%10<2||1==~~(e/10)%10?i:++i/2+13:i]};
})()""",
    "pt_BR" -> """(function(){lichess.timeagoLocale=function(m,s){return[["agora mesmo","daqui um pouco"],["há %s segundos","em %s segundos"],["há um minuto","em um minuto"],["há %s minutos","em %s minutos"],["há uma hora","em uma hora"],["há %s horas","em %s horas"],["há um dia","em um dia"],["há %s dias","em %s dias"],["há uma semana","em uma semana"],["há %s semanas","em %s semanas"],["há um mês","em um mês"],["há %s meses","em %s meses"],["há um ano","em um ano"],["há %s anos","em %s anos"]][s]};
})()""",
    "ro" -> """(function(){lichess.timeagoLocale=function(e,s){var u=[["chiar acum","chiar acum"],["acum %s secunde","peste %s secunde"],["acum un minut","peste un minut"],["acum %s minute","peste %s minute"],["acum o oră","peste o oră"],["acum %s ore","peste %s ore"],["acum o zi","peste o zi"],["acum %s zile","peste %s zile"],["acum o săptămână","peste o săptămână"],["acum %s săptămâni","peste %s săptămâni"],["acum o lună","peste o lună"],["acum %s luni","peste %s luni"],["acum un an","peste un an"],["acum %s ani","peste %s ani"]];return e<20?u[s]:[u[s][0].replace("%s","%s de"),u[s][1].replace("%s","%s de")]};
})()""",
    "ru" -> """(function(){function formatNum(s,e,r,n,u){var a=u%10,t=n;return 1===u?t=s:1===a&&u>20?t=e:a>1&&a<5&&(u>20||u<10)&&(t=r),t}var seconds=formatNum.bind(null,"секунду","%s секунду","%s секунды","%s секунд"),minutes=formatNum.bind(null,"минуту","%s минуту","%s минуты","%s минут"),hours=formatNum.bind(null,"час","%s час","%s часа","%s часов"),days=formatNum.bind(null,"день","%s день","%s дня","%s дней"),weeks=formatNum.bind(null,"неделю","%s неделю","%s недели","%s недель"),months=formatNum.bind(null,"месяц","%s месяц","%s месяца","%s месяцев"),years=formatNum.bind(null,"год","%s год","%s года","%s лет");lichess.timeagoLocale=function(s,e){switch(e){case 0:return["только что","через несколько секунд"];case 1:return[seconds(s)+" назад","через "+seconds(s)];case 2:case 3:return[minutes(s)+" назад","через "+minutes(s)];case 4:case 5:return[hours(s)+" назад","через "+hours(s)];case 6:return["вчера","завтра"];case 7:return[days(s)+" назад","через "+days(s)];case 8:case 9:return[weeks(s)+" назад","через "+weeks(s)];case 10:case 11:return[months(s)+" назад","через "+months(s)];case 12:case 13:return[years(s)+" назад","через "+years(s)];default:return["",""]}};
})()""",
    "sr" -> """(function(){function formatNum(s,e,n,r,u){var a=u%10,t=u%100;return 1==u?s:1==a&&11!=t?e:a>=2&&a<=4&&!(t>=12&&t<=14)?n:r}var seconds=formatNum.bind(null,"1 секунд","%s секунд","%s секунде","%s секунди"),minutes=formatNum.bind(null,"1 минут","%s минут","%s минуте","%s минута"),hours=formatNum.bind(null,"сат времена","%s сат","%s сата","%s сати"),days=formatNum.bind(null,"1 дан","%s дан","%s дана","%s дана"),weeks=formatNum.bind(null,"недељу дана","%s недељу","%s недеље","%s недеља"),months=formatNum.bind(null,"месец дана","%s месец","%s месеца","%s месеци"),years=formatNum.bind(null,"годину дана","%s годину","%s године","%s година");lichess.timeagoLocale=function(s,e){switch(e){case 0:return["малопре","управо сад"];case 1:return["пре "+seconds(s),"за "+seconds(s)];case 2:case 3:return["пре "+minutes(s),"за "+minutes(s)];case 4:case 5:return["пре "+hours(s),"за "+hours(s)];case 6:case 7:return["пре "+days(s),"за "+days(s)];case 8:case 9:return["пре "+weeks(s),"за "+weeks(s)];case 10:case 11:return["пре "+months(s),"за "+months(s)];case 12:case 13:return["пре "+years(s),"за "+years(s)];default:return["",""]}};
})()""",
    "sv" -> """(function(){lichess.timeagoLocale=function(s,e){return[["just nu","om en stund"],["%s sekunder sedan","om %s seconder"],["1 minut sedan","om 1 minut"],["%s minuter sedan","om %s minuter"],["1 timme sedan","om 1 timme"],["%s timmar sedan","om %s timmar"],["1 dag sedan","om 1 dag"],["%s dagar sedan","om %s dagar"],["1 vecka sedan","om 1 vecka"],["%s veckor sedan","om %s veckor"],["1 månad sedan","om 1 månad"],["%s månader sedan","om %s månader"],["1 år sedan","om 1 år"],["%s år sedan","om %s år"]][e]};
})()""",
    "ta" -> """(function(){lichess.timeagoLocale=function(s,e){return[["இப்போது","சற்று நேரம் முன்பு"],["%s நொடிக்கு முன்","%s நொடிகளில்"],["1 நிமிடத்திற்க்கு முன்","1 நிமிடத்தில்"],["%s நிமிடத்திற்க்கு முன்","%s நிமிடங்களில்"],["1 மணி நேரத்திற்கு முன்","1 மணி நேரத்திற்குள்"],["%s மணி நேரத்திற்கு முன்","%s மணி நேரத்திற்குள்"],["1 நாளுக்கு முன்","1 நாளில்"],["%s நாட்களுக்கு முன்","%s நாட்களில்"],["1 வாரத்திற்கு முன்","1 வாரத்தில்"],["%s வாரங்களுக்கு முன்","%s வாரங்களில்"],["1 மாதத்திற்கு முன்","1 மாதத்தில்"],["%s மாதங்களுக்கு முன்","%s மாதங்களில்"],["1 வருடத்திற்கு முன்","1 வருடத்தில்"],["%s வருடங்களுக்கு முன்","%s வருடங்களில்"]][e]};
})()""",
    "th" -> """(function(){lichess.timeagoLocale=function(s,e){return[["เมื่อสักครู่นี้","อีกสักครู่"],["%s วินาทีที่แล้ว","ใน %s วินาที"],["1 นาทีที่แล้ว","ใน 1 นาที"],["%s นาทีที่แล้ว","ใน %s นาที"],["1 ชั่วโมงที่แล้ว","ใน 1 ชั่วโมง"],["%s ชั่วโมงที่แล้ว","ใน %s ชั่วโมง"],["1 วันที่แล้ว","ใน 1 วัน"],["%s วันที่แล้ว","ใน %s วัน"],["1 อาทิตย์ที่แล้ว","ใน 1 อาทิตย์"],["%s อาทิตย์ที่แล้ว","ใน %s อาทิตย์"],["1 เดือนที่แล้ว","ใน 1 เดือน"],["%s เดือนที่แล้ว","ใน %s เดือน"],["1 ปีที่แล้ว","ใน 1 ปี"],["%s ปีที่แล้ว","ใน %s ปี"]][e]};
})()""",
    "tr" -> """(function(){lichess.timeagoLocale=function(n,i){return[["az önce","şimdi"],["%s saniye önce","%s saniye içinde"],["1 dakika önce","1 dakika içinde"],["%s dakika önce","%s dakika içinde"],["1 saat önce","1 saat içinde"],["%s saat önce","%s saat içinde"],["1 gün önce","1 gün içinde"],["%s gün önce","%s gün içinde"],["1 hafta önce","1 hafta içinde"],["%s hafta önce","%s hafta içinde"],["1 ay önce","1 ay içinde"],["%s ay önce","%s ay içinde"],["1 yıl önce","1 yıl içinde"],["%s yıl önce","%s yıl içinde"]][i]};
})()""",
    "uk" -> """(function(){function formatNum(s,e,n,r,u){var a=u%10,t=r;return 1===u?t=s:1===a&&u>20?t=e:a>1&&a<5&&(u>20||u<10)&&(t=n),t}var seconds=formatNum.bind(null,"секунду","%s секунду","%s секунди","%s секунд"),minutes=formatNum.bind(null,"хвилину","%s хвилину","%s хвилини","%s хвилин"),hours=formatNum.bind(null,"годину","%s годину","%s години","%s годин"),days=formatNum.bind(null,"день","%s день","%s дні","%s днів"),weeks=formatNum.bind(null,"тиждень","%s тиждень","%s тиждні","%s тижднів"),months=formatNum.bind(null,"місяць","%s місяць","%s місяці","%s місяців"),years=formatNum.bind(null,"рік","%s рік","%s роки","%s років");lichess.timeagoLocale=function(s,e){switch(e){case 0:return["щойно","через декілька секунд"];case 1:return[seconds(s)+" тому","через "+seconds(s)];case 2:case 3:return[minutes(s)+" тому","через "+minutes(s)];case 4:case 5:return[hours(s)+" тому","через "+hours(s)];case 6:case 7:return[days(s)+" тому","через "+days(s)];case 8:case 9:return[weeks(s)+" тому","через "+weeks(s)];case 10:case 11:return[months(s)+" тому","через "+months(s)];case 12:case 13:return[years(s)+" тому","через "+years(s)];default:return["",""]}};
})()""",
    "vi" -> """(function(){lichess.timeagoLocale=function(t,n){return[["vừa xong","một lúc"],["%s giây trước","trong %s giây"],["1 phút trước","trong 1 phút"],["%s phút trước","trong %s phút"],["1 giờ trước","trong 1 giờ"],["%s giờ trước","trong %s giờ"],["1 ngày trước","trong 1 ngày"],["%s ngày trước","trong %s ngày"],["1 tuần trước","trong 1 tuần"],["%s tuần trước","trong %s tuần"],["1 tháng trước","trong 1 tháng"],["%s tháng trước","trong %s tháng"],["1 năm trước","trong 1 năm"],["%s năm trước","trong %s năm"]][n]};
})()""",
    "zh_CN" -> """(function(){lichess.timeagoLocale=function(s,e){return[["刚刚","片刻后"],["%s秒前","%s秒后"],["1分钟前","1分钟后"],["%s分钟前","%s分钟后"],["1小时前","1小时后"],["%s小时前","%s小时后"],["1天前","1天后"],["%s天前","%s天后"],["1周前","1周后"],["%s周前","%s周后"],["1月前","1月后"],["%s月前","%s月后"],["1年前","1年后"],["%s年前","%s年后"]][e]};
})()""",
    "zh_TW" -> """(function(){lichess.timeagoLocale=function(s,e){return[["剛剛","片刻後"],["%s秒前","%s秒後"],["1分鐘前","1分鐘後"],["%s分鐘前","%s分鐘後"],["1小時前","1小時後"],["%s小時前","%s小時後"],["1天前","1天後"],["%s天前","%s天後"],["1周前","1周後"],["%s周前","%s周後"],["1月前","1月後"],["%s月前","%s月後"],["1年前","1年後"],["%s年前","%s年後"]][e]};
})()"""
  )
}

