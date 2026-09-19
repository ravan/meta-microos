SUMMARY = "Configuration panel for User accounts"
DESCRIPTION = "This package provides the online accounts onfiguration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-control-center-users-50.4-1.1.noarch.rpm"
RPM_HASH = "ece96cb089d89a2f479a35a45d547067f1313fd54101ede44b0017cafa2b387b396fb8654b44efac8c5baf2d37987f8a82afdcb042c46436de3bf55b276af0bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-users"

RDEPENDS:${PN} += "gnome-control-center"

inherit rpm
