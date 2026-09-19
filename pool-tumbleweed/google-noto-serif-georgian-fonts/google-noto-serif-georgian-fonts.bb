SUMMARY = "Noto Georgian Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Georgian Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-georgian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8c75991ffa6ab0c49739fd88c82f7601e02a0a99a7a4361c4f722bed9fe5485c4ab046f2f37a709f86fb26b3bf9f70f4ca392a4bb3df760a118815765dad3810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-georgian-fonts \
noto-serif-georgian \
noto-serif-georgian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
