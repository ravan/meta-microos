SUMMARY = "Noto Dives Akuru Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
DivesAkuru Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-divesakuru-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "955a3de0e00622e1db95699ddd995fe16d859a180adf87ee95773a2e1ba64a55a6447453506079907ff7f82a25b97533e2afc6ed4a92545e3213e5868f12f42c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-divesakuru-fonts \
noto-serif-divesakuru \
noto-serif-divesakuru-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
