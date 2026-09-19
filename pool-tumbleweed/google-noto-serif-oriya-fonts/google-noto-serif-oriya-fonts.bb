SUMMARY = "Noto Oriya Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-oriya-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8a587649dc10514ba9279047a565f092a02f4b71b476b6ae865d6be9675f2335ac67cb0255c3f05df835bb12ec49af9a6058dea2d14bc8042cf02db94bbf01a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-oriya-fonts \
noto-serif-oriya \
noto-serif-oriya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
