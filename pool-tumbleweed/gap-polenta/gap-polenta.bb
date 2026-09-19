SUMMARY = "GAP: Polycyclic presentations for matrix groups"
DESCRIPTION = "The Polenta package provides methods to compute polycyclic \
presentations of matrix groups (finite or infinite). As a by-product, \
this package gives some functionality to compute certain module \
series for modules of solvable groups. For example, if G is a \
rational polycyclic matrix group, then we can compute the radical \
series of the natural Q[G]-module Q^d."
LICENSE = "GPL-2.0+"

PV = "1.3.11"

RPM_NAME = "gap-polenta-1.3.11-1.4.noarch.rpm"
RPM_HASH = "2aafc21106f1d0a368cb3cf817d96f5b5e8880246e2842a2c504fed06fce686e10abdddcd1ceb0d9fab10e545df6f9602ebcaf0891e1a63f14d5d6cdb8ebfa3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-polenta"

RDEPENDS:${PN} += "gap-alnuth \
gap-core \
gap-polycyclic \
gap-radiroot"

inherit rpm
