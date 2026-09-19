SUMMARY = "Noto Devanagari Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-devanagari-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "decf7ac15e22a8c9074a9eb382675248a76f8dc2e1969b0be51d4626054311619b64d92d2fe44e1a30d5f4de0bc6e10fb6451f34a48df659aa659b620837c510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-devanagari-fonts \
noto-serif-devanagari \
noto-serif-devanagari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
