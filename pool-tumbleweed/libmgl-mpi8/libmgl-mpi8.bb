SUMMARY = "MathGL library with MPI support"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl-mpi8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "c7baabf10a23113f97e343506706f00af49161ebfe0fa5333b04d5a73f58ef098c310d9fd87012e3bc3c68c8ab361142547c07c8475ba044cc1ccd67e72bf866"

RPROVIDES:${PN} += "libmgl-mpi.so.8 \
libmgl-mpi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libmgl.so.8 \
libmpi.so.40 \
libstdc++.so.6 \
openmpi5-libs"

inherit rpm
