SUMMARY = "Noto Buginese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Buginese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-buginese-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b48ac1c0517a4dd89034b6071f531c236137f3e11390862435b4977af7b939d7318c80537f1c37669140bb55fc9162462d1e49d66d3485492edee771f1a2756d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-buginese-fonts \
noto-sans-buginese \
noto-sans-buginese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
