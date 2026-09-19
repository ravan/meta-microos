SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "libadios2-mpich-2_12-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "07a6b3258c14cd87efb6b1a56f30b667e34e32a487d0f7ba0d25cc0214f214a5d3bdbe041b16ed414a0accf788cddd463c7e81db30072a2f1ff60dfeb8df9db9"

RPROVIDES:${PN} += "adios2-mpich \
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
libadios2-mpich-2-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libpng16.so.16 \
libstdc++.so.6 \
libzfp.so.1 \
libzmq.so.5 \
mpich"

inherit rpm
