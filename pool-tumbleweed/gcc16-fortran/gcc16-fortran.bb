SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-fortran-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "181332c09ebac67839aef50d6d71dee54e371edb3923f350e2eead57b06ddf56dd65b55e6404529211aa49dd808884a624b915ccf065c3f60e6644994cb26c93"

RPROVIDES:${PN} += "gcc16-fortran"

RDEPENDS:${PN} += "gcc16 \
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
