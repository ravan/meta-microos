SUMMARY = "A font family inspired by Highway Gothic"
DESCRIPTION = "Overpass is a (sans-serif) font family inspired by Highway Gothic. \
 \
This package contains the proportional variants in OpenType format."
LICENSE = "OFL-1.1"

PV = "3.0.5"

RPM_NAME = "redhat-overpass-fonts-3.0.5-2.9.noarch.rpm"
RPM_HASH = "d772bd39269a84119c05af3abd45611d1cd4a029f36b9766e7313ee7ee942a4dbf7b962f2aeda1999377adfc52907ff3a70bd19a9a1c54e610682ef33fbd23c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redhat-overpass-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
