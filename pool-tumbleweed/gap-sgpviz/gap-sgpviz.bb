SUMMARY = "GAP: A package for semigroup visualization"
DESCRIPTION = "The SgpViz package, is a package with some visualization functions \
for semigroups. The features of this package include: \
 \
* drawing the D-Classes of a semigroup and the D-Class of an element \
  of a semigroup \
* computing a minimal factorization of an element of semigroup in the \
  generators \
* drawing the Schutzenberger graphs of an inverse semigroup \
* computing the right Cayley graph of a semigroup \
* a Tcl/Tk interface to specify a semigroup"
LICENSE = "GPL-2.0+"

PV = "0.999.6"

RPM_NAME = "gap-sgpviz-0.999.6-1.6.noarch.rpm"
RPM_HASH = "4e8ad20a195b8c06c773191d0b9286eabbb885727a109d1dc702224934dc8f45419871a65fea39f27614f746933c9766374b373d44b64757922434d0f6f68dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sgpviz"

RDEPENDS:${PN} += "gap-automata \
gap-core"

inherit rpm
