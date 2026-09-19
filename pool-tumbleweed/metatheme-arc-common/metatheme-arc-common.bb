SUMMARY = "Arc Common Theme Files"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains common files and themes for GNOME Shell, \
Marco, Xfwm4, and Cinnamon."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "metatheme-arc-common-20221218-1.8.noarch.rpm"
RPM_HASH = "80f3d3121ee3d4eb025b533105286560beb8f98b6820c9e95c1c93b854c0b1395c902ae408ed3d99cad5c85572ef791b1b1eacac849abeafb3c6e9c69ccf7fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-arc-common"

RDEPENDS:${PN} += ""

inherit rpm
