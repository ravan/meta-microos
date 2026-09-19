SUMMARY = "Noto Hanunoo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hanunoo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-hanunoo-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "15b8b51f154205a90ae3b59ddf1938c233845dd52b8fc9eebf7352cf4710b6635262c4e112f21336de77a5c68da6c983f56fdcc5344f2cb426ed126443667478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hanunoo-fonts \
noto-sans-hanunoo \
noto-sans-hanunoo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
