SUMMARY = "Noto Old Turkic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldTurkic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldturkic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "28bf955ef6c9a5c5ce30e26de0eaeb058754e86761b01f460e940bf6533403931a6769ec4769a5f13ab62f8c302821e9dce6f09213297357bf918b971962ac7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldturkic-fonts \
noto-sans-oldturkic \
noto-sans-oldturkic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
