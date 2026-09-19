SUMMARY = "Noto Adlam Unjoined Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
AdlamUnjoined Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-adlamunjoined-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "164e51bff01d311079613d91a633164b3523ad012bc39ccb8c4f60f85078254237031d122f112d0440f2f2503f5d07162b365248e1a735ca1216e38ee5e68fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-adlamunjoined-fonts \
noto-sans-adlamunjoined \
noto-sans-adlamunjoined-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
