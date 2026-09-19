SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "libadios2-2_12-2.12.0-1.3.aarch64.rpm"
RPM_HASH = "29f276e522387a3e57e176dab56cf18db4370a9a44f2101721a695ef4cb71ff371d92bdbf119233f04dbd8e62037748882e318ea70aee93adb974312ed3296f9"

RPROVIDES:${PN} += "adios2 \
libadios2-2-12 \
libadios2-atl.so.2.12 \
libadios2-c.so.2.12 \
libadios2-core.so.2.12 \
libadios2-cxx.so.2.12 \
libadios2-dill.so.2.12 \
libadios2-enet.so.2.12 \
libadios2-evpath.so.2.12 \
libadios2-ffs.so.2.12 \
libadios2-fortran.so.2.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libzfp.so.1 \
libzmq.so.5"

inherit rpm
