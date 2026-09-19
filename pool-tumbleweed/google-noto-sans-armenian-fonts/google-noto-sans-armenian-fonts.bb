SUMMARY = "Noto Armenian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Armenian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-armenian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d4e09e2ffc6e177912d7d73a2b03ccd2fd6ea959416d3fb9e1166ee33b68237a6e023b9d2b7428ef264c8edbaa6e6cf011cfe24fa2fdc6c44acd9c1357f6a610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-armenian-fonts \
noto-sans-armenian \
noto-sans-armenian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
