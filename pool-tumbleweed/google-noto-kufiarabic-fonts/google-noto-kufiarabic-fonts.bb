SUMMARY = "Noto Kufi Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KufiArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-kufiarabic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8ef2ef7e3c03547ec1b73807eef2202fe00ff1c25cf7ab947b0c58eb95ce08cc33d79c8c7650c9bbe7d3479888ff044dfa15f21c189031e8ab5c2a40e127bc26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-kufiarabic-fonts \
noto-kufiarabic \
noto-kufiarabic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
