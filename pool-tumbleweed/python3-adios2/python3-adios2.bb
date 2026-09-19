SUMMARY = "The Adaptable IO System (ADIOS2) python libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the python libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python3-adios2-2.12.0-1.3.aarch64.rpm"
RPM_HASH = "5bdb629afc8e2d941ced63f04f4322fbcf5a820fa23471af7b6a4c0949f97b34efbecff2e0d690681f6eccb3d716382684366bd8a07810177a1ca90af8b3bfc9"

RPROVIDES:${PN} += "python3-adios2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadios2-core.so.2.12 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python3-numpy"

inherit rpm
