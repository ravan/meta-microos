SUMMARY = "Noto Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "04b1878c1ebd385bdbb2d8529c9fef5e27740c382ec30e4e3da619bcc379bf812abfcac9ee0208c7bfcdeb5ae825336026456b7976e2cdbe9e56a75fdf01ddda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-fonts \
noto-serif \
noto-serif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
