SUMMARY = "Development files for Polymake plugins"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.15"

RPM_NAME = "polymake-devel-4.15-3.4.aarch64.rpm"
RPM_HASH = "4b78647f7574e2d10d8389c24d665d88fcf0ba16a498a8fe9d1e80f4933c6cca165cfb21d6ee6b3b880df34ca6b5615b321beee90ce25bc620b01edb0ecbab53"

RPROVIDES:${PN} += "polymake-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
polymake"

inherit rpm
