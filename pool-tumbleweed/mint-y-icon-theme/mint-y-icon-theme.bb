SUMMARY = "Mint-Y icon theme"
DESCRIPTION = "The flat, colourful, and modern theme based on Paper and Moka."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "1.8.3"

RPM_NAME = "mint-y-icon-theme-1.8.3-1.4.noarch.rpm"
RPM_HASH = "ac7b7d41d0934fc306ac79565b3f1716771cb03f2b29d4da307d5748e3b266922c8d867d78137bbe5f924c9ef32ed1573316012f7e78ea72c79ba7441f73b34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mint-y-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
gnome-icon-theme \
hicolor-icon-theme"

inherit rpm
