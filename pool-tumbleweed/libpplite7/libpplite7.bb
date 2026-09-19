SUMMARY = "Library for computations with polyhedra"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification."
LICENSE = "GPL-3.0-or-later"

PV = "0.14"

RPM_NAME = "libpplite7-0.14-1.1.aarch64.rpm"
RPM_HASH = "423249845aa29ca11f4dc2acaaf8df02331c294d8bde919fd941cd886c6242362e98b22fa764a01e47b8af648ad85f2f4024b6806a3829b31f3e199e0c42527c"

RPROVIDES:${PN} += "libpplite.so.7 \
libpplite7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
