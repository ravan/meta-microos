SUMMARY = "Noto Pahawh Hmong Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PahawhHmong Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-pahawhhmong-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "91963595eacac4f6b67f0e4929ed7de0b17c768606f001b397ce23364685a50dcbf5ce1a70d566393409bdf87733696377e6dbb4c34ffefa3e54ec2669672250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-pahawhhmong-fonts \
noto-sans-pahawhhmong \
noto-sans-pahawhhmong-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
