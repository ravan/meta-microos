SUMMARY = "Noto Arabic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arabic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-arabic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "48c42d61a4ecf7f78222c6f9b5ed11e9a2078a92c1015e144cf3b05f78317aced490cfd07444dce616a517cead88686b32257944675274d350c8d791cf740c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-arabic-fonts \
noto-sans-arabic \
noto-sans-arabic-fonts \
noto-sans-arabic-ui \
noto-sans-arabic-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
