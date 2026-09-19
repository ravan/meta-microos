SUMMARY = "Noto Canadian Aboriginal Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CanadianAboriginal Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-canadianaboriginal-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e73a2b22786e90a26dc906a98f5a94345a2afc37e3724e70d8d69d4ac835dcc2e716f740213fb8de1fa01e2f8586fe129c2be597665f78559399d22ef0c99176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-canadianaboriginal-fonts \
noto-sans-canadianaboriginal \
noto-sans-canadianaboriginal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
