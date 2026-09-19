SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libgfortran5-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "00f7e4ad6ed3fcaf6edb4ecbdc8b2f6ec94247d6579b31420be0e7f08c5a942de74d18001f97538e275d6634e6213529828cd5a10207056311d7b6e8f183a7f7"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5 \
libgfortran5-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
