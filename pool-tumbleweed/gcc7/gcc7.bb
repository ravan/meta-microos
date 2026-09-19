SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++ and gcc-go."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "b603addd086091d5cb679841a4cee4dcfc6cd1d049ea91a4eae452dab94cd78fa45932e1b5fd4fd517e97b637e06c9540a0735d5ec8be36422a265423dbd73ec"

RPROVIDES:${PN} += "gcc7"

RDEPENDS:${PN} += "binutils \
cpp7 \
glibc-devel \
libasan4 \
libatomic1 \
libc.so.6 \
libgcc-s.so.1 \
libgcc-s1 \
libgmp.so.10 \
libgomp1 \
libisl.so.23 \
libitm1 \
liblsan0 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libtsan0 \
libubsan0 \
libz.so.1"

inherit rpm
