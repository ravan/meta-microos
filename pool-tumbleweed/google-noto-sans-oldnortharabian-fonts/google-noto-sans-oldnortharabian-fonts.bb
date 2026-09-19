SUMMARY = "Noto Old North Arabian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldNorthArabian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldnortharabian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f8e7b2a695116d40c7f165a1102e048fe230e7ca99deb10657df13dff74d63eb72360acfa8cbdb32e6ea26a76d05fe9120e9e16311e7ef49bf91ff4b999fd8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldnortharabian-fonts \
noto-sans-oldnortharabian \
noto-sans-oldnortharabian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
