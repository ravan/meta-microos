SUMMARY = "Noto Toto Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Toto Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-toto-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "3578191de2921fbfd4bf6575e50e91fe16d4ad37af8873e22f0609664d6a52a878f877c61555e49d0bbf598714cc858be0c961dc5a88d6e5a4853c44fd55e65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-toto-fonts \
noto-serif-toto \
noto-serif-toto-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
