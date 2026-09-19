SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-fortran-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "51c84160c176a89a782661cd509f10384f6d1a6b4e2863e3356a69120c94ddf7aa7a7295a04787c610f373d67ba34f29a68da3d3bfed2640bf8b2bfbb37478e8"

RPROVIDES:${PN} += "gcc7-fortran"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran4 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
