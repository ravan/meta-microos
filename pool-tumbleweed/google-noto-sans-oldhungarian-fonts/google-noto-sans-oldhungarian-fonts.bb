SUMMARY = "Noto Old Hungarian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldHungarian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldhungarian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6ec5c9d5efcf446b19e9a81286334ece06e39bd2a148093fc9767f95deb99e3bc655f33d2c9f49912da69b81708a0111da12ad003d3c2a1e364f86ebcc8f6f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldhungarian-fonts \
noto-sans-oldhungarian \
noto-sans-oldhungarian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
