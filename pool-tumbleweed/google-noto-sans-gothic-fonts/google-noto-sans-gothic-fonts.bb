SUMMARY = "Noto Gothic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gothic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-gothic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "5901693a1fda32c38535fe5e1e9af09938bdf07b8d87b808e923af77876f2f40ef9c296c9760509c1539c08ac7caf3eb6df8e74f82cc6cec10e01fda6b0ec945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-gothic-fonts \
noto-sans-gothic \
noto-sans-gothic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
