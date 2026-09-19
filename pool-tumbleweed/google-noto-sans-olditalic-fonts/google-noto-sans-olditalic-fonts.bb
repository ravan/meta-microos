SUMMARY = "Noto Old Italic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldItalic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-olditalic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "bf55a313fee282415ff5f8204d80315b103e4a3a18a5230a1202ea2b16e8c738a1cd9a87698f556daab57d7e2bc4819c134f088b68536a10205e2ccfa82271f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-olditalic-fonts \
noto-sans-olditalic \
noto-sans-olditalic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
