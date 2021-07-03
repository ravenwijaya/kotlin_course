package com.raven.movielist

object MoviesData {
    private val movieNames = arrayOf("Luca 2021",
            "A Quiet Place",
            "Baby Boss",
            "Cruella",
            "F9",
            "Fatherhood",
            "Joker",
            "My Roomate Is a Gumiho",
            "Raya And The Last Dragon",
            "Tenet")

    private val movieDetails = arrayOf(
        "set in a beautiful seaside town on the Italian Riviera, the original animated feature is a coming-of-age story about one young boy experiencing an unforgettable summer filled with gelato, pasta, and endless scooter rides. Luca shares these adventures with his newfound best friend, but all the fun is threatened by a deeply-held secret: he is a sea monster from another world just below the water’s surface.",
        "Following the deadly events at home, the Abbott family must now face the terrors of the outside world as they continue their fight for survival in silence. Forced to venture into the unknown, they quickly realize that the creatures that hunt by sound are not the only threats that lurk beyond the sand path.",
        "In the sequel to DreamWorks Animation’s Oscar®-nominated blockbuster comedy, the Templeton brothers—Tim (James Marsden, X-Men franchise) and his Boss Baby little bro Ted (Alec Baldwin)—have become adults and drifted away from each other. Tim is now a married stay-at-home dad. Ted is a hedge fund CEO. But a new boss baby with a cutting-edge approach and a can-do attitude is about to bring them together again … and inspire a new family business.\n" +
                "\n" +
                "Tim and his wife, Carol (Eva Longoria), the breadwinner of the family, live in the suburbs with their super-smart 7-year-old daughter Tabitha (Ariana Greenblatt, Avengers: Infinity War), and adorable new infant Tina (Amy Sedaris, Netflix’s BoJack Horseman). Tabitha, who’s at the top of her class at the prestigious Acorn Center for Advanced Childhood, idolizes her Uncle Ted and wants to become like him, but Tim, still in touch with his overactive youthful imagination, worries that she’s working too hard and is missing out on a normal childhood.\n" +
                "\n" +
                "When baby Tina reveals that she’s—ta-da!—a top secret agent for Baby Corp. on a mission to uncover the dark secrets behind Tabitha’s school and its mysterious founder, Dr. Erwin Armstrong (Jeff Goldblum), it will reunite the Templeton brothers in unexpected ways, lead them to re-evaluate the meaning of family and discover what truly matters.",
        "Academy Award (R) winner Emma Stone (\"La La Land\") stars in Disney's \"Cruella,\" an all-new live-action feature film about the rebellious early days of one of cinemas most notorious - and notoriously fashionable - villains, the legendary Cruella de Vil. \"Cruella,\" which is set in 1970s London amidst the punk rock revolution, follows a young grifter named Estella, a clever and creative girl determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella's flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute, played by two-time Oscar (R) winner Emma Thompson (\"Howards End,\" \"Sense & Sensibility\"). But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
        "Vin Diesel's Dom Toretto is leading a quiet life off the grid with Letty and his son, little Brian, but they know that danger always lurks just over their peaceful horizon. This time, that threat will force Dom to confront the sins of his past if he's going to save those he loves most. His crew joins together to stop a world-shattering plot led by the most skilled assassin and high-performance driver they've ever encountered: a man who also happens to be Dom's forsaken brother, Jakob (John Cena, the upcoming The Suicide Squad).",
        "A widowed dad copes with doubts, fears, heartache and dirty diapers as he sets out to raise his daughter on his own.",
        "Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker.",
        "Shin Woo-Yeo (Jang Ki-Yong) is a handsome and smart professor. He is also a 999 year old nine-tailed fox. To become a human, he collects human energy in a bead. Soon, he is set to become a human.\n" +
                "\n" +
                "Meanwhile, Lee Dam (Hyeri) is a university student. One day, her drunk friend falls asleep on top of an expensive car. She apologizes to Shin Woo-Yeo, who is the car owner. While Lee Dam struggles to take her friend away, Shin Woo-Yeo gives her a hand. An accident happens that changes their fate. Shin Woo-Yeo's bead falls out of his mouth and Lee Dam unintentionally swallows it. The bead can exist inside of a human for no more than 1 year and, afterwards, the bead will break inside of that person. This will cause Lee Dam to die and Shin Woo-Yeo will lose his chance to become a human. Shin Woo-Yeo explains to Lee Dam their predicament and suggests that they should live together until they figure out a solution.\n" +
                "\n" +
                "Lee Dam, who has never had a boyfriend in her life, now lives with Shin Woo-Yeo.",
        "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when sinister monsters known as the Druun threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, those same monsters have returned and it's up to a lone warrior, Raya, to track down the last dragon in order to finally stop the Druun for good. However, along her journey, she'll learn that it'll take more than dragon magic to save the world--it's going to take trust as well.",
        "A secret agent embarks on a dangerous, time-bending mission to prevent the start of World War III."
        )

    private val movieImages = intArrayOf(R.drawable.luca,
            R.drawable.aquietplace,
            R.drawable.babyboss,
            R.drawable.cruella,
            R.drawable.f9,
            R.drawable.fatherhood,
            R.drawable.joker,
            R.drawable.myroomateisagumiho,
            R.drawable.rayaandthelastdragon,
            R.drawable.tenet)
    private val movieBg = intArrayOf(R.drawable.lucabg,
        R.drawable.aquietplacebg,
        R.drawable.babybossbg,
        R.drawable.cruellabg,
        R.drawable.f9bg,
        R.drawable.fatherhoodbg,
        R.drawable.jokerbg,
        R.drawable.myroomateisagumihobg,
        R.drawable.rayaandthelastdragonbg,
        R.drawable.tenetbg)

    val listData: ArrayList<Movie>
        get() {
            val list = arrayListOf<Movie>()
            for (position in movieNames.indices) {
                val movie = Movie()
                movie.name = movieNames[position]
                movie.detail = movieDetails[position]
                movie.photo = movieImages[position]
                movie.bg = movieBg[position]
                list.add(movie)
            }
            return list
        }
}