SUMMARY = "Mexico datum grids for Proj"
DESCRIPTION = "Mexico datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-mx-9.8.1-2.3.noarch.rpm"
RPM_HASH = "42e19386d0e609c0b63789240fbd3631f858161b8cfae18bbf19e1a1c6b07a745abbce374f3452be58c5cd1299b1d417fbfaeec520c0a97cb77f5adc0e4b9e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-mx"

RDEPENDS:${PN} += ""

inherit rpm
