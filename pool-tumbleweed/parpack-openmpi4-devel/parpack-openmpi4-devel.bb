SUMMARY = "Development files for parpack-openmpi4"
DESCRIPTION = "The parpack-openmpi4-devel package contains libraries and header files for \
developing applications that use parpack-openmpi4."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "parpack-openmpi4-devel-3.9.1-4.4.aarch64.rpm"
RPM_HASH = "9d6c19e532e4118fdc2466eff45ecd63ea58e232d3c4fa0ffb123433cb5c02d597730f5d97e3c7a4e18b6add43720bf8d120913c56b26618553aec86b17db41d"

RPROVIDES:${PN} += "parpack-openmpi4-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi4 \
openmpi4-devel"

inherit rpm
