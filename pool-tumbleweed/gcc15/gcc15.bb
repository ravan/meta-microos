SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "1b846df5415a1ea848720bcfdddf2b6032f39a9b2d20eedc27906e0057cca5505c78eff750a237e798d6cf568cc85100c132774917a647327dd5b16307171286"

RPROVIDES:${PN} += "gcc15"

RDEPENDS:${PN} += "binutils \
cpp15 \
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
