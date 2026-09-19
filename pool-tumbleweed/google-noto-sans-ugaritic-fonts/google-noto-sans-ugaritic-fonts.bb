SUMMARY = "Noto Ugaritic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ugaritic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-ugaritic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9197b325b7a0a3b790d7d4eac3a926b2602de35832efd67e2d09573f9e40160220fa8446becb72100c3d8a459c70982d6a95da9d21436540896d81ae1d73d4af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-ugaritic-fonts \
noto-sans-ugaritic \
noto-sans-ugaritic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
