SUMMARY = "Noto Miao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Miao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-miao-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "4456700d86d60a749361933de5f02dd9dc9e8474b898c4747708ac2ef007127175e54e85d9defa58ec9749f3ee82027774d421d03e1490f28a25f1b5ff401cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-miao-fonts \
noto-sans-miao \
noto-sans-miao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
