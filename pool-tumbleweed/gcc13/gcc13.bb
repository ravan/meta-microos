SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "7544eb9f4eaf12fa958d0973bd3c836c815151e032ae2f162284acfa64142bcdd2d9f73967a8c6fcf7bc06a6169bcf07de9909561c4840ddb8cd575cd03beeb4"

RPROVIDES:${PN} += "gcc13"

RDEPENDS:${PN} += "binutils \
cpp13 \
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
