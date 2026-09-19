SUMMARY = "Noto Limbu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Limbu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-limbu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "0d563f36c87838367accbc2a26f507ac79806f8d14d53d10182aebde3b4da22e39bac63c06997c20ae9dec6945502e79add5847ab4c376c1296a789dc6443bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-limbu-fonts \
noto-sans-limbu \
noto-sans-limbu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
