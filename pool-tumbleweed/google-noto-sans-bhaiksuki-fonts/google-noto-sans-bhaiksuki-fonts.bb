SUMMARY = "Noto Bhaiksuki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bhaiksuki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-bhaiksuki-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f6259727279d00012865a005f7ba3f94e4d69b038f216f1e6358dc6f1304a2e8246256953a192b1ae033cfb1943b322792d83ffe7e27701a07285148a0a88cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-bhaiksuki-fonts \
noto-sans-bhaiksuki \
noto-sans-bhaiksuki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
