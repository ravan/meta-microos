SUMMARY = "Noto Malayalam Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-malayalam-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7561d1a99237980403f40930121d5e9909fa4050c8c2611ecbe7b0d6e2e606eb65ad4f29007c0f33d3f1f1354c488aa65da18d88108add8c002755e9c084b980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-malayalam-fonts \
noto-serif-malayalam \
noto-serif-malayalam-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
