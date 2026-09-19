SUMMARY = "Noto Brahmi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Brahmi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-brahmi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9a18291f9f08218a2fd36866420a6c896fed6dbd433ee5ae754cf5688fcf4c123225f5e5f5c7c35a6e1078a48551b3f6233ad5fae764d37bd01a4650c2b8dbf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-brahmi-fonts \
noto-sans-brahmi \
noto-sans-brahmi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
