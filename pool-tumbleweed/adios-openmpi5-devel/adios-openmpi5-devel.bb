SUMMARY = "Development files for adios-openmpi5"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the %{flavor} version of ADIOS."
LICENSE = "BSD-2-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "adios-openmpi5-devel-1.13.1-9.6.aarch64.rpm"
RPM_HASH = "738219fe433c224840c74b81f340cfe2736c0440aaba9c6d0742a2786eb3b0460eec91b19a325469ff6c3cda3b279d4afc6f84a888a3bb67c8c1be65a323378a"

RPROVIDES:${PN} += "adios-openmpi5-devel"

RDEPENDS:${PN} += "adios-openmpi5 \
adios-openmpi5-devel-static \
hdf5-openmpi5-devel \
netcdf-openmpi5-devel"

inherit rpm
