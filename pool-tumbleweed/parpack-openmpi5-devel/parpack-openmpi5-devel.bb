SUMMARY = "Development files for parpack-openmpi5"
DESCRIPTION = "The parpack-openmpi5-devel package contains libraries and header files for \
developing applications that use parpack-openmpi5."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "parpack-openmpi5-devel-3.9.1-4.3.aarch64.rpm"
RPM_HASH = "e8812b478198271ba236676a3891c36d501145de6a4b7a36cfb3ec9b1bd3e8e529f3d77bf25b9735b7cc14e39cf81a38225ae14866164ed5719a33d6ba43d99c"

RPROVIDES:${PN} += "parpack-openmpi5-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi5 \
openmpi5-devel"

inherit rpm
