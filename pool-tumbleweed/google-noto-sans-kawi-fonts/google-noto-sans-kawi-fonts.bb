SUMMARY = "Noto Kawi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kawi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-kawi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "28ec4af7c928661ca0d718a2c7b0016dcd1080c2e9f7e6c73f19392054398f580d5aafc5a7191bc0e4ddc4647088493284a5e848d038e749512a2cad8b6d616b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kawi-fonts \
noto-sans-kawi \
noto-sans-kawi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
