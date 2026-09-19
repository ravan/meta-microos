SUMMARY = "Noto Tamil Supplement Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TamilSupplement Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tamilsupplement-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "3230d0505563a77447ddb51594ce11150df14aef6ba3f7b68a4ff176e4a37ff1c09cd3ef3ccad36dab29db0249f6ec4d85e609837cf2fdb611e304cb95549621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tamilsupplement-fonts \
noto-sans-tamilsupplement \
noto-sans-tamilsupplement-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
