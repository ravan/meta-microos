SUMMARY = "Noto Kaithi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kaithi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-kaithi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "86cc418cc968ef375e34df3f267d4c45c9c2e287ae2a63c68c2e4ed398590c3a210d78e19a4e4ee07fe871051d2a0c65a0ddf4269e431f0682ed04b85bf86040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kaithi-fonts \
noto-sans-kaithi \
noto-sans-kaithi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
