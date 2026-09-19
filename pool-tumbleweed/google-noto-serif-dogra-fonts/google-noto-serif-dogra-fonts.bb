SUMMARY = "Noto Dogra Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Dogra Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-dogra-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f0801bff12c7bbb43fa21b0469fe0384c4b2e493dcc064484284e565f9e1ce64817ab1261a1907283bc66c1576b42e4c8c10f74d0fefc7b9144531cff826cdaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-dogra-fonts \
noto-serif-dogra \
noto-serif-dogra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
