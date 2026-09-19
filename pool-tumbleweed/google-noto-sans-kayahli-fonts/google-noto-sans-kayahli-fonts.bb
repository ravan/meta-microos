SUMMARY = "Noto Kayah Li Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KayahLi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-kayahli-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "cd786f076cf3674a0de45f892eaf9f0aabda243d4b3e001f9ab235114f83c27b735a389ae33708824bcf4a2e34e2758017a18958a8c8c6a0e9547d15805ef553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kayahli-fonts \
noto-sans-kayahli \
noto-sans-kayahli-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
