SUMMARY = "Noto Khmer Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-khmer-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b7b30d8ca983944b98b73148a7e746fa444f16f8fb7bece0afb92324cd4a587ff2da9053e0e9c5db0837fef0aba22b829f9c0ccb39a474fb918ad96b10e66a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-khmer-fonts \
noto-serif-khmer \
noto-serif-khmer-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
