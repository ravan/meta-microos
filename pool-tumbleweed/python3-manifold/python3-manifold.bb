SUMMARY = "Python bindings for manifold"
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

RPM_NAME = "python3-manifold-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "45b8a6c82f4b213bb0ef7ceacf48b928f581427114447c26043b1a2eb0f5b00571e1e62eec12840a174d2f3584991667d38dc923b448b93ebe59458b1a439127"

RPROVIDES:${PN} += "python3-manifold"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmanifold.so.3 \
libstdc++.so.6 \
python-abi"

inherit rpm
