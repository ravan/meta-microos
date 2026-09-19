SUMMARY = "Noto Nushu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nushu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-nushu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "4a07bbc089876f40019d2f50c244ca924dd068bf8b29017f7638c5a797ca996280f9955c21aa815107438d7c9bbeb5e2223883e5fa49d5f6109f55f7f3ddd6e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-nushu-fonts \
noto-sans-nushu \
noto-sans-nushu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
