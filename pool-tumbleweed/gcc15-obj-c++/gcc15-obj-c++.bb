SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-obj-c++-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "3cd91e816c13e820834b57969141493c92e5f98883b461d59f6b2e82f77919793ded98a74fcc5653743bd811746dc09d8d0818f9316f7f45bae00d3ff08e25f1"

RPROVIDES:${PN} += "gcc15-obj-c++"

RDEPENDS:${PN} += "gcc15-c++ \
gcc15-objc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
