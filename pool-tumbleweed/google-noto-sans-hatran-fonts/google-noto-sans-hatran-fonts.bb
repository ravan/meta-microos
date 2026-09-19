SUMMARY = "Noto Hatran Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hatran Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-hatran-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "680880faaeb7063437029cbe1dc059c5fdc1d1b2be6f659317ed32eeaa48ee3ffb23305454482b8efe33314426e6bde2359ffb9269a8ec47ddb059e52fce1c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hatran-fonts \
noto-sans-hatran \
noto-sans-hatran-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
