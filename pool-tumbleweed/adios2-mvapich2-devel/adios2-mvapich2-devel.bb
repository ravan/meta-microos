SUMMARY = "Development files for adios2-mvapich2"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
mvapich2 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "adios2-mvapich2-devel-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "38f8ae825e7422541c038da472d2d60baec2aa2af496f99bd43d83f1d4282efd66b917a7ac03a91d67d990e63326e0a848231848ffd3d7b1ce7af7288c2c5e59"

RPROVIDES:${PN} += "adios2-mvapich2-devel \
libEncryptionOperator.so \
libadios2-h5vol.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
hdf5-mvapich2-devel \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.12 \
libadios2-c-mpi.so.2.12 \
libadios2-c.so.2.12 \
libadios2-core-mpi.so.2.12 \
libadios2-core.so.2.12 \
libadios2-cxx-mpi.so.2.12 \
libadios2-cxx.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libadios2-mvapich2-2-12 \
libbz2-devel \
libc.so.6 \
libffi-devel \
libgcc-s.so.1 \
libhdf5.so.310 \
liblz4-devel \
libm.so.6 \
libmpi.so.12 \
libpng16-devel \
libsodium.so.26 \
libstdc++.so.6 \
libzfp.so.1 \
libzstd-devel \
mvapich2-devel \
python3-devel \
python3-mpi4py-devel \
python3-numpy-devel \
zeromq-devel \
zfp-devel \
zlib-devel"

inherit rpm
