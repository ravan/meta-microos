SUMMARY = "YaST GNOME User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for the GNOME desktop."
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_yast-20250310-10.2.aarch64.rpm"
RPM_HASH = "76e0ee3f390f3a63a38d78c013eecbdd189c4c2622d558f00f0a3979bd5dd5d81bcec907a6459a14c1a5739eba36f5c03bb8a83b40d67813a89fb90771fbc626"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-yast \
patterns-openSUSE-gnome-yast"

RDEPENDS:${PN} += "libyui-qt-pkg \
yast2-control-center-qt"

inherit rpm
