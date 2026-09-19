SUMMARY = "Noto Tirhuta Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tirhuta Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tirhuta-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a9feaf6b6a90b126aea1373d31278f83cc7122e9abcface72cc3162b84c67fa8d980ccbf15b05f8a9cefb2843eb84168385d81a8514f07cc93c5adb24f64162b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tirhuta-fonts \
noto-sans-tirhuta \
noto-sans-tirhuta-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
