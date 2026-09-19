SUMMARY = "Noto Tai Viet Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiViet Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-taiviet-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7c3263784024fd90ac4c26e05baf728d28ef085dafa092b2a029e365a7efa0fc02307873dce7267e82e71ad4ae2454b9e62fd4e20f6b3e2e4c20f5d00e35b9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-taiviet-fonts \
noto-sans-taiviet \
noto-sans-taiviet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
