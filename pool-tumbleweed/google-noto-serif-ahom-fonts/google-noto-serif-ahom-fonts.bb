SUMMARY = "Noto Ahom Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ahom Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-ahom-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2376c9f463d9e3f8b6f8519ab1cf2d7df02bc349f982dca6b9c4c32f58ebb356ee4ee6b8605bd28f652a42f3709357400fa49a6f44df1640bb4243cc1e7ed52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-ahom-fonts \
noto-serif-ahom \
noto-serif-ahom-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
