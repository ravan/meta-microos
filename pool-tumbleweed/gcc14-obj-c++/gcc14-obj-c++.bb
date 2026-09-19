SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-obj-c++-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "d55043e6346ec2b2d7420b72826a0d59ca96409163dd862efc6b4486730b6eeb52b7be2bfced4c366285a6ae1c6246a4b167df12dfe9a2e1e970b5a84c1c30d5"

RPROVIDES:${PN} += "gcc14-obj-c++"

RDEPENDS:${PN} += "gcc14-c++ \
gcc14-objc \
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
