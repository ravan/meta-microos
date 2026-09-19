SUMMARY = "Noto Cham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-cham-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a57dbe38c15407ce5633702773441553da02d52a215495e2bebc3bb3a155f99a162e951b69b8cca9371bb00446b6be99461bd902d18e7844d9fcfa2aad1f0b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cham-fonts \
noto-sans-cham \
noto-sans-cham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
