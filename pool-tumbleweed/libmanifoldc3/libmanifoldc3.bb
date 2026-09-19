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

RPM_NAME = "libmanifoldc3-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "a6be9d50c239d483eed3273918c1178466306396ab1b6e9f66e99de43522abf514d0adfd307c90851ff1cb94ee03634465de0d66a478761901f3d1aa7c29988a"

RPROVIDES:${PN} += "libmanifoldc.so.3 \
libmanifoldc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmanifold.so.3 \
libstdc++.so.6"

inherit rpm
