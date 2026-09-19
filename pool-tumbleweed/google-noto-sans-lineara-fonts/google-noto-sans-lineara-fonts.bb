SUMMARY = "Noto Linear A Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LinearA Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-lineara-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b81e0e7104fb68e2df12754c93f5ad9772b220a5999bee699cc88b81980b0a91c5067b38bc2c02e8e560ef3c0f8b04c8f568f6a07d549f59f84f290d3cfc5e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-lineara-fonts \
noto-sans-lineara \
noto-sans-lineara-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
