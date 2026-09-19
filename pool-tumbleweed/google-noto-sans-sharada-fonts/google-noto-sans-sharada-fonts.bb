SUMMARY = "Noto Sharada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sharada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sharada-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7156fa7963fdd34fa680a066a96eeb3676e359545c5beefa5f7515270119e9c98089f52dc1e132a2bcd902d43933fb2dd1e8f4a45a258be435537266498dd2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sharada-fonts \
noto-sans-sharada \
noto-sans-sharada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
