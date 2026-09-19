SUMMARY = "Matcha GTK+4 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK+4 themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "gtk4-metatheme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "2a37fc38c8c435b397536158d854ec3186b8f8f310d65f61aaafd621e56c84dd04940a28eb47c045cce6b6c1784753d64da508726e223809a3ee454ed09b7cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-matcha"

RDEPENDS:${PN} += "gtk4 \
metatheme-matcha-common"

inherit rpm
