SUMMARY = "Noto Tangsa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tangsa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tangsa-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f257ff77f8e0be227e8d87ca44fc3710c89966218b21339c19a538f7d0d151d1a996b76de2d125d0407d48e7d7472accafc81c5ca61e5780fe271ba457265b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tangsa-fonts \
noto-sans-tangsa \
noto-sans-tangsa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
