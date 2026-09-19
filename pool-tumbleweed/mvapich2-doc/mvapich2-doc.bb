SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-doc-2.3.7-12.6.aarch64.rpm"
RPM_HASH = "24324508494415dac362a5089bf178e14f7c1eb0119aa93a03a16b721c489963409877d437d1856ca009d8e928ddb4109605611cb645a27cc3a41bdb39c257a6"

RPROVIDES:${PN} += "mvapich2-doc"

RDEPENDS:${PN} += "mvapich2"

inherit rpm
