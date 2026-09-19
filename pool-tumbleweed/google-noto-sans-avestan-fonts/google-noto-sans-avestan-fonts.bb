SUMMARY = "Noto Avestan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Avestan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-avestan-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7533befdf3aadab681465383db47805808066cd236130d22915610c50b093399d8e6cedaa27b0117a78aee2d076bd7e10fd5380d8776b294d96eb427d0f15398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-avestan-fonts \
noto-sans-avestan \
noto-sans-avestan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
