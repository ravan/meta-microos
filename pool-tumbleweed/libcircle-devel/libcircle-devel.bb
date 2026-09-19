SUMMARY = "Development headers and libraries for libcircle"
DESCRIPTION = "A simple interface for processing workloads using an automatically distributed global queue. \
 \
This package contains development headers and libraries for libcircle"
LICENSE = "BSD-3-Clause-LBNL"

PV = "0.3"

RPM_NAME = "libcircle-devel-0.3-2.3.aarch64.rpm"
RPM_HASH = "eaf7d1f44a40c913139e95e25280234b70532e941b0d931d6430d7ef4aed7e71b63f2391f754a8d2f96d41ccbb38a46de4462306f1de7cd3abbeb63087c5f584"

RPROVIDES:${PN} += "libcircle-devel \
pkgconfig-libcircle"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcircle2"

inherit rpm
