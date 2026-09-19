SUMMARY = "Runtime C++ ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libantlr4-runtime4_13_0-4.13.0-7.5.aarch64.rpm"
RPM_HASH = "bf8cda156a7d91e41836ef0e1285e9fd9e7123e5e9054570eb5424264b3ad20c4ba66a5295f84df9ce1d90c8144309a2160358d8a22b54917dbe0ed8d36234b6"

RPROVIDES:${PN} += "libantlr4-runtime.so.4.13.0 \
libantlr4-runtime4-13-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
