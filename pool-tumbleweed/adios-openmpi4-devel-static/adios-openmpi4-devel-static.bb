SUMMARY = "Static libraries for adios-openmpi4"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the %{flavor} version of ADIOS."
LICENSE = "BSD-2-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-devel-static-1.13.1-9.6.aarch64.rpm"
RPM_HASH = "5733be03167f15174d77d163d7bc38ce1c0130c50991bb72a60cdb0e6fb6205112da48212e68361a5fbcd50795072faa0259d0079f4649fbc1f4dd3db8bd8fa1"

RPROVIDES:${PN} += "adios-openmpi4-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
