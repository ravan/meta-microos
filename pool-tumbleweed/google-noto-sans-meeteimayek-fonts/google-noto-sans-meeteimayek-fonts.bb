SUMMARY = "Noto Meetei Mayek Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MeeteiMayek Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-meeteimayek-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9fcb6e5c700a6e750b8e6e117ef43eedf7b25e408d9dd52c62b3fae61e1c92aafd8aec13a3d7c86afcc289e7d7554b9e302ecebea35d3e9d239fa59fabf7cb3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-meeteimayek-fonts \
noto-sans-meeteimayek \
noto-sans-meeteimayek-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
