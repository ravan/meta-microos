SUMMARY = "Development files for adios2-minimal"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
serial version of ADIOS2. \
 \
 \
This package is the minimal version of ADIOS2, it does not include the extended \
dependencies like HDF5, ZFP, Blosc2, PNG, and ZeroMQ."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "adios2-minimal-devel-2.12.0-1.3.aarch64.rpm"
RPM_HASH = "db4edbb1e89d981d369aeaa603ec57f08a9757f9dd922afd1f4258084d0a5f918f90d16d6d4067aeb8d46f53c060a652c1ae99ad070a9da520b12677e1e3ebad"

RPROVIDES:${PN} += "adios2-minimal-devel \
cmake-FindPkg \
cmake-adios2"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.12 \
libadios2-core.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libadios2-minimal-2-12 \
libbz2-devel \
libc.so.6 \
libffi-devel \
libgcc-s.so.1 \
liblz4-devel \
libm.so.6 \
libstdc++.so.6 \
libzstd-devel \
zlib-devel"

inherit rpm
