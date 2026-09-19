SUMMARY = "Noto Inscriptional Pahlavi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
InscriptionalPahlavi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-inscriptionalpahlavi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "eaa06c327c3a550d47f2aca3f358899eedd0aef93c4483feeb8788a29985370d9a5bee42db652888bd25c47e9c299f5f520ebcf41ac9631cd6370ccbafd56162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-inscriptionalpahlavi-fonts \
noto-sans-inscriptionalpahlavi \
noto-sans-inscriptionalpahlavi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
