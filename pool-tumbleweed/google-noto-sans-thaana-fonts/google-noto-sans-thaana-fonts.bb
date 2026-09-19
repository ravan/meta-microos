SUMMARY = "Noto Thaana Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thaana Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-thaana-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d04278b2d10d6c23414d5ce27a00992bc3bf7920c24c000d6297fe6b3e872634bcfb1815e96ded4e42a0f56a143928d9c0af144eeb2503e75a4f9e3a99c12980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-thaana-fonts \
noto-sans-thaana \
noto-sans-thaana-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
