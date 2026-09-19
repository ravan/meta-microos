SUMMARY = "Development libraries for ScaLAPACK (openmpi5)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi5."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libscalapack2-openmpi5-devel-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "c67f57e36f2f1eb575c92768890d7606eb592fd639ca814bbb273df9eed72a20928a0708aa05df7a3a70106d661e4dcdf7d0fe706f017558eb71a89d017e00d1"

RPROVIDES:${PN} += "libscalapack-openmpi-devel \
libscalapack.so.2.2.2 \
libscalapack2-openmpi5-devel \
scalapack-openmpi5-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libscalapack2-openmpi5 \
openmpi5-devel"

inherit rpm
