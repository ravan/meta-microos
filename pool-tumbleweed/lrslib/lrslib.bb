SUMMARY = "Reverse Search Vertex Enumeration program"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. Input file formats are compatible with the \
cddlib package. All computations are done exactly in either \
multiple precision or fixed integer arithmetic. Output is not stored \
in memory, so even problems with very large output sizes can \
sometimes be solved."
LICENSE = "GPL-2.0-or-later"

PV = "7.3a"

RPM_NAME = "lrslib-7.3a-1.4.aarch64.rpm"
RPM_HASH = "36c58ce493225c12707a9ee11c4d42fd623b6f25f5cc36001ccb68a643f95aad67e30a2b46b86f09bbbab0d74887458d09138262d33aba4eccb36c34ae8ae3b7"

RPROVIDES:${PN} += "lrslib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
liblrs.so.1"

inherit rpm
