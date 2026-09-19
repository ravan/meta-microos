SUMMARY = "Noto Tangut Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tangut Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-tangut-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "430eda3a58bedbd80f16be5dd53b18252307925fa677cd2d167bc91d6b3d53d03f1795badfec9c9e37f880aa503bffedfe876c9bd80b5b09356229f680f7683c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tangut-fonts \
noto-serif-tangut \
noto-serif-tangut-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
