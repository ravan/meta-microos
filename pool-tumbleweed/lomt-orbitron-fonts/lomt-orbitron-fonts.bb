SUMMARY = "League Of Movable Type's 'Orbitron' font family"
DESCRIPTION = "Orbitron is a geometric sans-serif typeface intended for display \
purposes. It features four weights (light, medium, bold, and black), \
a stylistic alternative, small caps, and a ton of alternate glyphs."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-orbitron-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "574b4e807336e6bbec37998bb1e8637179c398e36bee5a3f92b5e8fd64e8f81ed67cec612917de9eb63ca77b91c7b2bc477b946f6302f3e9f5914d32aa75df36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-orbitron-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
