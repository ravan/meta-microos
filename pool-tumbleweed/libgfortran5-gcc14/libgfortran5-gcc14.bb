SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libgfortran5-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "f63c3bec8cb3280881401a81e506cb7522c9f4e730af17d0cd965ad9299a3cd25e682b6287a780846da27a2aca228c5ff34f7cd08a03c426126fd44519461fc5"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5 \
libgfortran5-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
