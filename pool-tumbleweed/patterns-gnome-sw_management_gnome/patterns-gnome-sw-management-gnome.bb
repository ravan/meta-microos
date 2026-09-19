SUMMARY = "Package Management - Graphical Tools for GNOME"
DESCRIPTION = "Package Management - Graphical Tools"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-sw_management_gnome-20250310-10.2.aarch64.rpm"
RPM_HASH = "f64539865931873081715efb9278d6be4caf3c4030b530c2adf7509f5f5fb128f10bd9c07cceca54350b7f00738829fabb355331b823f45ba1b03418f896fb40"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-sw-management-gnome \
patterns-openSUSE-sw-management-gnome"

RDEPENDS:${PN} += "pattern-"

inherit rpm
