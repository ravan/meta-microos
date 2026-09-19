SUMMARY = "Noto Zanabazar Square Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ZanabazarSquare Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-zanabazarsquare-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "af88af81c9fb0e395bb90a4416e8fd9bb29f0e3a2a43932f404bf8faeed27e45c961c0ae35bd2a09f0a92c1e95f1aa3e18c1b3560d044ecf8f2f70f5e8c380ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-zanabazarsquare-fonts \
noto-sans-zanabazarsquare \
noto-sans-zanabazarsquare-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
