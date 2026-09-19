SUMMARY = "GAP: Group construction of a given order"
DESCRIPTION = "The GrpConst package contains methods to construct up to isomorphism \
the groups of a given order. The FrattiniExtensionMethod constructs \
all soluble groups of a given order. On request it gives only those \
that are (or are not) nilpotent or supersolvable or that do (or do \
not) have normal Sylow subgroups for some given set of primes. The \
CyclicSplitExtensionMethod constructs all groups having a normal \
Sylow subgroup for orders of the type p^n *q. The method relies on \
the availability of a list of all groups of order p^n. The \
UpwardsExtensions algorithm takes as input a permutation group G and \
a positive integer s and returns a list of permutation groups, one \
for each extension of G by a soluble group of order a divisor of s. \
This method can used to construct the non-solvable groups of a given \
order by taking the perfect groups of certain orders as input for G. \
The programs in this package have been used to construct a large part \
of the Small Groups library."
LICENSE = "GPL-2.0-only"

PV = "2.7.0"

RPM_NAME = "gap-grpconst-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "a3c6d4d21742d1257bd6f0d107de663bbe3523cdeaa089450974d89bed529cd3ed46bf13f28ad8ba1e486fed8a78692b9ddadf5fb12bbd28ba0769103db2b14d"

RPROVIDES:${PN} += "gap-grpconst"

RDEPENDS:${PN} += "gap-autpgrp \
gap-core \
gap-irredsol \
gap-smallgrp"

inherit rpm
