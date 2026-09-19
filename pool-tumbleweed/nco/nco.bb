SUMMARY = "Suite of programs for manipulating NetCDF/HDF files"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats."
LICENSE = "BSD-3-Clause"

PV = "5.3.9"

RPM_NAME = "nco-5.3.9-1.2.aarch64.rpm"
RPM_HASH = "615b04f03e8a9d8764e86e03d91992954bf64e1ddb13f92e1bd393f90297310ebf3a3112c318027e14e2d9fc874b931c87ed63c0b766669946fa074197c316f0"

RPROVIDES:${PN} += "nco"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.28 \
libm.so.6 \
libnco-5.3.9.so \
libstdc++.so.6"

inherit rpm
