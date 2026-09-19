SUMMARY = "Noto Grantha Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Grantha Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-grantha-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "c4f2404a8cf16dfee7c7d0fd36e5ea71d309fd9e8e1c44e812ae2ce7a591efc9bdaf6c6d423486dfec8c56c311f748a45108546fe65ffc6e3388dd5d36cb9447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-grantha-fonts \
noto-serif-grantha \
noto-serif-grantha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
