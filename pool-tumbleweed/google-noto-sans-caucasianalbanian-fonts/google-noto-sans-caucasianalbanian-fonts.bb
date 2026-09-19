SUMMARY = "Noto Caucasian Albanian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CaucasianAlbanian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-caucasianalbanian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9b4fab8636f51fa216b5bc91fcfba2e322e2d2454d6ba9485839f2fc044fbe9494281c635bf3fa96bee1d09b3c37493a6604bab0885d5b3da672dbb1ff5eb8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-caucasianalbanian-fonts \
noto-sans-caucasianalbanian \
noto-sans-caucasianalbanian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
