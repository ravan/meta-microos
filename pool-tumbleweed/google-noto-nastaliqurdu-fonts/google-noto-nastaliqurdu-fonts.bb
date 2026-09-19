SUMMARY = "Noto Nastaliq Urdu Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NastaliqUrdu font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-nastaliqurdu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "10317e4da126a9b5ce6c2084b199062a21d1ac3b85960f0d452826426df4a8e906b86a47cd4ad2657a776b1b0353aea068d385e26f8e0b8c139d123e01ed7226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-nastaliqurdu-fonts \
noto-nastaliqurdu \
noto-nastaliqurdu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
