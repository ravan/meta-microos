SUMMARY = "Copic Colors for The Inkscape Palettes"
DESCRIPTION = "An original set of vector icons designed specifically for Pantheon. \
 \
This package contains a palette file for Inkscape."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "pantheon-icons-inkscape-palette-8.2.0-1.3.noarch.rpm"
RPM_HASH = "51d44bd0accda12fcc6e64c87b500f5a9f82db62b310bee7c4294680f460ee7ce73e0e275ee00b6ddc6535b1b8bc326f8f3f5e3be265d5ab85097b8757dd5683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pantheon-icons-inkscape-palette"

RDEPENDS:${PN} += "inkscape \
pantheon-icons"

inherit rpm
