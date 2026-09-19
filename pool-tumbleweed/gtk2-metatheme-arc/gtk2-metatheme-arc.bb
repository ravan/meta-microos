SUMMARY = "Arc GTK 2 Theme"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains the GTK 2 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "gtk2-metatheme-arc-20221218-1.8.noarch.rpm"
RPM_HASH = "07565ffe47d1b581ad582e2f0d51311f04c4e178b7dc6e2a7c12c5bd526bbd9a6f89b6100dc5839538e9103e126d9c46f3b7adc4306be44984e9d80b5bcf6b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-arc"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-arc-common"

inherit rpm
