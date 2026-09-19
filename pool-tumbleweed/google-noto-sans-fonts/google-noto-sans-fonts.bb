SUMMARY = "Noto Sans Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sans font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "be80671d4013b17e867619292504da5e129c87d5cc4367c57f6c162d3569381a0b352d97f283772e5b2fda0a214cdbb2059fb64a5438e263b4394ca696c56dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-fonts \
noto-sans \
noto-sans-display \
noto-sans-display-fonts \
noto-sans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
