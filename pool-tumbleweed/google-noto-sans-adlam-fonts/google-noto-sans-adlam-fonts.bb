SUMMARY = "Noto Adlam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Adlam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-adlam-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "235bd2035946b9680c5014c00b5cd21035dc0a25fceaabe99bd652901cbe6ab6f10f0df069cda96a5f76d73f286afd187c04588dfcd8d3ad0bc030b115a9bfb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-adlam-fonts \
noto-sans-adlam \
noto-sans-adlam-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
