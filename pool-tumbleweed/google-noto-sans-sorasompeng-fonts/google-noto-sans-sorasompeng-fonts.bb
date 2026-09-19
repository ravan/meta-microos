SUMMARY = "Noto Sora Sompeng Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SoraSompeng Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sorasompeng-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "42ddcd6534a43ae6aed68f78e7a4f0cbd91a82beadd583ea746cea4d84b0afe2c4aaffde2ac8586c4c639cc16d41aa7b3a3aab4d25a4ef42856c62ef3c3745ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sorasompeng-fonts \
noto-sans-sorasompeng \
noto-sans-sorasompeng-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
