SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-fortran-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "299d1c7d5fd260506f4dc9f7177e9602d6b64a62d1e11b0cf1fa89f8d7892df3babc0130d096169f0e976c9d7913afa7daf7e5b427f5f464bb82348a528235e7"

RPROVIDES:${PN} += "gcc14-fortran"

RDEPENDS:${PN} += "gcc14 \
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
