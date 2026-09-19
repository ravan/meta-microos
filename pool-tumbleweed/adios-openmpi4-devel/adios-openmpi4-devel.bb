SUMMARY = "Development files for adios-openmpi4"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the %{flavor} version of ADIOS."
LICENSE = "BSD-2-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-devel-1.13.1-9.6.aarch64.rpm"
RPM_HASH = "1e18ce0bd91f571b6fdc30666deaa45b955bf6142c682af44cfae013deb9b91fb28c1c88dd76316c0ed716ced2c734e66330d3c84fb15bbb68f262d53bd603b5"

RPROVIDES:${PN} += "adios-openmpi4-devel"

RDEPENDS:${PN} += "adios-openmpi4 \
adios-openmpi4-devel-static \
hdf5-openmpi4-devel \
netcdf-openmpi4-devel"

inherit rpm
