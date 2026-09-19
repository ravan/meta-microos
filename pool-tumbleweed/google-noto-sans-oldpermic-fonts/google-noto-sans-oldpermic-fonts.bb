SUMMARY = "Noto Old Permic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldPermic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldpermic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "1968ee6271d6fe898b2ccc156d74a4a39b67760b11d97113bc1d789d72667f286fbb8ddc7dd66078bf92af8c6c265dd2c6edc47f8f7885cb5c0d9115844d995e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldpermic-fonts \
noto-sans-oldpermic \
noto-sans-oldpermic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
