SUMMARY = "Development libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libscalapack2-openmpi4-devel-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "359d3906110a2d1e487848bfa38ec31b9e6b1e62151799e47bb44244c56b84ccbea063deb074c613eba460920a8d7af2789839fd3a0d9994e36d3dd4e0f3ca74"

RPROVIDES:${PN} += "libscalapack.so.2.2.2 \
libscalapack2-openmpi4-devel \
scalapack-openmpi4-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libscalapack2-openmpi4 \
openmpi4-devel"

inherit rpm
