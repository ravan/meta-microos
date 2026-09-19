SUMMARY = "Development files for adios2"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
serial version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "adios2-devel-2.12.0-1.3.aarch64.rpm"
RPM_HASH = "8eb03bd53afcfefed0d83aa2972523ebec8ffee5176a86ed1e920d104439012774c9bf8f354766f9e1b43a0c333e135d7d44cf8b7ee53756ee4a292994b9bad4"

RPROVIDES:${PN} += "adios2-devel \
cmake-FindPkg \
cmake-adios2 \
libEncryptionOperator.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libadios2-2-12 \
libadios2-atl.so.2.12 \
libadios2-core.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libbz2-devel \
libc.so.6 \
libffi-devel \
libgcc-s.so.1 \
liblz4-devel \
libm.so.6 \
libpng16-devel \
libsodium.so.26 \
libstdc++.so.6 \
libzfp.so.1 \
libzstd-devel \
python3-devel \
python3-numpy-devel \
zeromq-devel \
zfp-devel \
zlib-devel"

inherit rpm
