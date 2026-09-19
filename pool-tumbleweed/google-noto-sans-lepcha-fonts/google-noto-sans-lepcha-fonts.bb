SUMMARY = "Noto Lepcha Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lepcha Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-lepcha-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "460e0dd8f5db60339157d5b795f527678f66f1313826e6d0c8817c0d5ac1d13f377a2f4ea50044fcc62e16d9b86d715437d719e7618602729c3a56d3bba8b9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-lepcha-fonts \
noto-sans-lepcha \
noto-sans-lepcha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
