SUMMARY = "Noto Anatolian Hieroglyphs Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
AnatolianHieroglyphs Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-anatolianhieroglyphs-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ae4046b1afe9f2c8cd21c7918b166320acea8b6445af7e4c4721f3e2fcc42664b6bc1e423f086368f061423c5bb3f62830f83bc5c46ef164352b2b82233dfc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-anatolianhieroglyphs-fonts \
noto-sans-anatolianhieroglyphs \
noto-sans-anatolianhieroglyphs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
