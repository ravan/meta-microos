SUMMARY = "Noto Tamil Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-tamil-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9fd803efd845262bb7fc41cb29d1c643d6eb6a49f37ebcd2d7fdb44f84ddfd692189e1f1c853abcd1872dc33be8d1f84bd8dd7db44c9c7ba785041a91968f1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tamil-fonts \
noto-serif-tamil \
noto-serif-tamil-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
