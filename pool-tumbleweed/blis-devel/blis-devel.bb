SUMMARY = "Headers and devel files for blis"
DESCRIPTION = "BLIS is a portable software framework for instantiating high-performance \
BLAS-like dense linear algebra libraries. The framework was designed to isolate \
essential kernels of computation that, when optimized, immediately enable \
optimized implementations of most of its commonly used and computationally \
intensive operations. BLIS is written in ISO C99. \
 \
This package provides the headers and devel files for blis."
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "blis-devel-2.1-1.1.aarch64.rpm"
RPM_HASH = "0e60084ee3533c38e88ccc91d9e458413442420afac303e48c41731804645525f8348b9d1fbbadb2f7808279fa7373a6dafa7a872b3ec21655a013eb4738c54a"

RPROVIDES:${PN} += "blis-devel \
pkgconfig-blis"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
libblis4"

inherit rpm
