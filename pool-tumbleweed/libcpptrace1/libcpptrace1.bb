SUMMARY = "Portable C++ stacktrace library"
DESCRIPTION = "cpptrace is a library for obtaining stack traces in C++. \
It uses DWARF debug information to resolve symbols, \
file names, line numbers, and inlined calls."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libcpptrace1-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "af32a5796734b0dc77f449040147a55bc8135bde15b46a985d94cd8506cf2a1485ca887d441f2bcc7714dbf0990b3ad12fc49ebbadd431a33b61efcbcef806cd"

RPROVIDES:${PN} += "libcpptrace.so.1 \
libcpptrace1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdwarf.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
