SUMMARY = "Noto Gujarati Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-gujarati-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a6bac315f4175578232447bb7de5b5adc518a5c51cf3d0c9275d2ead916ddde80a0b307241d90eb68f9d4f35c53f8fc7f0ad8fae111fbdd488d31249ee6d1442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-gujarati-fonts \
noto-serif-gujarati \
noto-serif-gujarati-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
