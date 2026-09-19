SUMMARY = "Noto NKo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NKo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-nko-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "26188166ab04404b38a777fe12f3098dbb6987899393de7ef69ed250c5bb8c986d58d5b299d348dd13b2bf2100984c93b2b7a513af018847b692edd78cb990d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-nko-fonts \
noto-sans-nko \
noto-sans-nko-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
