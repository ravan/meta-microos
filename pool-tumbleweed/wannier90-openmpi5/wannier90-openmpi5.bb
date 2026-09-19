SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "wannier90-openmpi5-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "4849ee73a2c1d36db997b9cd2629d902a0079cc5187d0f627563a0f36ace5e66ba8382a6eb5b775598e8cb8c564aba61471ea8a9c9e1468bea96891d077f01a4"

RPROVIDES:${PN} += "wannier90-openmpi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libmpi-mpifh.so.40 \
libwannier90-mpi.so.4"

inherit rpm
