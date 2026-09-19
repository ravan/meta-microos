SUMMARY = "Noto Lao Looped Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LaoLooped Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-laolooped-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9e23e82ef37da88d1dd5af2d7ead362f5b8e231bb2356def405ca0609194475c1961b4ea6157dd42173e8993ca5d20459029f0fc9530e853d77742239edf432b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-laolooped-fonts \
noto-loopedlao \
noto-loopedlao-fonts \
noto-loopedlao-ui \
noto-loopedlao-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
