SUMMARY = "Configuration panel for color management"
DESCRIPTION = "This package provides the color management configuration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-control-center-color-50.4-1.1.noarch.rpm"
RPM_HASH = "48ed52e8987a9cb802def13491387276dc8aea625bf6b507107fdc57a573a1a953c359c90e81188a36278e458fe276ffc49b36e93e6c639a7dd448e5d80905a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-color"

RDEPENDS:${PN} += "colord \
gnome-color-manager \
gnome-control-center"

inherit rpm
