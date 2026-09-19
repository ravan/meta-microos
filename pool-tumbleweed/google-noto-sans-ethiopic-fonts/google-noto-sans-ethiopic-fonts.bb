SUMMARY = "Noto Ethiopic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ethiopic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-ethiopic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "5093012dece619096b3ec853be25caa3e3e2478e26356e6f4f97b7e1a5b9f899ff76855d7b25057e95adf1b7cf8e36b3f3c4e3b6a5c2e342e2817ef7aac2030e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-ethiopic-fonts \
noto-sans-ethiopic \
noto-sans-ethiopic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
