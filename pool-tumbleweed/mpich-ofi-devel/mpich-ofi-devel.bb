SUMMARY = "SDK for MPICH version 5.0.1"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "mpich-ofi-devel-5.0.1-1.3.aarch64.rpm"
RPM_HASH = "9b3c6235456c833f427158690f9aa5df4628881a35ab4aa1e5c1e85e0e9aac89253b6439bc30f94d1f9ce4cc1468e2bbef5a303189c80935e5538edc8efd5aab"

RPROVIDES:${PN} += "mpich-ofi-devel"

RDEPENDS:${PN} += "libstdc++-devel \
mpich-ofi"

inherit rpm
