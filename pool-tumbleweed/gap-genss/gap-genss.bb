SUMMARY = "GAP: generic Schreier-Sims"
DESCRIPTION = "The genss package implements the randomised Schreier-Sims algorithm \
to compute a stabilizer chain and a base and strong generating set \
for arbitrary finite groups."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "gap-genss-1.6.10-1.1.noarch.rpm"
RPM_HASH = "078d24e0889681eb7904ae65b03eb070354b89b9eba8c6641d5ee72040348b3622eb38c48c202898adc01e930de0ad36b63316165d77609c35158ef4998062c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-genss"

RDEPENDS:${PN} += "gap-core \
gap-orb"

inherit rpm
