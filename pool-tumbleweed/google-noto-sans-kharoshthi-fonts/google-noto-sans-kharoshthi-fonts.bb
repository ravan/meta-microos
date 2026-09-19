SUMMARY = "Noto Kharoshthi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kharoshthi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-kharoshthi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9a7c344da2a433938b9b6d9b3b3bccb62bee625b5f27b7cf2b726c6b4dff1498b20a78ce1fe664d0094555fc52a889af47c78b62986b20d34ed8bacefeed8ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kharoshthi-fonts \
noto-sans-kharoshthi \
noto-sans-kharoshthi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
