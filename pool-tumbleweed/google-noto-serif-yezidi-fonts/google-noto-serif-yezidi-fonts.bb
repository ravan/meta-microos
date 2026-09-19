SUMMARY = "Noto Yezidi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Yezidi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-yezidi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7fa4f2f26b1bd18d276769c723595b4b194ecec84755c9ac1c0850bd1396aac9272b8102d96f494db4e395d2e5410d61b5e2c611f40bb041516afbb0a9a70e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-yezidi-fonts \
noto-serif-yezidi \
noto-serif-yezidi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
