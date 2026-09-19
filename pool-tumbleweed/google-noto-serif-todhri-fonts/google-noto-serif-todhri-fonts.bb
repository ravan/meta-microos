SUMMARY = "Noto Todhri Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Todhri Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-todhri-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6f2183697ec6bb50813eec19d07c5f4729055c55507494d4d4d35207953ff2a007394f65f85cb13ebed5ba89b290c7ba87cc727224f12e91717359208f55bba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-todhri-fonts \
noto-serif-todhri \
noto-serif-todhri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
