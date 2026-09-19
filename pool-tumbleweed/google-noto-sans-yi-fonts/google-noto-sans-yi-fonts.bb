SUMMARY = "Noto Yi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Yi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-yi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "445c9d2b88b232ef7cfe8446a3b0d496faad653a8f5f7996090aaed0ed8a9ef2245fe573bde64db91535018b624765b1af40feb25c96a6a7e7edceb0dd3d9c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-yi-fonts \
noto-sans-yi \
noto-sans-yi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
