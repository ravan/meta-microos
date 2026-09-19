SUMMARY = "Noto Gurmukhi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-gurmukhi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "49fc40de7ce92e53173fa60c21a6fd1f77623ec20d4135e817c86d91ded07951ec29883377c5aec7bc17b40273ad5e050864a3369601684f194f4567d89f9ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-gurmukhi-fonts \
noto-serif-gurmukhi \
noto-serif-gurmukhi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
