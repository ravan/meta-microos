SUMMARY = "The ghostscript container to wrap ghostscript within"
DESCRIPTION = "If the option -dSAFER is used with gswrap, this script uses bwrap \
from the 'bubblewrap' package to embbedd the final ghostscript \
command within a minimal container. For this, a new, completely empty \
filesystem namespace on a tmpfs is populated with the required \
libraries and files to run the ghostscript command."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "gswrap-0.1-12.3.noarch.rpm"
RPM_HASH = "31f870003d5cd0989b538076625b695bc5e32b7f6b2955f5a674dafce2de39595d5d89fbb09c7182aa120b7136fd6ee786c8edea5387b613cf9c9b12f59d5f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gswrap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gs.bin \
alts \
bubblewrap \
coreutils \
sed"

inherit rpm
