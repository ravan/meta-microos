SUMMARY = "A complete, SMuFL compliant music font"
DESCRIPTION = "Bravura is the reference music font for the Standard Music Font Layout \
(SMuFL) specification, fully compliant with SMuFL 1.2."
LICENSE = "OFL-1.1"

PV = "1.392"

RPM_NAME = "steinberg-bravura-fonts-1.392-1.14.noarch.rpm"
RPM_HASH = "891656d3d5b71fa53e203d21c27e97bb436c40af8a09d766665eaf84436e56ec989e30dba2e070ff4b962bb9ab3eeb70fc4c4d3ea493aa4d001965d0b7f78ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "steinberg-bravura-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
