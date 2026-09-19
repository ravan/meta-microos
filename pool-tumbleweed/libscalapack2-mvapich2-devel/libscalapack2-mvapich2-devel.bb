SUMMARY = "Development libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libscalapack2-mvapich2-devel-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "902f0f881547e7e799fc894d6a36698948d5120b1c050d55af95cfa8a6c6a955c7b68b7c32c38d7a1d56b63490e17e46e550fad3a3356f31b095e64f56b2ad9c"

RPROVIDES:${PN} += "libscalapack.so.2.2.2 \
libscalapack2-mvapich2-devel \
scalapack-mvapich2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscalapack2-mvapich2 \
mvapich2-devel"

inherit rpm
