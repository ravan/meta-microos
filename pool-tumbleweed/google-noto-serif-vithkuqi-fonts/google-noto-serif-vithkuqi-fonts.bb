SUMMARY = "Noto Vithkuqi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vithkuqi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-vithkuqi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d16cb361239dd3044b9b5635aa304eb059541b95c7c4c197ace31de5c19243625255d784007b318d3d4c31382472327723f6e76b9c2f9f3f836b26609658752c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-vithkuqi-fonts \
noto-serif-vithkuqi \
noto-serif-vithkuqi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
