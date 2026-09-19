SUMMARY = "Noto Bengali Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-bengali-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a09c640247e4357cb605ccb8385c2ea5c78f255317ded06629f31dd9365b1033788c0782a4edf81d23f7bb09fc1d906d614228aa79915aecc62e317cef2b1f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-bengali-fonts \
noto-sans-bengali \
noto-sans-bengali-fonts \
noto-sans-bengali-ui \
noto-sans-bengali-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
