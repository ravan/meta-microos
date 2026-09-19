SUMMARY = "Noto Palmyrene Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Palmyrene Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-palmyrene-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "454a8da0bf5502113aaf40d6da4f01621383c1d2e4c8a4507c5082476e7ade6ff07e190b6355702cd0b5361e011ea44216575ef4a4371338889da8d397b77858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-palmyrene-fonts \
noto-sans-palmyrene \
noto-sans-palmyrene-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
