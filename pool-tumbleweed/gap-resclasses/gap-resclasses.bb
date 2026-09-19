SUMMARY = "GAP: Set-Theoretic Computations with Residue Classes"
DESCRIPTION = "ResClasses is a package for set-theoretic computations with residue \
classes of the integers and a couple of other rings. The class of \
sets which ResClasses can deal with includes the open and the closed \
sets in the topology on the respective ring which is induced by \
taking the set of all residue classes as a basis, as far as the usual \
restrictions imposed by the finiteness of computing resources permit \
this."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.4"

RPM_NAME = "gap-resclasses-4.7.4-1.3.noarch.rpm"
RPM_HASH = "b3d164905806f8b6c2c37075fd7804614316032cfd61a03c971cdd9ef5bdc0a24a6e5386668e93f661e0fbe18427fe043be3e37e85cd0e3fd72c653ded386b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-resclasses"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-polycyclic \
gap-utils"

inherit rpm
