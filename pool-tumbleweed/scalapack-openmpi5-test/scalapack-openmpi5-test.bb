SUMMARY = "Test programs for ScaLAPACK (openmpi5)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi5."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "scalapack-openmpi5-test-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "353060b1949b4018c19c9401d7c467f6a4795acac2741fd092a236c1da3c4ea3d9c69c1d963968187ca068eb253ff87722d60c2a270441a75aec58bc862a0667"

RPROVIDES:${PN} += "scalapack-openmpi5-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi.so.40"

inherit rpm
