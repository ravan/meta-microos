SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.3.3"

RPM_NAME = "libz-ng-compat1-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "08ea9934eb0682edfe7b19cdf6056ab6d9c012d161ec5fc9e532d797782aac52c6b6597f2fa6b94d5db28799a8eebbc117c9614c3b507f77292c0ab2a4af7a43"

RPROVIDES:${PN} += "config-libz-ng-compat1 \
libz-ng-compat1 \
libz.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
