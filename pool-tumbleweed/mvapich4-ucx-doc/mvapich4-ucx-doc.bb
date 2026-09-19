SUMMARY = "OSU MVAPICH3 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "mvapich4-ucx-doc-4.1-1.4.aarch64.rpm"
RPM_HASH = "8265200338ab164ec47283f1924ed6406cf357a4e11891d60f30de1c60411f08e3155e9822cffd052d0cf9d3327773d2f1de8f60bd7790174c2ca8c85a15862b"

RPROVIDES:${PN} += "mvapich4-ucx-doc"

RDEPENDS:${PN} += "mvapich4-ucx"

inherit rpm
