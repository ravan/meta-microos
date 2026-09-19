SUMMARY = "Noto Mahajani Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mahajani Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mahajani-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a314f1241ce10cc3b19030212af9a8db08450af6a3c283e2a0376198dfa5bb070c9167b3f1a0a684c51bcbc47752d66cde90afe8886300e63b865bbde9443077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mahajani-fonts \
noto-sans-mahajani \
noto-sans-mahajani-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
