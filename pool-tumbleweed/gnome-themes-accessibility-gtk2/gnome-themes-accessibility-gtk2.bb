SUMMARY = "Accessibility GNOME Themes"
DESCRIPTION = "This package contains high-contrast and low-contrast themes for gtk2 applications."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gnome-themes-accessibility-gtk2-3.28-3.5.noarch.rpm"
RPM_HASH = "24767dcd96dfd18878ccbb4a8b454eeabecca58d55811cdc677fee2f6a6c374c758f76cb65d50d3768cf82a751bc1e0a85008a36a9d31010cebe4dd75991ff3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-accessibility-gtk2"

RDEPENDS:${PN} += "gtk2-engine-hcengine"

inherit rpm
