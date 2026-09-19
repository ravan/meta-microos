SUMMARY = "Noto Imperial Aramaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ImperialAramaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-imperialaramaic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "4a01887650f7c0bb427d3d90c332c14879012984d8fa873626e1aa3de5c00a49360aa3c4b7887125d1c93e5f8a67047e87f7b5f4d8a233a2ff1fbd7cc977c536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-imperialaramaic-fonts \
noto-sans-imperialaramaic \
noto-sans-imperialaramaic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
