SUMMARY = "Copic Colors for The Gimp Palettes"
DESCRIPTION = "An original set of vector icons designed specifically for Pantheon. \
 \
This package contains a palette file for the GIMP."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "pantheon-icons-gimp-palette-8.2.0-1.3.noarch.rpm"
RPM_HASH = "2bc0eaa9abc6cfbec69621cc875ef866b55b1fc94ef21a24287b92fc8e1dc50579ef62cd3deba376d6d38fe4802cf5266619c12ddc656e194b0826f648e38528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pantheon-icons-gimp-palette"

RDEPENDS:${PN} += "pantheon-icons"

inherit rpm
