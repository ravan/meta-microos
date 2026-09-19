SUMMARY = "Matcha Cinnamon themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the cinnamon themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "cinnamon-theme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "e0b1a933a4e8f5f6760bb71c9add13da7d5581a3b48a4a5ea26c87c52a3206242a5df2d67c01682d8e23f5fb200b5b193cd3bbb0e79f18eec4629845ad910f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-matcha"

RDEPENDS:${PN} += "cinnamon \
metatheme-matcha-common"

inherit rpm
