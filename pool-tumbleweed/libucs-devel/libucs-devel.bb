SUMMARY = "Development files for Unified Communication Services (UC-S)"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libucs-devel-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "d9d940f951df0da6ce1a1d401ceb1ccf131760bf956be989083ed3c23ebce93461004e51e1b0f2a72415ae9ae7b8c72bbfd58754512e790fb09d35aa598c8887"

RPROVIDES:${PN} += "libucs-devel \
pkgconfig-ucx-ucs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libucs0"

inherit rpm
