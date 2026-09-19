SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "wannier90-openmpi4-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "121fcb51dd8d4638017bbfe78ca42f86b89d85d28a8224e33a0e7dbaf8de801f8b00fef5f8eb5f8be41d357e7f60d0341d5e1db6358287aa7fcc0e7b53fbd340"

RPROVIDES:${PN} += "wannier90-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libmpi-mpifh.so.40 \
libwannier90-mpi.so.4"

inherit rpm
