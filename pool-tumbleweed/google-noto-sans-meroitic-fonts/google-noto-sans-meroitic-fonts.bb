SUMMARY = "Noto Meroitic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Meroitic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-meroitic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a498c20e80164b0949d6da005f6e7d45f158bff13b4c1b5e9696b33d8d7d7f4af879497af302824c10826bc80193d33962a3ca51f2ed2ceb70eb45e7fb2445ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-meroitic-fonts \
noto-sans-meroitic \
noto-sans-meroitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
