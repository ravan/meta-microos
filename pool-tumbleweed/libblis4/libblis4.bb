SUMMARY = "Shared library for blis"
DESCRIPTION = "BLIS is a portable software framework for instantiating high-performance \
BLAS-like dense linear algebra libraries. The framework was designed to isolate \
essential kernels of computation that, when optimized, immediately enable \
optimized implementations of most of its commonly used and computationally \
intensive operations. BLIS is written in ISO C99. \
 \
This package provides the shared library for blis."
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "libblis4-2.1-1.1.aarch64.rpm"
RPM_HASH = "7df5aebeab2b4d207cfed02b90d0ede90cee03f906e72c3cb2ddd972d3ed38703ac1f70a97ad895586d822699f7b924d3412c292abd5125d3b8ef19119af92a0"

RPROVIDES:${PN} += "libblis.so.4 \
libblis4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
