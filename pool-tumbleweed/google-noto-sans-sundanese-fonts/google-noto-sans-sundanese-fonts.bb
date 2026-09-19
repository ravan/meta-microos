SUMMARY = "Noto Sundanese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sundanese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sundanese-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d24e5b8392be2829e79d287202ba5da0a6d36c58e9de582ef93cb8e836e00947ec00733abae207f8783cd53d62701d81b89b8dc15684c235d6d269126b99936d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sundanese-fonts \
noto-sans-sundanese \
noto-sans-sundanese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
