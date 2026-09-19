SUMMARY = "GAP: Unger's algorithm"
DESCRIPTION = "The package 'InduceReduce' provides an implementation of Unger's \
algorithm for computing the table of ordinary irreducile characters \
of a finite group. The algorithm works by inducing characters from \
suitably chosen elementary subgroups and finding an orthogonal basis \
of the resulting lattice of characters by LLL lattice reduction."
LICENSE = "GPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "gap-inducereduce-1.4-1.1.noarch.rpm"
RPM_HASH = "4e7a67c474ab580ee25692ac5b393873502c0f5fc73f88faa1ad977820b434a06b1f522d552f410e3758e70efb3eb6085325be6d5db7475127859cf4f6745e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-inducereduce"

RDEPENDS:${PN} += "gap-core"

inherit rpm
