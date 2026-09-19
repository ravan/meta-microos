SUMMARY = "Board game that is a bit like the well known game Risk"
DESCRIPTION = "Domination is a board game that is a bit like the well known game Risk. \
 \
Domination is a game that is a bit like the well known board game of Risk \
or RisiKo. It has many game options and includes many maps. \
 \
Written in java it includes a map editor, a simple map format, multiplayer \
network play, single player, hotseat, 5 user interfaces and many more features, \
it works in all OSs that run java."
LICENSE = "GPL-3.0-only"

PV = "1.3.5"

RPM_NAME = "domination-1.3.5-1.1.noarch.rpm"
RPM_HASH = "09a360d866ed81099ebada4bb46a194869bf826784709d700bf69d3e30db85eb47eef8b1f35aba6afd973a595c9ec4d1f74eb73af34db183189ec5a589378c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "domination"

RDEPENDS:${PN} += "/usr/bin/sh \
domination-data \
jre"

inherit rpm
