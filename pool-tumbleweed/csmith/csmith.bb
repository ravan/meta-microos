SUMMARY = "Random C code generator"
DESCRIPTION = "Csmith is a tool that can generate random C programs that statically and \
dynamically conform to the C99 standard. It is useful for stress-testing \
compilers, static analyzers, and other tools that process C code."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "csmith-2.3.0-1.34.aarch64.rpm"
RPM_HASH = "1f2fb15df9715ac530d4b580e88e5663900db08d76f1b44c355c9bc8f10cd46dc8ec16d5b855f3dab051ebdd8d1944da975462b172cf6fd879902dd2a0570ccd"

RPROVIDES:${PN} += "csmith"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
