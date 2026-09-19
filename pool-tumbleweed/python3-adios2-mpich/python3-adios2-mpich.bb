SUMMARY = "The Adaptable IO System (ADIOS2) python libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the python libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python3-adios2-mpich-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "cb95cfc779eaccdf05b77c10553e46e3e3e33b34d9b343619c1c163d908cbbfdcd34f9969098f33863c6b1f079bc9c7cf755c66262d33a6c240fd5c0e01e3c33"

RPROVIDES:${PN} += "python3-adios2-mpich"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadios2-core-mpi.so.2.12 \
libadios2-core.so.2.12 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-numpy"

inherit rpm
