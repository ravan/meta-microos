SUMMARY = "Noto Masaram Gondi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MasaramGondi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-masaramgondi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "5bbfa7068d6107f3c3c1b0a22a695fb9788ffbf4feba1042dec4197f26effb205700d5e7a7ed477d42f9bb103f5c763a9ed9eadd2e6d0da8f67ce7432a756420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-masaramgondi-fonts \
noto-sans-masaramgondi \
noto-sans-masaramgondi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
