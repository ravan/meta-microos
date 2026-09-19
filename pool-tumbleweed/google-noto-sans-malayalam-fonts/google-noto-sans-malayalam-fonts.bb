SUMMARY = "Noto Malayalam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-malayalam-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "c417443e967c962e572fd01e11e101feb56207a6f2ee722711d6f6c97f9cec3264892cb299506d15e9bc56f90376a1db523a40efd2f202458d0dd938b022b5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-malayalam-fonts \
noto-sans-malayalam \
noto-sans-malayalam-fonts \
noto-sans-malayalam-ui \
noto-sans-malayalam-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
