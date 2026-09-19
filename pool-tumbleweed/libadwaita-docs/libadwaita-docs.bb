SUMMARY = "Developer documentation for libadwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the documentation for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.3"

RPM_NAME = "libadwaita-docs-1.9.3-1.1.noarch.rpm"
RPM_HASH = "75a8b966794098660fed4279f569bdf14bf47f85e997a8af6a94ca092a0e21a856308751ac8c22520865d82f60ae954c543d1a6cd885cd451aa2c823b051eebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-docs"

RDEPENDS:${PN} += ""

inherit rpm
