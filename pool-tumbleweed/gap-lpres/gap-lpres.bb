SUMMARY = "GAP: Nilpotent Quotients of L-Presented Groups"
DESCRIPTION = "The LPRES package defines new GAP objects to work with L-presented \
groups, namely groups given by a finite generating set and a \
possibly-infinite set of relations given as iterates of finitely many \
seed relations by a finite set of endomorphisms. The package \
implements nilpotent quotient, Todd-Coxeter and Reidemeister-Schreier \
algorithms for L-presented groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "gap-lpres-1.1.2-1.2.noarch.rpm"
RPM_HASH = "7b86fd865c313b308135c144501720459549feacac79f7a16252c80a8f28aaebb1164813f4e0da285ca314039d2590df2c4596e4708524fd9e09b9b9d92e9abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-lpres"

RDEPENDS:${PN} += "gap-core \
gap-fga \
gap-polycyclic"

inherit rpm
