SUMMARY = "Noto Buhid Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Buhid Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-buhid-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8338c83f4409e8fa39a671953f21c94756b55a1ac84496652532f66696a3faaf0d3a8f2853fe04a1d3b9a1090a1122c94075019af962638851b004cc8f26a79e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-buhid-fonts \
noto-sans-buhid \
noto-sans-buhid-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
