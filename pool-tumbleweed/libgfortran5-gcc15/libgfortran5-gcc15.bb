SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libgfortran5-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "f5db5005ecaf7ca7fdebe087af783dc87614b7b3485aded909f40ab4f927ac893391665b99bd68d9ff699767e297d0c73089ca2145b2c511e155bfd6aed9a4d0"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5 \
libgfortran5-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
