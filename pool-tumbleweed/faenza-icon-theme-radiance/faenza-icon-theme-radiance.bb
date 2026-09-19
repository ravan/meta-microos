SUMMARY = "Faenza-Radiance Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items. \
 \
Faenza-Radiance is suitable with light panel and controls."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-radiance-1.3.1-1.12.noarch.rpm"
RPM_HASH = "349ba4cd38aace3ae330982c35e96eade5959fad75a85f1568fd0aba07053ac775dbfe8baae5b25b185cc02286a284db2138e43d4f05ee17ccf790aa4efdf835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-radiance"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme"

inherit rpm
