SUMMARY = "Chinese font derived from Klee One"
DESCRIPTION = "A Chinese font derived from Fontworks's Klee One."
LICENSE = "OFL-1.1"

PV = "1.300"

RPM_NAME = "lxgw-wenkai-screen-fonts-1.300-2.9.noarch.rpm"
RPM_HASH = "eb4eeecc2c0fd2c2f206ef2cfbe9077f2033d746445ddb1bda1d85f1295b898361fd1f04264608bfe8fd9493fde2570fa113796c5624a55c90c8d50bca5d7c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxgw-wenkai-screen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
