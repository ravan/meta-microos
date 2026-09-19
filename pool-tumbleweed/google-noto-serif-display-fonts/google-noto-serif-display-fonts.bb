SUMMARY = "Noto Display Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Display Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-display-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "5fa69f7c2933f87e3bcad7848cd2325a9dd44bce7c2ccf38728282164ba00743f53a30f206b1bd22cbfe8e43fcfbfdd39fbd99448f630ba049cd16d26b4524be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-display-fonts \
noto-serif-display \
noto-serif-display-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
