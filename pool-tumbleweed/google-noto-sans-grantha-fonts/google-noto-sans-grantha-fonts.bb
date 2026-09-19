SUMMARY = "Noto Grantha Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Grantha Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-grantha-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "50f26198e1d416279601d1b474025a7eb8ebf6ce0d479553feb0bcdbb47f3bc201ee5bbc4b5d223793c5b787578561f94a1c195675fb38664a703a33e79201f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-grantha-fonts \
noto-sans-grantha \
noto-sans-grantha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
