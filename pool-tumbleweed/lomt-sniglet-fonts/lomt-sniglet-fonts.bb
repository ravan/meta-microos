SUMMARY = "League Of Movable Type's 'Sniglet' font"
DESCRIPTION = "A rounded display face intended primarily for headlines. It comes \
with a full Latin character set."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-sniglet-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "82d57d3689c4fe051f2d8ff9b62ba3c038a6d85388db3a0a1ab0b0f5a5640a75dfa40c4a7e38246de25ad9a195a354b9a81c094010868877b05268534ffea7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-sniglet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
