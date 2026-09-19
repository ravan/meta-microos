SUMMARY = "Noto Sinhala Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-sinhala-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "3608e2c52dba51b3de94ada908e468f20dfc4b3c137a328cd26dced0fcd65bf637fbe7537f67c01651bc24eaef779bd286331fff46b6803d57a47ae0d2beadfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sinhala-fonts \
noto-serif-sinhala \
noto-serif-sinhala-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
