SUMMARY = "Noto Samaritan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Samaritan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-samaritan-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b03089e5f3458f8a8f631a26771f6515b3e09a24d3ff313e78cb1be1b0ce9231cf3334777e87987ec21a72957a1a7a164d09501d940949579506852ea7768492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-samaritan-fonts \
noto-sans-samaritan \
noto-sans-samaritan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
