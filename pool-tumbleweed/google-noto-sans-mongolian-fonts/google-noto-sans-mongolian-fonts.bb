SUMMARY = "Noto Mongolian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mongolian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mongolian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "aa593d1e6fd6bce3245654c05e633e37bf85b570bec8cd87df411fe3108afe6a9f76fb14947e59d613457e0f8eeeb0caa8d75fa5a024b9ff0a06f160abe0d4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mongolian-fonts \
noto-sans-mongolian \
noto-sans-mongolian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
