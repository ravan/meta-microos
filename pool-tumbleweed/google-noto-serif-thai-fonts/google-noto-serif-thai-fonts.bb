SUMMARY = "Noto Thai Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-thai-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ea24c8ebef74d78b9644ac8f373426bbd11d5c50b7f4b935bc762d535c96b1b4181fd7a350ed815cf5f76dbb87858dc48873f20dca9101681e68a01411df9f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-thai-fonts \
noto-serif-thai \
noto-serif-thai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
