SUMMARY = "Noto Newa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Newa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-newa-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ecce45b9e023897d6a6dba46be145f78b894b024eccbadd9d959c217092b2f2d9f89d15a07984b68a4845f863cb7eab99874484e50a17ab4c04090c8c1f87858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-newa-fonts \
noto-sans-newa \
noto-sans-newa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
