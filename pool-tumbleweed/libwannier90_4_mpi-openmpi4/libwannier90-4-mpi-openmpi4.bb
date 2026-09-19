SUMMARY = "Library for generating maximally-localized Wannier functions - shared library"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy. \
 \
This package provides the shared library for wannier90."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libwannier90_4_mpi-openmpi4-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "ebf65c9b9bf2dea9707c19b9c7d25343ce57249cbd0f01b088e1ddeab3899d63fbb63f0c7ced9fab670bf3f785ddc21f269e657b0372f02a20baacbe9081b7e3"

RPROVIDES:${PN} += "libwannier90-4-mpi-openmpi4 \
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
