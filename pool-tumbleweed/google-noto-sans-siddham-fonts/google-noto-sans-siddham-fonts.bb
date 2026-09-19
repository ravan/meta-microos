SUMMARY = "Noto Siddham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Siddham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-siddham-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d1d57c46dfec17e966f1b09a003f61e5155833fd58debcb36ef35f468a8db98f37122c1c6837503a39c0513e993eb5da6e22bbe1fec75db96a8140ce8c5bb3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-siddham-fonts \
noto-sans-siddham \
noto-sans-siddham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
