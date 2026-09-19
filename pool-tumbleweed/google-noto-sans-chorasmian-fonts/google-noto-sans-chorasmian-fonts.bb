SUMMARY = "Noto Chorasmian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Chorasmian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-chorasmian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "862caf45568f46a04831d68728b71a8c22b50d3981a66eb4273e362bee4db0c4053bcd4bb4feab88ac267709f8da573cbc0875b4053622cc313e2959caea878d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-chorasmian-fonts \
noto-sans-chorasmian \
noto-sans-chorasmian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
