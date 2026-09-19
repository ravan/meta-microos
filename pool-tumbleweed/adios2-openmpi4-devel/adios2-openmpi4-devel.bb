SUMMARY = "Development files for adios2-openmpi4"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
openmpi4 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "adios2-openmpi4-devel-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "f42299c01373527a0531ba33464fb44b531fd6808e1e7f72d534971599882b9c076b1221f9e92dd3f6a8f6b495e7d99fd57519abbf8db69276c5f93a4e2a03f8"

RPROVIDES:${PN} += "adios2-openmpi4-devel \
libEncryptionOperator.so \
libadios2-h5vol.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
hdf5-openmpi4-devel \
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
libadios2-openmpi4-2-12 \
libbz2-devel \
libc.so.6 \
libffi-devel \
libgcc-s.so.1 \
libhdf5.so.310 \
liblz4-devel \
libm.so.6 \
libmpi.so.40 \
libpng16-devel \
libsodium.so.26 \
libstdc++.so.6 \
libzfp.so.1 \
libzstd-devel \
openmpi4-devel \
python3-devel \
python3-mpi4py-devel \
python3-numpy-devel \
zeromq-devel \
zfp-devel \
zlib-devel"

inherit rpm
