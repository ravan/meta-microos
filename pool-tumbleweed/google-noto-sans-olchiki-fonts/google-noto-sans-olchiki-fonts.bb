SUMMARY = "Noto Ol Chiki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OlChiki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-olchiki-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6f56e0121adaa71f8c7805771ba6c2a6e1bf3d1d046b2a4daf2511cbd760bd6415369690c7acad22b8d435547071ab22d502e6124d5ef8e19cd1b00e29b8bb1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-olchiki-fonts \
noto-sans-olchiki \
noto-sans-olchiki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
