package com.example.moviebooking

data class DummyMovies(
    val movieName : String,
    val movieRate : String,
    val rateVotedCount : String,
    val movieActors : List<String>,
    val movieComment : List<String>,
    val commenterName : List<String>
)

val movieLanguages = listOf<String>("Tamil","Telugu","Malayalam","Kanata","English","Hindi")



val dummyMoviesList = listOf<DummyMovies>(
    DummyMovies(
        "Indian 2",
        "8.7/10",
        "(588.3k Votes)",
        listOf("Kamal Haasan","Siddharth","Kajal Aggarwal","Rakil Preet Shingh","Priya Bhavani","Vivek","Bobby Simha","Samuthirakani","Nedumudi Venu","Delhi Ganesh","Brahmanandam","Manobala"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")
    ),

    DummyMovies(
    "KILL",
    "7.9/10",
    "(358.93k Votes)",
    listOf("Tovino Thomas", "Samyuktha Menon", "Padmanabhan", "Vini Vishwa Lal", "Saiju Kurup", "Hareesh Uthaman", "Anjali Nair"),
    listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
        "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
        "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
        "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
        "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
    ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")),

    DummyMovies(
        "Kalki",
        "8.6/10",
        "(720.2k Votes)",
        listOf(
            "Daniel Radcliffe",
            "Emma Watson",
            "Rupert Grint",
            "Tom Felton",
            "Alan Rickman",
            "Maggie Smith",
            "Robbie Coltrane",
            "Michael Gambon",
            "Ralph Fiennes",
            "Helena Bonham"
        ),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")
    ),

    DummyMovies(
        "MahaRaja",
        "9.4/10",
        "(378.09k Votes)",
        listOf(
            "Govinda",
            "Manisha Koirala",
            "Raj Babbar",
            "Shakti Kapoor",
            "Prem Chopra",
            "Salim Ghouse",
            "Mohan Joshi",
            "Kulbhushan",
            "Aruna Irani",
            "Farida Jalal"
        ),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")
    ),

    DummyMovies(
        "M.S.Dhoni",
        "8.4/10",
        "(197.56k Votes)",
        listOf(
            "Singh Rajput",
            "Disha Patani",
            "Kiara Advani",
            "Anupam Kher",
            "Bhumika Chawla",
            "Rajesh Sharma",
            "Kumud Mishra",
            "Herry Tangri",
            "Kranti Prakash Jha",
            "Mithu Chakrabarty"
        ),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")),

    DummyMovies(
        "Karudan",
        "7.9/10",
        "(513.90k Votes)",
        listOf(
            "Vijay",
            "Tamannaah",
            "Vadivelu",
            "Dev Gill",
            "Radha Ravi",
            "Sriman",
            "Ilavarasu",
            "Yuvarani",
            "Madhan Bob",
            "Sujatha Sivakumar"
        ),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")
    )
    ,

    DummyMovies(
        "Despicable ME 4",
        "5.9/10",
        "(293.67k Votes)",
        listOf(
            "Steve Carell",
            "Jason Segel",
            "Russell Brand",
            "Julie Andrews",
            "Will Arnett",
            "Kristen Wiig",
            "Miranda Cosgrove",
            "Dana Gaier",
            "Elsie Fisher",
            "Pierre Coffin"
        ),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu","Dharsan","Saranya","Rishikesh","Sivasubu")
    )

)

val dummyTamilMovies = listOf(
    DummyMovies(
        "Indian 2",
        "8.7/10",
        "(588.3k Votes)",
        listOf("Kamal Haasan", "Siddharth", "Kajal Aggarwal", "Rakul Preet Singh", "Priya Bhavani", "Vivek", "Bobby Simha", "Samuthirakani", "Nedumudi Venu", "Delhi Ganesh", "Brahmanandam", "Manobala"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu", "Dharsan", "Saranya", "Rishikesh", "Sivasubu")
    ),
    DummyMovies(
        "Kalki",
        "7.9/10",
        "(320.4k Votes)",
        listOf("Rajasekhar", "Rahman", "Nandita Swetha", "Adah Sharma", "Poojitha Ponnada", "Nassar", "Ashutosh Rana", "Charandeep", "Sithara"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu", "Dharsan", "Saranya", "Rishikesh", "Sivasubu")
    ),
    DummyMovies(
        "Captain Miller",
        "8.2/10",
        "(450.1k Votes)",
        listOf("Dhanush", "Priyanka Arul Mohan", "Nivedhithaa Sathish", "John Kokken", "Vinoth Kishan", "Sundeep Kishan", "Elango Kumaravel"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu", "Dharsan", "Saranya", "Rishikesh", "Sivasubu")
    ),
    DummyMovies(
        "Karudan",
        "7.5/10",
        "(290.7k Votes)",
        listOf("Vijay", "Nayanthara", "Sathyaraj", "S. J. Surya", "Vadivelu", "K. S. Ravikumar", "Motta Rajendran"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu", "Dharsan", "Saranya", "Rishikesh", "Sivasubu")
    ),
    DummyMovies(
        "MahaRaja",
        "8.0/10",
        "(310.5k Votes)",
        listOf("Arjun Sarja", "Meena", "Vijayakumar", "Nassar", "Vadivelu", "Manivannan", "Ranjitha"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu", "Dharsan", "Saranya", "Rishikesh", "Sivasubu")
    ),
    DummyMovies(
        "Siren",
        "7.8/10",
        "(280.3k Votes)",
        listOf("Keerthy Suresh", "Yogi Babu", "Rajendran", "Aadhav Kannadasan", "Mime Gopi", "Manobala", "Robo Shankar"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Pathu", "Dharsan", "Saranya", "Rishikesh", "Sivasubu")
    )
)


val dummyTeluguMovies = listOf(
    DummyMovies(
        "RRR",
        "9.0/10",
        "(800.3k Votes)",
        listOf("N. T. Rama Rao Jr.", "Ram Charan", "Alia Bhatt", "Ajay Devgn", "Olivia Morris", "Ray Stevenson"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Ravi", "Kumar", "Suresh", "Harish", "Pooja")
    ),
    DummyMovies(
        "Baahubali",
        "8.9/10",
        "(1.2M Votes)",
        listOf("Prabhas", "Rana Daggubati", "Anushka Shetty", "Tamannaah", "Sathyaraj", "Nassar"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Ravi", "Kumar", "Suresh", "Harish", "Pooja")
    ),
    DummyMovies(
        "Pushpa",
        "8.5/10",
        "(600.1k Votes)",
        listOf("Allu Arjun", "Rashmika Mandanna", "Fahadh Faasil", "Jagapathi Babu", "Prakash Raj"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Ravi", "Kumar", "Suresh", "Harish", "Pooja")
    ),
    DummyMovies(
        "Ala Vaikunthapurramuloo",
        "8.1/10",
        "(500.7k Votes)",
        listOf("Allu Arjun", "Pooja Hegde", "Tabu", "Jayaram", "Sushanth", "Nivetha Pethuraj"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Ravi", "Kumar", "Suresh", "Harish", "Pooja")
    ),
    DummyMovies(
        "Arjun Reddy",
        "8.4/10",
        "(700.9k Votes)",
        listOf("Vijay Deverakonda", "Shalini Pandey", "Rahul Ramakrishna", "Jia Sharma", "Sanjay Swaroop"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Ravi", "Kumar", "Suresh", "Harish", "Pooja")
    ),
    DummyMovies(
        "Eega",
        "8.2/10",
        "(600.5k Votes)",
        listOf("Sudeep", "Nani", "Samantha Ruth Prabhu", "Santhanam", "Adithya Menon"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Ravi", "Kumar", "Suresh", "Harish", "Pooja")
    )
)


val dummyMalayalamMovies = listOf(
    DummyMovies(
        "Drishyam",
        "8.6/10",
        "(700.1k Votes)",
        listOf("Mohanlal", "Meena", "Ansiba Hassan", "Esther Anil", "Asha Sarath", "Siddique"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Premam",
        "8.3/10",
        "(650.5k Votes)",
        listOf("Nivin Pauly", "Sai Pallavi", "Madonna Sebastian", "Anupama Parameswaran", "Krishna Shankar", "Shabareesh Varma"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Lucifer",
        "7.5/10",
        "(500.2k Votes)",
        listOf("Mohanlal", "Vivek Oberoi", "Manju Warrier", "Tovino Thomas", "Indrajith Sukumaran", "Prithviraj Sukumaran"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Kumbalangi Nights",
        "8.7/10",
        "(480.3k Votes)",
        listOf("Fahadh Faasil", "Soubin Shahir", "Srinath Bhasi", "Shane Nigam", "Anna Ben", "Mathew Thomas"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Bangalore Days",
        "8.3/10",
        "(530.5k Votes)",
        listOf("Dulquer Salmaan", "Nivin Pauly", "Nazriya Nazim", "Parvathy Thiruvothu", "Fahadh Faasil", "Nithya Menen"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Ustad Hotel",
        "8.2/10",
        "(450.4k Votes)",
        listOf("Dulquer Salmaan", "Thilakan", "Nithya Menen", "Siddique", "Jaya Prakash Reddy", "Mamukkoya"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    )
)

val dummyKannadaMovies = listOf(
    DummyMovies(
        "KGF",
        "8.5/10",
        "(750.2k Votes)",
        listOf("Yash", "Srinidhi Shetty", "Ramachandra Raju", "Achyuth Kumar", "Malavika Avinash", "Anant Nag"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Raajakumara",
        "7.8/10",
        "(600.3k Votes)",
        listOf("Puneeth Rajkumar", "Priya Anand", "Ananth Nag", "Sharath Kumar", "Vijayalakshmi Singh", "Prakash Raj"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Kirik Party",
        "8.3/10",
        "(550.4k Votes)",
        listOf("Rakshit Shetty", "Rashmika Mandanna", "Samyuktha Hegde", "Achyuth Kumar", "Aravind Iyer", "Dhananjay Ranjan"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Tagaru",
        "7.9/10",
        "(520.2k Votes)",
        listOf("Shiva Rajkumar", "Bhavana", "Manvitha Harish", "Dhananjay", "Vasishta N. Simha", "Devaraj"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Mungaru Male",
        "8.1/10",
        "(480.5k Votes)",
        listOf("Ganesh", "Pooja Gandhi", "Anant Nag", "Sudha Rani", "Padmaja Rao", "Kavya"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    ),
    DummyMovies(
        "Pailwaan",
        "7.5/10",
        "(450.3k Votes)",
        listOf("Sudeep", "Suniel Shetty", "Aakanksha Singh", "Kabir Duhan Singh", "Sushant Singh", "Avinash"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    )
)


val dummyHindiMovies = listOf(
    DummyMovies(
        "3 Idiots",
        "8.4/10",
        "(1.2M Votes)",
        listOf("Aamir Khan", "R. Madhavan", "Sharman Joshi", "Kareena Kapoor", "Boman Irani", "Omi Vaidya"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Raj", "Simran", "Rahul", "Anjali", "Rohit")
    ),
    DummyMovies(
        "Dangal",
        "8.4/10",
        "(950.5k Votes)",
        listOf("Aamir Khan", "Sakshi Tanwar", "Fatima Sana Shaikh", "Sanya Malhotra", "Aparshakti Khurana", "Zaira Wasim"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Mahavir", "Geeta", "Babita", "Omkar", "Pradeep")
    ),
    DummyMovies(
        "Dilwale Dulhania Le Jayenge",
        "8.1/10",
        "(850.3k Votes)",
        listOf("Shah Rukh Khan", "Kajol", "Amrish Puri", "Anupam Kher", "Farida Jalal", "Mandira Bedi"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Raj", "Simran", "Baldev", "Anita", "Ajit")
    ),
    DummyMovies(
        "Sholay",
        "8.2/10",
        "(750.4k Votes)",
        listOf("Amitabh Bachchan", "Dharmendra", "Hema Malini", "Jaya Bachchan", "Sanjeev Kumar", "Amjad Khan"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Jai", "Veeru", "Basanti", "Thakur", "Gabbar")
    ),
    DummyMovies(
        "Kabir Singh",
        "7.1/10",
        "(700.2k Votes)",
        listOf("Shahid Kapoor", "Kiara Advani", "Soham Majumdar", "Arjan Bajwa", "Nikita Dutta", "Suresh Oberoi"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Kabir", "Preeti", "Shiva", "Karan", "Sushma")
    ),
    DummyMovies(
        "Chhichhore",
        "8.3/10",
        "(650.6k Votes)",
        listOf("Sushant Singh Rajput", "Shraddha Kapoor", "Varun Sharma", "Tahir Raj Bhasin", "Naveen Polishetty", "Prateik Babbar"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Anni", "Maya", "Sexa", "Derek", "Acid")
    )
)


val dummyEnglishMovies = listOf(
    DummyMovies(
        "Inception",
        "8.8/10",
        "(2.1M Votes)",
        listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page", "Tom Hardy", "Ken Watanabe", "Marion Cotillard"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Cobb", "Arthur", "Ariadne", "Eames", "Saito")
    ),
    DummyMovies(
        "The Dark Knight",
        "9.0/10",
        "(2.3M Votes)",
        listOf("Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine", "Maggie Gyllenhaal", "Gary Oldman"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Bruce Wayne", "Joker", "Harvey Dent", "Alfred", "Rachel Dawes")
    ),
    DummyMovies(
        "Titanic",
        "7.8/10",
        "(1.1M Votes)",
        listOf("Leonardo DiCaprio", "Kate Winslet", "Billy Zane", "Kathy Bates", "Frances Fisher", "Danny Nucci"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Jack", "Rose", "Cal", "Molly", "Ruth")
    ),
    DummyMovies(
        "Avengers: Endgame",
        "8.4/10",
        "(1.5M Votes)",
        listOf("Robert Downey Jr.", "Chris Evans", "Mark Ruffalo", "Chris Hemsworth", "Scarlett Johansson", "Jeremy Renner"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Iron Man", "Captain America", "Hulk", "Thor", "Black Widow")
    ),
    DummyMovies(
        "The Godfather",
        "9.2/10",
        "(1.6M Votes)",
        listOf("Marlon Brando", "Al Pacino", "James Caan", "Richard S. Castellano", "Robert Duvall", "Sterling Hayden"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Vito Corleone", "Michael Corleone", "Sonny Corleone", "Clemenza", "Tom Hagen")
    ),
    DummyMovies(
        "Forrest Gump",
        "8.8/10",
        "(1.9M Votes)",
        listOf("Tom Hanks", "Robin Wright", "Gary Sinise", "Mykelti Williamson", "Sally Field", "Rebecca Williams"),
        listOf("Great action movie! Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad).",
            "Indian is truly one of Sunny Deol's best action movies ever, as he shows more patriotism again, but here, he is a tough and clever cop (modern version of Chandrashekhar Azad). ",
            "This movie is NOT at all anti-Pak as some believe as they did NOT understand the real essence of the film. However, the film exploits corruption in India itself in police, rich people, etc. ",
            "I've seen this movie umpteen times.But i still njoy the tricks used by our hero sunny deol to vanish the wrongdoers. script is wondrful in all respects incl. story,screenplay and dialogues.",
            "The one and only department in which the film falters is cinematography which is just okay enough to capture,the director's take , on celluloid. BUT still enjoyed its other aspects."
        ),
        listOf("Forrest", "Jenny", "Lieutenant Dan", "Bubba", "Mrs. Gump")
    )
)

val mainMovieList = listOf(
    dummyMoviesList,
    dummyTamilMovies,
    dummyTeluguMovies,
    dummyMalayalamMovies,
    dummyKannadaMovies,
    dummyEnglishMovies,
    dummyHindiMovies
)


