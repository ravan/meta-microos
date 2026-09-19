SUMMARY = "Documentation files for the gnome-builder package"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "gnome-builder-doc-50.0-1.2.noarch.rpm"
RPM_HASH = "9339ecdfd4cbcfe8f53148ac66298d5362366d5b1bc78e11d055f4b5e925ac07b84743e3a06aa2c2e7522f5ba6d236d4d4aaf1f21ea1f125974fe98cb12148ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-builder-doc"

RDEPENDS:${PN} += "gnome-builder"

inherit rpm
