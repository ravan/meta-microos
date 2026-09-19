SUMMARY = "A library of common math and DSP functions optimized for ARM NEON"
DESCRIPTION = "The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the shared library with tests."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libNE10_test10-1.2.1-4.3.aarch64.rpm"
RPM_HASH = "41e36c45bb7179f16f8bcb9dc90a52ea8e38eb927f53ec150ee165bb55cb5aea4fa72da775f83f157d5f109f8d69216bf83da3e7613f21e6d2f6c3f09c520075"

RPROVIDES:${PN} += "libNE10-test.so.10 \
libNE10-test10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
