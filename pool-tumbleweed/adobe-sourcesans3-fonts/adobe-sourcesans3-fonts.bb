SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "Source Sans is a set of OpenType fonts that have been designed to work well in user interface (UI) environments, as well as in text setting for screen and print."
LICENSE = "OFL-1.1"

PV = "3.052"

RPM_NAME = "adobe-sourcesans3-fonts-3.052-1.9.noarch.rpm"
RPM_HASH = "770430fdde69216d37dcaa25e06f85c3833e176c9d4e26eda9e720fefce8740375000dabb8113e3305c4144cec0c3852d00b89bdd7dd8bc1db5eb21da4752496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcesans3-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
