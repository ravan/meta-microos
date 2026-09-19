SUMMARY = "Noto Osmanya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Osmanya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-osmanya-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "431ad858a5605b09694056c6430096570a930bc7cd6bdf61b68dca37c009df07cbf1f860fe1c2db7d228475d3ebb3206158bb5b67df26499c4bb7dd822520f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-osmanya-fonts \
noto-sans-osmanya \
noto-sans-osmanya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
