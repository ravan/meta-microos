SUMMARY = "GAP: Finite-index subgroups of (P)SL(2,Integers)"
DESCRIPTION = "This GAP package implements finite-index subgroups of (P)SL_2(ZZ) and \
various algorithms for working with them. These subgroups are stored \
as tuples of permutations s and t which describe the action of a \
certain set of generator matrices on the right cosets."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "gap-modulargroup-2.0.3-1.1.noarch.rpm"
RPM_HASH = "a62c7d442c79643de5cd293f73bdacc356c9d7b9ad80d902aa398ee34364d0f7ac34736b6ff109e66fffb6b97872122a562342f1b9e3865494226e499bc4fe51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-modulargroup"

RDEPENDS:${PN} += "gap-congruence \
gap-core \
gap-ctbllib"

inherit rpm
