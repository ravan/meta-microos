SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.10"

RPM_NAME = "openmpi5-testsuite-5.0.10-2.2.noarch.rpm"
RPM_HASH = "fd65e1d41f95e00b65d653ca18390e3959e40b921576bed13f6a5e69c719b040851e0cb877c35ecdc7ece164005d6368e86dfba69a89136caab2d2fb2f0e5a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi5-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openssh"

inherit rpm
