SUMMARY = "Noto Khojki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khojki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-khojki-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "95f2a3336b23f767062ef7e6258d70a083c196874e08d038914c5980a6847761979ad6724d6244713a4fada041f06ecfd7644ebc035ab3f6a19d230dd1e71fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-khojki-fonts \
noto-sans-khojki \
noto-sans-khojki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
