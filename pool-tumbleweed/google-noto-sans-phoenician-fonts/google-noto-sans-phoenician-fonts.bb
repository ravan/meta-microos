SUMMARY = "Noto Phoenician Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Phoenician Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-phoenician-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "3638dbd35160f8aed2ef52bb49eb3c3f2659a5d0ecb8b5430d7ed1963f85dd67f51b3821f2ef7ef13b726a9b4313e1b4f0e56664af989bd336239ca08ea37afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-phoenician-fonts \
noto-sans-phoenician \
noto-sans-phoenician-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
