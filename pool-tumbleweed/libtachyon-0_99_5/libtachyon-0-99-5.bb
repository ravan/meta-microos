SUMMARY = "Core library for the Tachyon Parallel Ray Tracing System"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
Tachyon implements the basic geometric primitives such as triangles, \
planes, spheres, cylinders, etc. Tachyon parallelizes unlike POV-Ray \
and Rayshade."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "libtachyon-0_99_5-0.99.5-1.16.aarch64.rpm"
RPM_HASH = "8df49f942bfea077dbffe294822fd313dcfabe806ad103d8acf14cc3eb55900566ca36847561d2a3b9421c354b2682482a5f958aad4ed0fc5db886a0400b1524"

RPROVIDES:${PN} += "libtachyon-0-99-5 \
libtachyon-0.99.5.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libmvec.so.1 \
libpng16.so.16"

inherit rpm
