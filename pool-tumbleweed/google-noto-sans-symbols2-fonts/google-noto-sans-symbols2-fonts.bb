SUMMARY = "Noto Symbols2 Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Symbols2 Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-symbols2-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9bc9a99f6224b40b78d0382ebc38169358a9a6702203205067db9f6426d907f65a9caa17d9ad3d01c71bfe39c39325ab90a5d9288f9270a116efd577c533f79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-symbols2-fonts \
noto-sans-symbols2 \
noto-sans-symbols2-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
