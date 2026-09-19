SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "libadios2-mvapich2-2_12-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "6a95a4716d93253ebfeda1751afbdd6fefe50692265527423a4c5b75cab8a62a43b8ac89b82557c063582760c920093bcc2bb7d10177a0f873cb83e7358261e1"

RPROVIDES:${PN} += "adios2-mvapich2 \
libadios2-atl.so.2.12 \
libadios2-c-mpi.so.2.12 \
libadios2-c.so.2.12 \
libadios2-core-mpi.so.2.12 \
libadios2-core.so.2.12 \
libadios2-cxx-mpi.so.2.12 \
libadios2-cxx.so.2.12 \
libadios2-dill.so.2.12 \
libadios2-enet.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libadios2-fortran-mpi.so.2.12 \
libadios2-fortran.so.2.12 \
libadios2-mvapich2-2-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.310 \
libm.so.6 \
libmpi.so.12 \
libpng16.so.16 \
libstdc++.so.6 \
libzfp.so.1 \
libzmq.so.5 \
mvapich2"

inherit rpm
