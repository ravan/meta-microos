SUMMARY = "Parallel ray tracing system"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
Tachyon implements the basic geometric primitives such as triangles, \
planes, spheres, cylinders, etc. Tachyon parallelizes unlike POV-Ray \
and Rayshade."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "tachyon-0.99.5-1.16.aarch64.rpm"
RPM_HASH = "aaeb37dd803f838ce6d86af76f1970f6a3d60c77396e3f851b42a563c392355004299065a9263e935df2d828d585beb5c32cc6ccb91c90507fe732de9b56a0a9"

RPROVIDES:${PN} += "tachyon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libtachyon-0.99.5.so"

inherit rpm
