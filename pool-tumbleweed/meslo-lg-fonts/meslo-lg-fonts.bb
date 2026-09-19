SUMMARY = "Meslo LG Font Family"
DESCRIPTION = "Meslo LG is a customized version of Apple's Menlo-Regular font (which is \
a customized Bitstream Vera Sans Mono)."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "meslo-lg-fonts-1.2.5-1.4.noarch.rpm"
RPM_HASH = "43d470e25544dea89335bc74be7d3499a1fb7b06d25ec1bb6333a72e7831349c10c2f5d93941b731326befbe832f681d32f67d3b84af7d0c25e7b3e7c19159ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meslo-lg-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
