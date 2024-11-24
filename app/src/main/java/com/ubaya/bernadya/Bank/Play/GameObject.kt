package com.ubaya.bernadya.Bank.Play

import com.ubaya.bernadya.R

object GameObject {
    val games = listOf(
        GameClass(
            id = 1,
            nama = "VALORANT",
            desc = "VALORANT is a tactical first-person shooter from Riot Games that combines precise gunplay with unique character abilities. Players engage in strategic, team-based matches where that must complete objectives and outsmart opponents to win.",
            gambar = R.drawable.valorant_image,
            achievement = listOf(
                AchievementClass("Juara 1 Valorant Championship Indonesia", 2023),
                AchievementClass("Juara 3 VCT International", 2023),
                AchievementClass("Juara 2 VCT Sea", 2022),
                AchievementClass("Juara 1 Valorant Tournament", 2024),
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Bigetron VALORANT",
                    memberList  = listOf(
                        MemberClass("Ace", "Duelist", "https://i.pravatar.cc/300?img=21"),
                        MemberClass("Blaze", "Controller", "https://i.pravatar.cc/300?img=22"),
                        MemberClass("Cypher", "Initiator", "https://i.pravatar.cc/300?img=23"),
                        MemberClass("Shadow", "Sentinel", "https://i.pravatar.cc/300?img=24"),
                        MemberClass("Phoenix", "Duelist", "https://i.pravatar.cc/300?img=25")
                    ),
                    imgTeam = "https://seeklogo.com/images/B/bigetron-logo-F1A80FAD14-seeklogo.com.png"
                ),
                TeamClass(
                    namaTeam = "EVOS VALORANT",
                    memberList  = listOf(
                        MemberClass("Ghost", "Controller", "https://i.pravatar.cc/300?img=26"),
                        MemberClass("Viper", "Sentinel", "https://i.pravatar.cc/300?img=27"),
                        MemberClass("Raze", "Duelist", "https://i.pravatar.cc/300?img=28"),
                        MemberClass("Jett", "Duelist", "https://i.pravatar.cc/300?img=29"),
                        MemberClass("Sova", "Initiator", "https://i.pravatar.cc/300?img=30")
                    ),
                    imgTeam = "https://id-mdl.com/uploads/Logo%20Team/evos-esports-500.png"
                )

            )
        ),
        GameClass(
            id = 2,
            nama = "Mobile Legends: Bang Bang",
            desc = "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena game developed and published by Chinese developer Moonton, a subsidiary of ByteDance. The game was released in 2016 and grew in popularity, most prominently in Southeast Asia.",
            gambar = R.drawable.mlbbimage,
            achievement = listOf(
                AchievementClass("Juara 2 Mobile Legends Championship Indonesia", 2023),
                AchievementClass("Juara 3 MLBB Champions", 2021),
                AchievementClass("Juara 2 MLBB Community Tournament", 2022),
                AchievementClass("Juara 1 MLBB World Tournament", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Bigetron MLBB",
                    memberList  = listOf(
                        MemberClass("Leo", "Support", "https://i.pravatar.cc/300?img=31"),
                        MemberClass("Blade", "Fighter", "https://i.pravatar.cc/300?img=32"),
                        MemberClass("Hunter", "Marksman", "https://i.pravatar.cc/300?img=33"),
                        MemberClass("Shield", "Tanker", "https://i.pravatar.cc/300?img=34"),
                        MemberClass("Mage", "Mage", "https://i.pravatar.cc/300?img=35")
                    ),
                    imgTeam = "https://seeklogo.com/images/B/bigetron-logo-F1A80FAD14-seeklogo.com.png"
                ),
                TeamClass(
                    namaTeam = "EVOS MLBB",
                    memberList  = listOf(
                        MemberClass("Storm", "Support", "https://i.pravatar.cc/300?img=36"),
                        MemberClass("Tornado", "Mage", "https://i.pravatar.cc/300?img=37"),
                        MemberClass("Rock", "Tanker", "https://i.pravatar.cc/300?img=38"),
                        MemberClass("Sharp", "Marksman", "https://i.pravatar.cc/300?img=39"),
                        MemberClass("Blade", "Assassin", "https://i.pravatar.cc/300?img=40")
                    ),
                    imgTeam = "https://id-mdl.com/uploads/Logo%20Team/evos-esports-500.png"
                )

            )
        ),
        GameClass(
            id = 3,
            nama = "DOTA 2",
            desc = "Dota 2 is a 2013 multiplayer online battle arena video game by Valve. The game is a sequel to Defense of the Ancients, a community-created mod for Blizzard Entertainment's Warcraft III: Reign of Chaos.",
            gambar = R.drawable.dota2image,
            achievement = listOf(
                AchievementClass("Juara 1 Valorant Championship Indonesia", 2023),
                AchievementClass("Juara 3 VCT International", 2023),
                AchievementClass("Juara 2 VCT Sea", 2022),
                AchievementClass("Juara 1 Valorant Tournament", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Bigetron DOTA 2",
                    memberList  = listOf(
                        MemberClass("Thor", "Hard Carry", "https://i.pravatar.cc/300?img=41"),
                        MemberClass("Loki", "Midlaner", "https://i.pravatar.cc/300?img=42"),
                        MemberClass("Iron", "Offlaner", "https://i.pravatar.cc/300?img=43"),
                        MemberClass("Cap", "Soft Support", "https://i.pravatar.cc/300?img=44"),
                        MemberClass("Hawk", "Hard Support", "https://i.pravatar.cc/300?img=45")
                    ),
                    imgTeam = "https://seeklogo.com/images/B/bigetron-logo-F1A80FAD14-seeklogo.com.png"
                ),
                TeamClass(
                    namaTeam = "EVOS DOTA 2",
                    memberList  = listOf(
                        MemberClass("Panther", "Hard Support", "https://i.pravatar.cc/300?img=46"),
                        MemberClass("Spider", "Offlaner", "https://i.pravatar.cc/300?img=47"),
                        MemberClass("Vision", "Soft Support", "https://i.pravatar.cc/300?img=48"),
                        MemberClass("Witch", "Midlaner", "https://i.pravatar.cc/300?img=49"),
                        MemberClass("Falcon", "Hard Carry", "https://i.pravatar.cc/300?img=50")
                    ),
                    imgTeam = "https://id-mdl.com/uploads/Logo%20Team/evos-esports-500.png"
                )

            )
        ),
        GameClass(
            id = 4,
            nama = "League of Legends",
            desc = "League of Legends (LoL) is a fast-paced multiplayer online battle arena (MOBA) game where players control unique champions and compete in teams of five to destroy the enemy’s Nexus. It combines strategy, teamwork, and quick reflexes, making it a staple in the competitive gaming scene.",
            gambar = R.drawable.lol_image,
            achievement = listOf(
                AchievementClass("Juara 1 World Championship", 2022),
                AchievementClass("Juara 2 MSI", 2023),
                AchievementClass("Juara 1 LCK Summer", 2023),
                AchievementClass("Juara 3 World Championship", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "T1",
                    memberList  = listOf(
                        MemberClass("Faker", "Top Lane", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Zeus", "Mid Lane", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Oner", "Attack Damage Carry", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Gumayusi", "Jungler", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Keria", "Support", "https://i.pravatar.cc/300?img=12")
                    ),
                    imgTeam = "https://static.wikia.nocookie.net/fifa_esports_gamepedia_en/images/a/a2/T1logo_square.png/revision/latest?cb=20201205050647"
                ),
                TeamClass(
                    namaTeam = "G2 Esports",
                    memberList  = listOf(
                        MemberClass("Caps", "Attack Damage Carry", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Jankos", "Top Lane", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("BrokenBlade", "Support", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Flakked", "Jungler", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Targamas", "Mid Lane", "https://i.pravatar.cc/300?img=18")
                    ),
                    imgTeam = "https://g2esports.com/cdn/shop/files/G2-Esports-2020-Logo_87bf0678-e67f-4834-8b09-e56137ffaa80.png?v=1641913940"
                )
            )
        ),
        GameClass(
            id = 5,
            nama = "Call of Duty",
            desc = "Call of Duty (COD) is a first-person shooter that emphasizes fast-paced, action-packed gameplay. Known for its intense multiplayer modes and realistic graphics, COD has been a dominant force in the FPS genre with various game modes and large-scale battles.",
            gambar = R.drawable.cod_image,
            achievement = listOf(
                AchievementClass("Juara 1 COD World League", 2023),
                AchievementClass("Juara 2 COD Mobile World Championship", 2023),
                AchievementClass("Juara 1 CDL Championship", 2022),
                AchievementClass("Juara 3 COD Championship", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "OpTic Gaming",
                    memberList  = listOf(
                        MemberClass("Scump", "Objective", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Dashy", "Slayer", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("iLLeY", "Anchor", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Shotzzy", "Support", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Ghosty", "Slayer", "https://i.pravatar.cc/300?img=12")
                    ),
                    imgTeam = "https://liquipedia.net/commons/images/thumb/7/79/OpTic_Gaming_lightmode.png/600px-OpTic_Gaming_lightmode.png"
                ),
                TeamClass(
                    namaTeam = "FaZe Clan",
                    memberList  = listOf(
                        MemberClass("aBeZy", "Slayer", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Simp", "Support", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Cellium", "Anchor", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Arcitys", "Objective", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Prestinni", "Support", "https://i.pravatar.cc/300?img=18")
                    ),
                    imgTeam = "https://upload.wikimedia.org/wikipedia/commons/4/4d/Faze_Clan.svg"
                )
            )
        ),
        GameClass(
            id = 6,
            nama = "Fortnite",
            desc = "Fortnite is a battle royale game where players compete to be the last person standing on an island. With its unique building mechanics, vibrant graphics, and frequent in-game events, Fortnite has become a cultural phenomenon and a top choice in competitive gaming.",
            gambar = R.drawable.fortnite_image,
            achievement = listOf(
                AchievementClass("Juara 1 Fortnite World Cup", 2022),
                AchievementClass("Juara 2 FNCS Grand Royale", 2023),
                AchievementClass("Juara 3 Fortnite Championship Series", 2022),
                AchievementClass("Juara 1 FNCS Invitational", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Team Liquid Fortnite",
                    memberList  = listOf(
                        MemberClass("Benjyfishy", "IGL", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Mongraal", "Fragger", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Support", "Support", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Aqua", "Fragger", "https://i.pravatar.cc/300?img=18"),
                    ),
                    imgTeam = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3sneb3hm1P52NYZHZVadeGv7K9IKQg6UQjw&s"
                ),
                TeamClass(
                    namaTeam = "NRG Fortnite",
                    memberList  = listOf(
                        MemberClass("Clix", "IGL", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("UnknownxArmy", "Fragger", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Zayt", "Support", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Dubs", "Support", "https://i.pravatar.cc/300?img=58"),
                    ),
                    imgTeam = "https://upload.wikimedia.org/wikipedia/commons/b/b7/NRG_Esports_logo.svg"
                )
            )
        )
        //tinggal tambah lagi klo mau ditambahin, tinggal tambah koma setelah tutup kurung di atas ini
    )
}