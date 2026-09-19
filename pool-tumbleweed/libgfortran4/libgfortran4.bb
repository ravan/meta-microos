SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgfortran4-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "bd6dcdde902695230bf08a5a194e98ff8e61fe687af1cf3fcbc5ffbbc28b1ded1da8b1360993f6e77c9d8d0bb397b05620bbdb3d897a4ee97703ecedf0d346bd"

RPROVIDES:${PN} += "libgfortran.so.4 \
libgfortran4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
