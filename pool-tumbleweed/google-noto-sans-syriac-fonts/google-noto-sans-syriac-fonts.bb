SUMMARY = "Noto Syriac Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Syriac Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-syriac-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "91222bf2aba35e78d93684d9636bb74aaf7afdbd294d0a78c90ec819f399a5aaad339154ca1e46094cba3b7b1c39d7fa462f6f7219d2a58b59d0c659c5357a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-syriac-fonts \
noto-sans-syriac \
noto-sans-syriac-fonts \
noto-sans-syriacestrangela \
noto-sans-syriacestrangela-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
