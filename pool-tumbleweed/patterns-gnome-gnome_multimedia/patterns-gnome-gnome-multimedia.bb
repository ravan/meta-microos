SUMMARY = "GNOME Multimedia"
DESCRIPTION = "GNOME Multimedia"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_multimedia-20250310-10.2.aarch64.rpm"
RPM_HASH = "dd9eeb717dc8eb7b8731c361f41545cf2d2f84dc2ec633e9aed7d4886516876058871b121afc1ad38c7c4c8e8348de7fa23c1d3dd6cf4ff3eaa039990a30c762"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-multimedia \
patterns-openSUSE-gnome-multimedia"

RDEPENDS:${PN} += ""

inherit rpm
