SUMMARY = "GNOME Games"
DESCRIPTION = "GNOME Games"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_games-20250310-10.2.aarch64.rpm"
RPM_HASH = "37e5038ef54b2c4510cbe229c74ae117d1a0ee8958e3fb7a77b7b76e615cca8829d21a16bb5f741e6ea0c790862cd9c054d0a9bba642fce4e425b6b0b494ec2c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-games \
patterns-openSUSE-gnome-games"

RDEPENDS:${PN} += ""

inherit rpm
