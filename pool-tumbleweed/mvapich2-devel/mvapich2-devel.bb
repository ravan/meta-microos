SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-2.3.7-12.6.aarch64.rpm"
RPM_HASH = "0c41cc4844dc3677e1b4916687f8d6cfd410bcd2b03b5b588c66f99f5595d264a4486ac3aada03081f525e50f7a5509d9525fcb60e55751f1d0e528ec2cb6ef5"

RPROVIDES:${PN} += "mvapich2-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
libibumad-devel \
libibverbs-devel \
librdmacm-devel \
mvapich2"

inherit rpm
