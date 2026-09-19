SUMMARY = "Noto Traditional Nushu Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TraditionalNushu font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-traditionalnushu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "cf59e870a573f56dade2ab2510ef55a1f035634a2ebe155e2b29acc5da3ab2217f86c5fba04a30ffc041138633d1fbd40175150fc95fb4cac3383e46cde462d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-traditionalnushu-fonts \
noto-traditionalnushu \
noto-traditionalnushu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
