SUMMARY = "Library for finding vertices of convex polytopes"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities."
LICENSE = "GPL-2.0-or-later"

PV = "0.94n"

RPM_NAME = "libcdd0-0.94n-1.5.aarch64.rpm"
RPM_HASH = "424abec7650dd404f495a2e972ad43c12edc928a294ab34c55180b6a08a2518b57aae34c00d832f44b7362b6d4f3603369da20071e2b6fb0a075a4988ba06e83"

RPROVIDES:${PN} += "libcdd.so.0 \
libcdd0 \
libcddgmp.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
