SUMMARY = "Noto Wancho Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Wancho Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-wancho-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d967b8202a6be3d58a1f70181be8c93826f59a6428c1f9e259bea3b738a635c390819d6d2eb8b689954a478227ee27d7d2b2b7ff04d1347ff5a04e1bf0c8d7f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-wancho-fonts \
noto-sans-wancho \
noto-sans-wancho-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
