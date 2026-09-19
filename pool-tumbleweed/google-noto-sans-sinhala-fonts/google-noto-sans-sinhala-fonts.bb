SUMMARY = "Noto Sinhala Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sinhala-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "bc27e21b881e3b74c1ed7a99e61de4be7eee700bf6a62a4dd0afbc282f90d15e82d12e54ab13c0de47cc74381337e6983e997ee835e9d82a898c20163a839f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sinhala-fonts \
noto-sans-sinhala \
noto-sans-sinhala-fonts \
noto-sans-sinhala-ui \
noto-sans-sinhala-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
