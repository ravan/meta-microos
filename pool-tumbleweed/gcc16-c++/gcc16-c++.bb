SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-c++-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "88d0ea7ecbb4c1a86c4376893766bd76c850276d20fe529052acfb1eb29a51f235dffb3dd653b5059e90c507196956589a3154044c6ea051b0cbf6a4c47d8315"

RPROVIDES:${PN} += "gcc16-c++"

RDEPENDS:${PN} += "gcc16 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
