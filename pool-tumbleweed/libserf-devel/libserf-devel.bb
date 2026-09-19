SUMMARY = "High-Performance Asynchronous HTTP Client Library"
DESCRIPTION = "The serf library is a C-based HTTP client library built upon the Apache \
Portable Runtime (APR) library. It multiplexes connections, running the \
read/write communication asynchronously. Memory copies and transformations are \
kept to a minimum to provide high performance operation."
LICENSE = "Apache-2.0"

PV = "1.3.10"

RPM_NAME = "libserf-devel-1.3.10-2.9.aarch64.rpm"
RPM_HASH = "31a0192695a7b2e4e1f069517110dd0fe998018f2a054b27cc0a2de6bd9ae653f25432616385e6aa2efea69e0d4d519662b9b39519effbf26460253d88decf53"

RPROVIDES:${PN} += "libserf-devel \
pkgconfig-serf-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserf-1-1 \
pkgconfig-libcrypto \
pkgconfig-libssl"

inherit rpm
