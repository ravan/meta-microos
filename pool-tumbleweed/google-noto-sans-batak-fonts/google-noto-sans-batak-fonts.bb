SUMMARY = "Noto Batak Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Batak Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-batak-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e9794911c854a931d237a089919e7b10446c5276ad50f3a279768989d001a04af573690946eb3dfc664774a4d5445ce18a657285d2025ff7f7e23e3a8785aefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-batak-fonts \
noto-sans-batak \
noto-sans-batak-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
