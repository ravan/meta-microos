SUMMARY = "Noto Lycian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lycian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-lycian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e8bbc11bf3473beb773511a7212aa4da78b65344d3393ef7dd53c5fc7f13aa03ba94f6998af058a350461e95a24157ef26a74e49d8b6f2511a6543ba89b8e880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-lycian-fonts \
noto-sans-lycian \
noto-sans-lycian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
