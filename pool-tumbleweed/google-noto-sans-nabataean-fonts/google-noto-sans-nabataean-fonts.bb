SUMMARY = "Noto Nabataean Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nabataean Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-nabataean-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "c806b4e2fe2707425d637d7315e2fafa1daf840a10a6cf10b01fe0b38b9d17251add39eb2a4ba403d35df63d443ed191f8e9885065d2025eaccc80d508728a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-nabataean-fonts \
noto-sans-nabataean \
noto-sans-nabataean-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
