SUMMARY = "Development files for adios2-mpich"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
mpich version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "adios2-mpich-devel-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "0909d00cb18d076c4c7542fbc1d4baf07b638103f30edcd69e13b0ff0e965eca68dba1c5b70f06adcde6e6da59f4c3d5512f76168e8bab30c756626fde9e413b"

RPROVIDES:${PN} += "adios2-mpich-devel \
libEncryptionOperator.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.12 \
libadios2-core-mpi.so.2.12 \
libadios2-core.so.2.12 \
libadios2-cxx-mpi.so.2.12 \
libadios2-cxx.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libadios2-mpich-2-12 \
libbz2-devel \
libc.so.6 \
libffi-devel \
libgcc-s.so.1 \
liblz4-devel \
libm.so.6 \
libmpi.so.12 \
libpng16-devel \
libsodium.so.26 \
libstdc++.so.6 \
libzfp.so.1 \
libzstd-devel \
mpich-devel \
python3-devel \
python3-mpi4py-devel \
python3-numpy-devel \
zeromq-devel \
zfp-devel \
zlib-devel"

inherit rpm
