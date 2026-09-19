SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "A set of serif OpenType fonts designed to complement Source Sans Pro"
LICENSE = "OFL-1.1"

PV = "3.000"

RPM_NAME = "adobe-sourceserifpro-fonts-3.000-2.14.noarch.rpm"
RPM_HASH = "dddc94c9b941fbaf6e12354e86c46f3197777513ec5197b6782d06cbfd9fa0fa8747b1c0d182bbb24af38de37ab55a303e6ebe122876e53da0790cdcfe618446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourceserifpro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
