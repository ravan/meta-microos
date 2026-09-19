SUMMARY = "Noto Thai Looped Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ThaiLooped Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-thailooped-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "c9f1a61ade949ac39f62fe47c51adc7652c6d918ecba9e7c4f175376ad4adfe8c5cc6a1b52f8516c3fae7ea4fffc840f8844885d098189cd2921b5c9626c532c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-thailooped-fonts \
noto-loopedthai \
noto-loopedthai-fonts \
noto-loopedthai-ui \
noto-loopedthai-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
