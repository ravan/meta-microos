SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "7ae152767be9e1c0c92e07e3fc31626f34e9074bbd06fa99f7974cdfe2b6f5b23799065cad5d6808a41218b8baeebc9d1341a17f60d414a48c671811024b9c2e"

RPROVIDES:${PN} += "gcc14"

RDEPENDS:${PN} += "binutils \
cpp14 \
glibc-devel \
ld-linux-aarch64.so.1 \
libasan8 \
libatomic1 \
libc.so.6 \
libgcc-s.so.1 \
libgcc-s1 \
libgmp.so.10 \
libgomp1 \
libhwasan0 \
libisl.so.23 \
libitm1 \
liblsan0 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libtsan2 \
libubsan1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
