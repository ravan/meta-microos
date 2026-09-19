SUMMARY = "GAP: double coset rewriting systems"
DESCRIPTION = "This package was conceived for computing induced actions of \
categories. This version only deals with deouble coset rewriting \
systems for finitely presented groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.37"

RPM_NAME = "gap-kan-1.37-1.7.noarch.rpm"
RPM_HASH = "bbaa66e777d20ff251c0ebd2d12e823ac033c9a1908d8e74f04763515e9ea813d73492b006b29c180ed04ba7f63ce8ad973bff32509420a621f6ce8ee693f376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-kan"

RDEPENDS:${PN} += "gap-automata \
gap-core \
gap-gapdoc \
gap-kbmag"

inherit rpm
