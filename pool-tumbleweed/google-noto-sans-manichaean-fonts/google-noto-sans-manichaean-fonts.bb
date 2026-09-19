SUMMARY = "Noto Manichaean Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Manichaean Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-manichaean-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b1d812e4e22ea96dca39b2f8a532ddc01e43de3c1a7fa533d821436dae195e399ffac493463b1a3b619073158f8b506cb10a27001d2cbc283495e5c1d5aa1525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-manichaean-fonts \
noto-sans-manichaean \
noto-sans-manichaean-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
