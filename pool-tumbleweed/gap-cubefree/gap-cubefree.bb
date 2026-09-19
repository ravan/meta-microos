SUMMARY = "GAP: Construction of groups of a given cubefree order"
DESCRIPTION = "The Cubefree package contains methods to construct up to isomorphism \
the groups of a given (reasonable) cubefree order. The main function \
ConstructAllCFGroups(n) constructs all groups of a given cubefree \
order n. The function NumberCFGroups(n) counts all groups of a \
cubefree order n. Furthermore, IrreducibleSubgroupsOfGL(2,q) \
constructs the irreducible subgroups of GL(2,q), q=p^r, p>=5 prime, \
up to conjugacy and RewriteAbsolutelyIrreducibleMatrixGroup(G) \
rewrites the absolutely irreducible matrix group G (over a finite \
field) over a minimal subfield."
LICENSE = "GPL-2.0-or-later"

PV = "1.22"

RPM_NAME = "gap-cubefree-1.22-1.1.noarch.rpm"
RPM_HASH = "6d35471be737bb77b5da324b88924e92bc29cdbccae883f329f1485dc5e74c70227f4755666639c40697acdc087c8d797d68b989e0c79560ba30fc7265502fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-cubefree"

RDEPENDS:${PN} += "gap-core \
gap-grpconst \
gap-polycyclic \
gap-smallgrp"

inherit rpm
