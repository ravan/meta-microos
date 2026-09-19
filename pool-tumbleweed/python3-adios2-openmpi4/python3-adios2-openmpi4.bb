SUMMARY = "The Adaptable IO System (ADIOS2) python libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the python libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python3-adios2-openmpi4-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "7cfd11a08117fa63043beac361a5c7702d72bfa79b06dc653223688b9f3e11e9d3bf21de2bfc4e3752dbe7cfc943689f61482cbfa065f7bdd85e45dcff9c127d"

RPROVIDES:${PN} += "python3-adios2-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadios2-core-mpi.so.2.12 \
libadios2-core.so.2.12 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-numpy"

inherit rpm
