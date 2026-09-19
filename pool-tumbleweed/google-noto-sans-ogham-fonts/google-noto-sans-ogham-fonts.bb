SUMMARY = "Noto Ogham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ogham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-ogham-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "187d95ed1807956af09345b14317197e324409f3400fbc03986989808ff58e1ce38e5ea815e25e46272e1a42e1bcb12fabaef7f5f23072cd5aa643b2005b1372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-ogham-fonts \
noto-sans-ogham \
noto-sans-ogham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
