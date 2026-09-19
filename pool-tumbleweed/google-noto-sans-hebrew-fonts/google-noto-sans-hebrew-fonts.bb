SUMMARY = "Noto Hebrew Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hebrew Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-hebrew-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2c7022f16b103ee3de1e4e4feee6569069002009742b54d4118c9661768ca277cd5419c64be44f4ad41e22782c6188409ee259e00781b0bb10924c901ac74b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hebrew-fonts \
noto-sans-hebrew \
noto-sans-hebrew-fonts \
noto-sans-hebrewdroid \
noto-sans-hebrewdroid-fonts \
noto-sans-hebrewnew \
noto-sans-hebrewnew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
