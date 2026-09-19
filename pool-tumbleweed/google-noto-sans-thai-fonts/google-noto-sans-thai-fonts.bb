SUMMARY = "Noto Thai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-thai-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "20d8a28ecc3f6a0e3b3d470e208ca0fc04623340c1e6b64e334d938f183d0459539ebe25528205e555905c009ee0e8d60d59fdde8bc214058c7058f61025baf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-thai-fonts \
noto-sans-thai \
noto-sans-thai-fonts \
noto-sans-thai-ui \
noto-sans-thai-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
