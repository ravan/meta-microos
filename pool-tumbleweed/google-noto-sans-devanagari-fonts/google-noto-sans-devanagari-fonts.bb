SUMMARY = "Noto Devanagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-devanagari-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "87e9dd68659424e19b0d3d90d8a10d8fed9d3cbe4ebdd897061e240007ef493d07cd6517c18eede8f2ea0ecd120868a0b0d189ed378079dc6e72d5d2ef9b9fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-devanagari-fonts \
noto-sans-devanagari \
noto-sans-devanagari-fonts \
noto-sans-devanagari-ui \
noto-sans-devanagari-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
