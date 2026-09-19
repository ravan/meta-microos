SUMMARY = "Noto Hanifi Rohingya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HanifiRohingya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-hanifirohingya-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "64df4f98beb02977b961b978a0dcf7453a9563bc0a674d7be8fa19f9eb831b888b2e3589ed3e8a6818cdd455fc782cabb4edd3a46c73bc2609186643660b1be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hanifirohingya-fonts \
noto-sans-hanifirohingya \
noto-sans-hanifirohingya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
