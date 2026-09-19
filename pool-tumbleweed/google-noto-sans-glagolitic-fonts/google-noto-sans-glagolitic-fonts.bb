SUMMARY = "Noto Glagolitic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Glagolitic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-glagolitic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e574888b1e27db92a00757f3377b95491869bf66e63a94749f62c4fd89d5ad719bb02e38a1ea107f801cc147919d2d89e07d72ef21a288bdd0f45bd1bb06bb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-glagolitic-fonts \
noto-sans-glagolitic \
noto-sans-glagolitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
