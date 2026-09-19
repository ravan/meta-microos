SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi4 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "libHYPRE301-openmpi4-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "95e0dfc5222766b74e5447d25693f1cb1d33de84cd588d7a4d6777a8d8ff2dc0185c507b0db2c668c9fc660bd6332e7aaf865e667162b7c7d59665706f7afc9e"

RPROVIDES:${PN} += "libHYPRE.so.301 \
libHYPRE301-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40"

inherit rpm
