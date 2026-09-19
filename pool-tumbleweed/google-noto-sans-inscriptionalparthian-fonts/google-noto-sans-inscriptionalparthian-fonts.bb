SUMMARY = "Noto Inscriptional Parthian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
InscriptionalParthian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-inscriptionalparthian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "02ff1205786391e45f2213e1bbcee9aa9a8d73bae6f83ef10f18c432b9c5743ae942ead7cbc5167c4d8833e76de18603748ff253e0c46b9ed30d69bd480864ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-inscriptionalparthian-fonts \
noto-sans-inscriptionalparthian \
noto-sans-inscriptionalparthian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
