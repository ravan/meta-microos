SUMMARY = "Noto Khitan Small Script Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KhitanSmallScript Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-khitansmallscript-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8cbadd45788718a56fd15a9e8a2946ec1200958fff94ade85badda03e2757876aecd7fb8c60d57a3c3a8d4d1e1d12b80839ab51894c258508e55f7d80bddf5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-khitansmallscript-fonts \
noto-serif-khitansmallscript \
noto-serif-khitansmallscript-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
