SUMMARY = "Noto Symbols Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Symbols Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-symbols-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "4f94be60a633856ad641a159210e14b087f4b2c470ef4efee6896c99973a3672c20fdd1075d1876e4a24d74e167f6fd02772494da6d13dfa4fec5fe28ff40e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-symbols-fonts \
noto-sans-symbols \
noto-sans-symbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
