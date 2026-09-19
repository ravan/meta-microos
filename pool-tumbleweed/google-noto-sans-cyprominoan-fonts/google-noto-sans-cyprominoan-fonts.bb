SUMMARY = "Noto Cypro Minoan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CyproMinoan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-cyprominoan-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "caeb41cca4bf317b358854206104673f6bd300cac608794b21bbc41f4e9bf66281b1521f8e783bbeb97d1585b15e73fa44876b9f406b8798ec89e4cdd2691aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cyprominoan-fonts \
noto-sans-cyprominoan \
noto-sans-cyprominoan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
