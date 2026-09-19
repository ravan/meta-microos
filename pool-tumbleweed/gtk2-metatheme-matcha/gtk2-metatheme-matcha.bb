SUMMARY = "Matcha GTK+2 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK2+ themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "gtk2-metatheme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "61c18b735a2d06908c0e587de7349ee534cd891ee11d91accfd71e715265c54b0128fb8e9dd90ff895786c40217cda6fc3b338f3744692731b448bb06f354e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-matcha"

RDEPENDS:${PN} += "gtk2 \
gtk2-engine-murrine \
metatheme-matcha-common"

inherit rpm
