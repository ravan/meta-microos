SUMMARY = "Data files for Domination"
DESCRIPTION = "Domination is a board game that is a bit like the well known game Risk. \
 \
Domination is a game that is a bit like the well known board game of Risk \
or RisiKo. It has many game options and includes many maps. \
 \
Written in java it includes a map editor, a simple map format, multiplayer \
network play, single player, hotseat, 5 user interfaces and many more features, \
it works in all OSs that run java. \
 \
Data files (cards, maps and images) for Domination."
LICENSE = "GPL-3.0-only"

PV = "20140921"

RPM_NAME = "domination-data-20140921-2.2.noarch.rpm"
RPM_HASH = "5a1c2a88852e867910d00de3ccaf56c6307ef90d3210525b2e7ad29251056b3c801df5a57f07d99378f9bcd17df40b43c1a3591d5eabd400c7c0e2f7b3c38b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "domination-data"

RDEPENDS:${PN} += "domination"

inherit rpm
