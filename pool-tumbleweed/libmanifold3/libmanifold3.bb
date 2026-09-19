SUMMARY = "Shared library for manifold"
DESCRIPTION = "Manifold is a geometry library dedicated to creating and operating on manifold \
triangle meshes. A manifold mesh is a mesh that represents a solid object, and \
so is very important in manufacturing, CAD, structural analysis, etc. Manifold \
also supports arbitrary vertex properties and enables mapping of materials for \
rendering use-cases. Our primary goal is reliability: guaranteed manifold \
output without caveats or edge cases. Our secondary goal is performance: \
efficient algorithms that make extensive use of parallelization, or pipelining \
when only a single thread is available."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "libmanifold3-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "ccb0746220d1cbc99e7376468c5f4ea39a585133e971ad013878d3db5e061f00ddb9faebc366896ca26a39a1694f36d09ec90e0f1ce6b3aa1c72c7f28e614889"

RPROVIDES:${PN} += "libmanifold.so.3 \
libmanifold3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libClipper2.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
