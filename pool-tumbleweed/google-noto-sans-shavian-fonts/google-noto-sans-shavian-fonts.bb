SUMMARY = "Noto Shavian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Shavian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-shavian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "331d3853614ab1adc6bdb274e86b0e4f499c237dd861cba636f7621bee637ce4a1fffbc6beeeef0e7c8e0601dea074e717c798377f71080c01c1f5199f18e5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-shavian-fonts \
noto-sans-shavian \
noto-sans-shavian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
