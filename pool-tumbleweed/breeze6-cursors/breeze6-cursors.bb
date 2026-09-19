SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze cursor theme."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-cursors-6.7.5-1.1.noarch.rpm"
RPM_HASH = "f260bbd5ec87f24382bf6944a2c912b14662fc42bfeac72847f01ccf50de980c481612f2a7c889b57a6801005e397d1766d7e2ec33f0044388f12efdfba29255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-cursors \
breeze6-cursors"

RDEPENDS:${PN} += ""

inherit rpm
