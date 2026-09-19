SUMMARY = "Noto Marchen Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Marchen Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-marchen-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "dfe080e185174da1ecee4c7627f5156dc04f5f8af3db5dc9eba5fc5bb9ec44654047a18bccb7d8b0262b830488e4d1c0bd3ab604092fa4346b524d28cc6fdeb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-marchen-fonts \
noto-sans-marchen \
noto-sans-marchen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
