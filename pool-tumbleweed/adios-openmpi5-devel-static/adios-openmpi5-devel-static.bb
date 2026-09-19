SUMMARY = "Static libraries for adios-openmpi5"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the %{flavor} version of ADIOS."
LICENSE = "BSD-2-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "adios-openmpi5-devel-static-1.13.1-9.6.aarch64.rpm"
RPM_HASH = "24d402545c6489ffc9ce3354240e5a46a6465ddbcfb002902fec76b8a94b0e3a29c02fb14193da8357f38af080fe1365537f86d52e55cba01a74b42be8a19f04"

RPROVIDES:${PN} += "adios-openmpi5-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
