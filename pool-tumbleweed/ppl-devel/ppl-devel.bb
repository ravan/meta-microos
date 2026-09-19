SUMMARY = "Development tools for the Parma Polyhedra Library C and C++ interfaces"
DESCRIPTION = "The header files, Autoconf macro, and ppl-config tool for developing \
applications using the Parma Polyhedra Library through its C and C++ \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-devel-1.2-3.12.aarch64.rpm"
RPM_HASH = "8b4935876b5229823e48eb8ec63affe784cc3dd60b83c24b009b5208378858b21305cc53f47e1e1f8d565ed75079039f4c725a416556779bdc9dbb1ac3e75f36"

RPROVIDES:${PN} += "ppl-devel"

RDEPENDS:${PN} += "gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libppl-c4 \
libppl.so.14 \
libppl14 \
libstdc++.so.6"

inherit rpm
