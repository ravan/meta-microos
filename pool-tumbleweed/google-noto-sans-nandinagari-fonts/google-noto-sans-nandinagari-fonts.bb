SUMMARY = "Noto Nandinagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nandinagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-nandinagari-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "807d6435848947e05ea84e3f0bb1c1346da8c2b9ac0b8db02b730836094ee8118824043ab209dd01d7f17fda24e79e1163ef70a7f4e51558ad4388432ab84591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-nandinagari-fonts \
noto-sans-nandinagari \
noto-sans-nandinagari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
