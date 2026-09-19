SUMMARY = "Bearoff databases for gnubg"
DESCRIPTION = "Precalculated GNU Backgammon bearoff databases - its intelligence. If you prefer \
a stronger or weaker opponent calculate you own with tweaked parameters \
according to the documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.08.003"

RPM_NAME = "gnubg-databases-1.08.003-1.6.noarch.rpm"
RPM_HASH = "fecbd40c2458bb3222d898ed67dec4d77fd297859847686c7de71fa4d3224ffba760601269a18db878efedf06c1cbbe98367aee8f40b0f893bfe504d180dbd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-databases"

RDEPENDS:${PN} += "gnubg"

inherit rpm
