SUMMARY = "Reverse Search Vertex Enumeration library"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. Input file formats are compatible with the \
cddlib package. Computations are done in multiprecision \
arithmetic."
LICENSE = "GPL-2.0-or-later"

PV = "7.3a"

RPM_NAME = "liblrs1-7.3a-1.4.aarch64.rpm"
RPM_HASH = "1ecb4b97dd95e91cc9c068c99e9e863c9df975a5278bc522d291071e6b36f5aec957b36f9667fa04ef54113f2134aa6a4ae584f4014f0b75c8887704a1022473"

RPROVIDES:${PN} += "liblrs.so.1 \
liblrs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
