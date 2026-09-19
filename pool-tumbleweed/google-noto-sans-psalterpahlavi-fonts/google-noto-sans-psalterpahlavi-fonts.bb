SUMMARY = "Noto Psalter Pahlavi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PsalterPahlavi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-psalterpahlavi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "01a6328afb12deb38d6577d708e1c45084939069c17814fe9299767a9b40ba77a9a8975dd3aa26151df5031cae277e91ee57253f7b12e44e327ea58fc9234066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-psalterpahlavi-fonts \
noto-sans-psalterpahlavi \
noto-sans-psalterpahlavi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
