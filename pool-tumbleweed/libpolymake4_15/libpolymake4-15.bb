SUMMARY = "Library for studying combinatorics and geometry of convex polytopes"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.15"

RPM_NAME = "libpolymake4_15-4.15-3.4.aarch64.rpm"
RPM_HASH = "43d7f546244c7317bf6a9871d01493cfee372720d1010674bdb92b04958909cca18e855c4a228aef6e1e194c86b39c855348021df415fcd33783d4a4fe3a8284"

RPROVIDES:${PN} += "libpolymake.so.4.15 \
libpolymake4-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libgomp.so.1 \
libm.so.6 \
libmpfr.so.6 \
libperl.so \
libstdc++.so.6"

inherit rpm
