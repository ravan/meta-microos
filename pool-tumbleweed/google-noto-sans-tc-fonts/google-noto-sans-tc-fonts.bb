SUMMARY = "Noto Sans Traditional Chinese Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Sans font for \
Traditional Chinese, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "ab410d5a1efc379e08fd721358ba1c8d3a03a93dc2e9300e809fe1afca9f37a90491cfe351e8da0d380c5675e147a8ca3b89493bed9c912e28f4928de31997d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-black-fonts \
google-noto-sans-tc-bold-fonts \
google-noto-sans-tc-demilight-fonts \
google-noto-sans-tc-fonts \
google-noto-sans-tc-fonts-full \
google-noto-sans-tc-light-fonts \
google-noto-sans-tc-medium-fonts \
google-noto-sans-tc-regular-fonts \
google-noto-sans-tc-thin-fonts \
locale-;zh-TW \
noto-sans-cjktc \
noto-sans-cjktc-fonts \
noto-sans-tc-fonts \
scalable-font-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
