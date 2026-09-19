SUMMARY = "GNOME Office"
DESCRIPTION = "GNOME Office"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_office-20250310-10.2.aarch64.rpm"
RPM_HASH = "00f5394f57272d9abb9aa7d009326c8561768a317654af0f0cce669f76101d72dcf233097d6e9f4a3db465312eb99113273f2d7381a8a75ff5ceae5136e9c4d6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-office \
patterns-openSUSE-gnome-office"

RDEPENDS:${PN} += "pattern-"

inherit rpm
