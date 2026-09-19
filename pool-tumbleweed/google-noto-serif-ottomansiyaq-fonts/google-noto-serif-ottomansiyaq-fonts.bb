SUMMARY = "Noto Ottoman Siyaq Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OttomanSiyaq Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-ottomansiyaq-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "3f522bce46c0e3c3cb3345f3e78f0d84466f77801971cb1ea66de28b01df4af095c7e4395b80af5dbec216a2dfcf60d13b60213485e460616336f1a3aa657449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-ottomansiyaq-fonts \
noto-serif-ottomansiyaq \
noto-serif-ottomansiyaq-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
