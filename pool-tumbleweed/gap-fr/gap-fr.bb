SUMMARY = "GAP: Computations with functionally recursive groups"
DESCRIPTION = "This package implements Functionally Recursive and Mealy automata in \
GAP. These objects can be manipulated as group elements, and various \
specific commands allow their manipulation as automorphisms of \
infinite rooted trees. Permutation quotients can also be created and \
manipulated as standard GAP groups or semigroups."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.13"

RPM_NAME = "gap-fr-2.4.13-1.9.noarch.rpm"
RPM_HASH = "d42370acf22de5297db244021f4477cc4717e4a9657be1de8597ddcc1b7bab5c484066321484dbcf398d6bdc7b51036c035217e064706ad3eab0c6806cdb802c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-fr"

RDEPENDS:${PN} += "gap-core \
gap-fga \
gap-gapdoc \
gap-io \
gap-polycyclic"

inherit rpm
