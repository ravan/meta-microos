SUMMARY = "Noto Carian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Carian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-carian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "44fa0751a7ddde0a38cb6a86a3a57a96d26fc90e8fb39b20106526fb005815f851a51b721cafc6a387879b2bf4ee6f067a36ef155c08eb8d6e3a86bc29f9a884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-carian-fonts \
noto-sans-carian \
noto-sans-carian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
