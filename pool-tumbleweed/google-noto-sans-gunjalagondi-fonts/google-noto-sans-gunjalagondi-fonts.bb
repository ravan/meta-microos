SUMMARY = "Noto Gunjala Gondi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
GunjalaGondi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-gunjalagondi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "cd4fbdbc2731ac1da43e2b0c8caee84947f7b9cb230a7df3d0df5b3d38ad77c8a403215a7f66b0aafebb34b5a0ee8564a30c83ff48cfe1815fe224999a628606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-gunjalagondi-fonts \
noto-sans-gunjalagondi \
noto-sans-gunjalagondi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
