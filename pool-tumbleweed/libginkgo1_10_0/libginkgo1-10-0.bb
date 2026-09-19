SUMMARY = "Numerical linear algebra library for sparse linear systems - shared library"
DESCRIPTION = "Ginkgo is a high-performance numerical linear algebra library for many-core \
systems, with a focus on solution of sparse linear systems. \
 \
This package provides the shared libraries for ginkgo."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "libginkgo1_10_0-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "77dedb391e2e60e7e0e66d5e653dc1b8c37927b76d7d54abb50f22a3ab11d643153c244b3162276ce82bd1e25b09457f91d7c516e6760abb6100b1c79a9dca4f"

RPROVIDES:${PN} += "libginkgo-cuda.so.1.10.0 \
libginkgo-device.so.1.10.0 \
libginkgo-dpcpp.so.1.10.0 \
libginkgo-hip.so.1.10.0 \
libginkgo-omp.so.1.10.0 \
libginkgo-reference.so.1.10.0 \
libginkgo.so.1.10.0 \
libginkgo1-10-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmetis.so.5 \
libstdc++.so.6"

inherit rpm
