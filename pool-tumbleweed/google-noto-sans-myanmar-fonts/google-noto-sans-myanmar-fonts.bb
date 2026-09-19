SUMMARY = "Noto Myanmar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-myanmar-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "14dc12b9b736ae3c4aecb53bbe8f62a2806ccb382edbe43fef7a7948d6b4ad942615638e63e80aab80490049bfe2465c4a0c469d6c8c1910a34f7539937e8d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-myanmar-fonts \
noto-sans-myanmar \
noto-sans-myanmar-fonts \
noto-sans-myanmar-ui \
noto-sans-myanmar-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
