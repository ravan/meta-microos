SUMMARY = "Noto Khudawadi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khudawadi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-khudawadi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6bd7fdc6c6339cebb63db65800826f9820639eee4543c9cf5a36dc79575577e1d07fc1e138ba3dca42b6e340038e39fe5321584e646dd974734e0f38285e98e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-khudawadi-fonts \
noto-sans-khudawadi \
noto-sans-khudawadi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
