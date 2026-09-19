SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-static-2.3.7-12.6.aarch64.rpm"
RPM_HASH = "6aec8f4a58f876e15b380ef156fd6042c59ee84dc2232bdda2a6ff2859594004b4b805293527c0d94aa9fc2f5f05aca7433f45e6d2d448e774681b596e99de77"

RPROVIDES:${PN} += "mvapich2-devel-static"

RDEPENDS:${PN} += "mvapich2-devel"

inherit rpm
