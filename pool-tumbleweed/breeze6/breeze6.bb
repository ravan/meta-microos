SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "c813820c9087633e74eb24cdb99de3d36a2d5dee0f2eb518819d93b56f493276c159322c2a2e59301f1bde6e8e9ffdbf1357455b89a6fb4c685358838a07ac7b"

RPROVIDES:${PN} += "breeze \
breeze6"

RDEPENDS:${PN} += "breeze6-cursors \
breeze6-style \
kf6-breeze-icons"

inherit rpm
