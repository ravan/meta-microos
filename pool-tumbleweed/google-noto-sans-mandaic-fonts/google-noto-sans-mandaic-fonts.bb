SUMMARY = "Noto Mandaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mandaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mandaic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "0825f10efe7fae90a139ff8f6c1e05977f98a7ff6c7cfa7983bec977d87086fc2e17ec5851a72fc2a4b172e377da26112496454270b93843a75bbac42300799b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mandaic-fonts \
noto-sans-mandaic \
noto-sans-mandaic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
