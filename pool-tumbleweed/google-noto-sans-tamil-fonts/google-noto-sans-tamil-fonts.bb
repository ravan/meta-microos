SUMMARY = "Noto Tamil Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tamil-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8da792b955f14fcc6e7df6fdffa6653854bcc1853ae8909bf93e2a053bd4181301410ddb6b909ab3911fc6f6d6e43c5720eb65b594a921fbc1507f2ac4130f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tamil-fonts \
noto-sans-tamil \
noto-sans-tamil-fonts \
noto-sans-tamil-ui \
noto-sans-tamil-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
