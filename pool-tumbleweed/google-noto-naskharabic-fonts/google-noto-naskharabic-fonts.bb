SUMMARY = "Noto Naskh Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NaskhArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-naskharabic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f3809371bc306997dedbfb9e5f1efbdc014c6f77dfdd8ae43fc2c3a8772aa46eaecd630a51128154fd316c4ca8da3467849f79135f41794e3df44c903c31c3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-naskharabic-fonts \
noto-naskharabic \
noto-naskharabic-fonts \
noto-naskharabic-ui \
noto-naskharabic-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
