SUMMARY = "Noto Lisu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lisu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-lisu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7eb3a392636f2617ae772f1bfd9a5db5381109867e1ab3eb44c4c107e702cd08b938b6db372a1cf366b70d855dcac9c75b8fc6e7d6995bc864fdcdf95260ce0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-lisu-fonts \
noto-sans-lisu \
noto-sans-lisu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
