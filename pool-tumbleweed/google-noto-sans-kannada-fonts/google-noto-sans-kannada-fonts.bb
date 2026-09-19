SUMMARY = "Noto Kannada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-kannada-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ba2754e5ddefc64f8491c94bb5b4a11d89a834670f2dc239c78ea6ec09655d9fac96dda2c124a8137603dcb8030012b6451c614b34b311ff0dfe0865a5b61ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kannada-fonts \
noto-sans-kannada \
noto-sans-kannada-fonts \
noto-sans-kannada-ui \
noto-sans-kannada-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
