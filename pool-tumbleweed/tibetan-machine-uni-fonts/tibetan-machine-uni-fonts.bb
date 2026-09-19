SUMMARY = "Font for Tibetan Script"
DESCRIPTION = "The Tibetan & Himalayan Library is pleased to make available the alpha \
release of the Unicode character based Tibetan Machine Uni OpenType font \
for writing Tibetan, Dzongkha and Ladakhi in dbu can script with full \
support for the Sanskrit combinations found in chos skad texts."
LICENSE = "GPL-3.0"

PV = "1.901"

RPM_NAME = "tibetan-machine-uni-fonts-1.901-3.25.noarch.rpm"
RPM_HASH = "1112818739efa39dd0731492a930ee88b04b27d1cb0810d5deb5ec3f66cca85d19dff6771ead1b25631d00dc7198338fc5f195607f1dc8c762aed9d3dc2e7d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tibetan-machine-uni-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
