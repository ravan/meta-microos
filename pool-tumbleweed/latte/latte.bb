SUMMARY = "Computations with polyhedra"
DESCRIPTION = "LattE (Lattice point Enumeration) is a software dedicated to the \
problems of counting lattice points and integration inside convex \
polytopes. LattE contains an implementation of Barvinok's algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.6"

RPM_NAME = "latte-1.7.6-2.1.aarch64.rpm"
RPM_HASH = "b0ba6ad5a3994883fd9542342b8a55d6d064e6686882ac480306455b3e0458ae8c508cf32d2fd7a2f0371ae49aff507b73c693e60047476bca46f0e791a33ed4"

RPROVIDES:${PN} += "latte \
liblatte.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
4ti2 \
cddlib-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcddgmp.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libntl.so.45 \
libstdc++.so.6"

inherit rpm
