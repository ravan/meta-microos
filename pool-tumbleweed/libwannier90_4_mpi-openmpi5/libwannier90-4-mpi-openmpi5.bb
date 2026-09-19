SUMMARY = "Library for generating maximally-localized Wannier functions - shared library"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy. \
 \
This package provides the shared library for wannier90."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libwannier90_4_mpi-openmpi5-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "1da9ea84f8e565ccfae6fa406a2663f98b28405d703ea6f5f60dfdf7e7f38a9fa8506d4b6b9ae8132f6726eb96de54d8367be4779fa76456a365b94851430d88"

RPROVIDES:${PN} += "libwannier90-4-mpi-openmpi5 \
libwannier90-mpi.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi.so.40"

inherit rpm
