SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2. \
 \
 \
This package is the minimal version of ADIOS2, it does not include the extended \
dependencies like HDF5, ZFP, Blosc2, PNG, and ZeroMQ."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "libadios2-minimal-2_12-2.12.0-1.3.aarch64.rpm"
RPM_HASH = "1cac424977819ec57efdcb097a131bd5ff543e7fb91483c76440baaa52b5d7981d5850c6146bfc2607d012376aaeeb0b26f4f22b88dab2538ca1b41ee758a05c"

RPROVIDES:${PN} += "adios2-minimal \
libadios2-atl.so.2.12 \
libadios2-c.so.2.12 \
libadios2-core.so.2.12 \
libadios2-cxx.so.2.12 \
libadios2-dill.so.2.12 \
libadios2-enet.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libadios2-fortran.so.2.12 \
libadios2-minimal-2-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
