SUMMARY = "Noto Myanmar Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-myanmar-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "3c5a0f3afff7b7dff997ecf6a728bc4ba5c32cfa57fca62aed7ce1b25fdd5360651f8c4d96b38f9f85af18445e227cc747d5f012c2f2876590e4b813b0776330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-myanmar-fonts \
noto-serif-myanmar \
noto-serif-myanmar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
