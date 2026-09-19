SUMMARY = "Noto Saurashtra Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Saurashtra Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-saurashtra-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "122bac8b034a2d95d0617cb329b208d698028b9bb21cf88aaf9e645f21775da2df778428e865dc323ef4805e83adaa40e55f2e2e57cd64161bc616ca0f2e9aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-saurashtra-fonts \
noto-sans-saurashtra \
noto-sans-saurashtra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
