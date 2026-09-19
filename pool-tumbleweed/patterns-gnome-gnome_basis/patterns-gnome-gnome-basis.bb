SUMMARY = "GNOME Base System"
DESCRIPTION = "Base packages for the GNOME desktop environment."
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_basis-20250310-10.2.aarch64.rpm"
RPM_HASH = "e5730449010d28897c37af9576cef2ac3b204f1ab6e26d1970bb1b6284b680fb4d009a80c0fd5f862df3b04d53a2de52af17776dbc3c6c2e093c2cc3c5867345"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
patterns-gnome-gnome-basis \
patterns-openSUSE-gnome-basis"

RDEPENDS:${PN} += "adobe-sourcecodepro-fonts \
adwaita-fonts \
at-spi2-core \
gdm \
gnome-session"

inherit rpm
