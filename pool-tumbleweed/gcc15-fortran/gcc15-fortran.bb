SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-fortran-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "71812f8e2fb80ea777ab40d9d4033b51afdda1024ed20facfa4b8d9b4f4a7eac1e13f5a2828c5134391a770a87639b9c2b2e773191eb1d5cb07132caa8ff98c0"

RPROVIDES:${PN} += "gcc15-fortran"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran5 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
