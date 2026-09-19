SUMMARY = "GAP: Q-ary quantum stabilizer code distance"
DESCRIPTION = "QDistRnd implements a probabilistic algorithm for finding the minimum distance \
of a quantum code linear over a finite field GF(q)."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "gap-qdistrnd-0.9.5-1.1.noarch.rpm"
RPM_HASH = "55cc859d0114c4bd828ac71cc9a7629c9524fda207eb247b2c0489f4c94dee39602cb29180a1a0c643bec0ba9d7e21b35afbca83dabcc926ad30e63eac17ec03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-qdistrnd"

RDEPENDS:${PN} += "gap-autodoc \
gap-core \
gap-gapdoc \
gap-guava"

inherit rpm
