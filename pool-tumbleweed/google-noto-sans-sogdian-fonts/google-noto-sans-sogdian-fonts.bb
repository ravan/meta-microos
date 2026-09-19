SUMMARY = "Noto Sogdian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sogdian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sogdian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e9962d36ff68d5c751bd48697de9d1fb7d6d8ca922328e909b362a198e661cf4d9c62f3f703e62533035a801e37fb2d48e764111ea72de1573953f8b657c9125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sogdian-fonts \
noto-sans-sogdian \
noto-sans-sogdian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
