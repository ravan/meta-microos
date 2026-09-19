SUMMARY = "Noto Egyptian Hieroglyphs Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
EgyptianHieroglyphs Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-egyptianhieroglyphs-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "1b1622e7ae8a658ca5b8df434a18dacca7cbfc3e3b7114df77168a996c83ba1c274ca8c263d0cb5cde1e7d037b9b6a11d5aaa3b896b0680f7f7e6550f56142e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-egyptianhieroglyphs-fonts \
noto-sans-egyptianhieroglyphs \
noto-sans-egyptianhieroglyphs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
