SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "03006160401b5cd8f613a2e3e8705078a5dcde79f7c6ce93bba06306a363616019668c873df3b0de94c420c365982278048e40bad93ff2ab0f5e5761faae3914"

RPROVIDES:${PN} += "gcc16"

RDEPENDS:${PN} += "binutils \
cpp16 \
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
