SUMMARY = "Noto Elbasan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Elbasan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-elbasan-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6cb1613002daab3f9169f56578edd9b9d97a7a7c6e76e0491f0fa770b67ee3b6f0be8cff54661ba57179cc690f8bc1bdd6293410856cef4c7d8102a2b9828b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-elbasan-fonts \
noto-sans-elbasan \
noto-sans-elbasan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
