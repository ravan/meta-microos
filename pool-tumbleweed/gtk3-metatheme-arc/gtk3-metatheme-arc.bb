SUMMARY = "Arc GTK 3 Theme"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains the GTK 3 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "gtk3-metatheme-arc-20221218-1.8.noarch.rpm"
RPM_HASH = "3b81c770d8f1ad5a078f21c30c93bf1d029f60a80c4992c0553b35e476d434cb3b859082b0a6bfca44f5d6656ad4841ebb7621fa750fbcc0f96d00618ac07fde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-arc"

RDEPENDS:${PN} += "gtk3 \
metatheme-arc-common"

inherit rpm
