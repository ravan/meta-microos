SUMMARY = "Noto Osage Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Osage Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-osage-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e644ee735ef270f0126a0aaf36ec8d8f6d3ffcbbdf577c4a3b1009219bb89c6ff3582ba1ee6dd9429e526b981b0ce61d08583e33af212a1055dc0ba0fbf2808d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-osage-fonts \
noto-sans-osage \
noto-sans-osage-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
