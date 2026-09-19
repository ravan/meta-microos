SUMMARY = "Noto Oriya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oriya-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "5b0466e9dd3bc5cc234aee0ef7859fc8b82d611c3d2d7b9c502f20bb22591d12776a9d79c7303a0d41ffa588a7a2b7d4175e9ca267e3576e454228e4ebb4381d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oriya-fonts \
noto-sans-oriya \
noto-sans-oriya-fonts \
noto-sans-oriya-ui \
noto-sans-oriya-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
