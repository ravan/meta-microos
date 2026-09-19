SUMMARY = "GNOME Utilities"
DESCRIPTION = "GNOME Utilities"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_utilities-20250310-10.2.aarch64.rpm"
RPM_HASH = "af37d204d8d4e8d7d29ff66099bc0d1bb6c439a1adb29bf1d716db0fa817954b9f16029cfc16db7430f0e297aa2ec323089ea29f284ad34a3c7dcce11cffdbf0"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-utilities \
patterns-openSUSE-gnome-utilities"

RDEPENDS:${PN} += "pattern-"

inherit rpm
