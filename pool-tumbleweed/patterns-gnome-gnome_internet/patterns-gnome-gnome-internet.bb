SUMMARY = "GNOME Internet"
DESCRIPTION = "GNOME Internet Applications"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_internet-20250310-10.2.aarch64.rpm"
RPM_HASH = "1b9229a3f803e1b612b8871c5c3036e790abefcf65d7368f7440ea3b2510ca7c46c8cd01c6d48256ee0db873eb5c7b75342d300c991dd2a84e66565a590eecbe"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-internet \
patterns-openSUSE-gnome-internet"

RDEPENDS:${PN} += ""

inherit rpm
