SUMMARY = "Noto Takri Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Takri Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-takri-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "bd0755918dbc0618bb2c9249837d626839a645a6b8432d71346c9ddcabb94fadcfcc4426d2a4e29d7fc96be658d270519d0968a20b5e16af2edff7998eca1855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-takri-fonts \
noto-sans-takri \
noto-sans-takri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
