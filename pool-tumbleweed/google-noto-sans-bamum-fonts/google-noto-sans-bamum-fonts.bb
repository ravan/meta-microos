SUMMARY = "Noto Bamum Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bamum Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-bamum-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "064ac3cee94d32029d6bafcc8a7eca4dc06a26a8bc053fc90ea6406bca7fab0bc9c01337759fd8843010eaf5a4b1558cbbaba71b167d7050d3391e26faec1963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-bamum-fonts \
noto-sans-bamum \
noto-sans-bamum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
