SUMMARY = "GNOME Development"
DESCRIPTION = "GNOME development packages."
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-devel_gnome-20250310-10.2.aarch64.rpm"
RPM_HASH = "a710ffa4a663bfdafe4f013d593aaefeef7b752dc59df0651f293cc87a94759289e691e2799782fac32820dfbdff55af4ff2373319d4522859acde111f153889"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-gnome-devel-gnome \
patterns-openSUSE-devel-gnome"

RDEPENDS:${PN} += "pattern-"

inherit rpm
