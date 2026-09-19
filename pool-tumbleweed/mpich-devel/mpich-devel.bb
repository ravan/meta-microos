SUMMARY = "SDK for MPICH version 5.0.1"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "mpich-devel-5.0.1-1.3.aarch64.rpm"
RPM_HASH = "7fd2ddd34baef908fd4936b2da36d9203218196ab3b4766975e57054f1302d6ab7d96c4e3933a4f0648d7ac646538db12a1f6c9d61800dd244bed0cd3c269c1f"

RPROVIDES:${PN} += "mpich-devel"

RDEPENDS:${PN} += "libstdc++-devel \
mpich"

inherit rpm
