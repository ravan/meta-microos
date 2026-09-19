SUMMARY = "Noto Balinese Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Balinese Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-balinese-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "1f7dbef477eca68338d08cc0c368ac883ca8744e4482d8610dd2c7c16c256cf023e45ebe1b6af4e414b19b45ca42d07892654611ddcdc3f1570b4717aa37e958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-balinese-fonts \
noto-serif-balinese \
noto-serif-balinese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
