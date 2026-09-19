SUMMARY = "Development files for manifold"
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

RPM_NAME = "manifold-devel-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "6a88aebe906fe06dd71d553e4c4719ef38de8d1b5bcb71f31088f1ac3c4c578fd9242a33ffa69255a754ae0dfe9a7e455fb88aa25f489097a5a973cd26d2cc7e"

RPROVIDES:${PN} += "cmake-manifold \
manifold-devel \
pkgconfig-manifold"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Clipper2 \
cmake-assimp \
libmanifold3 \
libmanifoldc3"

inherit rpm
