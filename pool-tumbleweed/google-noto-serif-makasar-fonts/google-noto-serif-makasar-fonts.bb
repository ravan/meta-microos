SUMMARY = "Noto Makasar Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Makasar Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-makasar-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ee3fb5a20b8f48ea06efad87a59e91bdeaa0de66bd54a9e904ac5307f0404bbba45a70d138b7d34494d086db5a0ec0c33dfefadd218331f51809a602b73542c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-makasar-fonts \
noto-serif-makasar \
noto-serif-makasar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
