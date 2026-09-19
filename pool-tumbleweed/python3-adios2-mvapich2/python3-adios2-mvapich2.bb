SUMMARY = "The Adaptable IO System (ADIOS2) python libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the python libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python3-adios2-mvapich2-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "a8416738023ab2aa4984a8920900fe9d5e714f5ca471edee5943104c611ecf127a6a10e2b10b1b3532e473da18a687c0be0aea61978efac565fd70d399703f88"

RPROVIDES:${PN} += "python3-adios2-mvapich2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadios2-core-mpi.so.2.12 \
libadios2-core.so.2.12 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
python3-numpy"

inherit rpm
