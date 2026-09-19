SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "4.1.8"

RPM_NAME = "openmpi4-testsuite-4.1.8-4.7.noarch.rpm"
RPM_HASH = "c6baad2948bb086a65c90afe455e98bb6fd9b8a4d3e6d7a1c0e2db63a69a6f9be5b717ffa54a6f0b549892199eb5f1441b3705a9fcef1f46b7269475778c61bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi4-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openssh"

inherit rpm
