SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "libadios2-openmpi4-2_12-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "d7f3379b53300eab64f7df70e08d4abbced439e985ec5a70434a500ae4fa8c9990c6ef383054b24bd9824c424c36090265ce4d25eb16b7162ca6b65eb4f89578"

RPROVIDES:${PN} += "adios2-openmpi4 \
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
libadios2-openmpi4-2-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.310 \
libm.so.6 \
libmpi.so.40 \
libpng16.so.16 \
libstdc++.so.6 \
libzfp.so.1 \
libzmq.so.5 \
openmpi4"

inherit rpm
