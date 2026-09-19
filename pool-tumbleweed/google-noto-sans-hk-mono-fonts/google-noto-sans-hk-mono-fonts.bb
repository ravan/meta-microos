SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-mono-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "106e6a5ad7f9130fd31c26d6168f7e9de70122d1875f74f5fd18b94a0905ae1b51e2a97406f1a3bd9ce51b26bb224ad4c6e580fae18ce0f30b6d55fdcd3dbf3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-mono-fonts \
noto-sans-hk-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
