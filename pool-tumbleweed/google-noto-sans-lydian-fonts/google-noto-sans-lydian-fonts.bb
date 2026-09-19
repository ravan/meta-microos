SUMMARY = "Noto Lydian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lydian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-lydian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e6bed0d52e244f93c76d05db52418cadce014d1d76dc07bd6e0d213c147672892731a07438a174ffaa6ed2e89698f98c5111cbc19eccef586267512dc78cd6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-lydian-fonts \
noto-sans-lydian \
noto-sans-lydian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
