SUMMARY = "GNOME Integrated Development Environment"
DESCRIPTION = "Development under GNOME"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_ide-20250310-10.2.aarch64.rpm"
RPM_HASH = "1d7d58c1ea4e1a74f363fcd387860a6fcc3ca1c2c55e5316223be4ab1c9269762e57f5afc7b0ebbdd26f5d01cfa6669d1bc4e7cdd0994e03d1967203e787476f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-ide \
patterns-openSUSE-gnome-ide"

RDEPENDS:${PN} += ""

inherit rpm
