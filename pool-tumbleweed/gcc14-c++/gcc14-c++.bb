SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-c++-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "1050c3c2f60b010eb00d66b889c3fe1801dd9c092cb16c514f8d0f50d2683a6248d0e729d9e3ce7a8513f414f807a09f9bcd0ece08de52c77042463df71e5eab"

RPROVIDES:${PN} += "gcc14-c++"

RDEPENDS:${PN} += "gcc14 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
