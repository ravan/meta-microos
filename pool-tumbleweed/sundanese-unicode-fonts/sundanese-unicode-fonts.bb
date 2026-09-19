SUMMARY = "Sundanese Unicode Font"
DESCRIPTION = "BabelStone latin modern font."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.5"

RPM_NAME = "sundanese-unicode-fonts-1.0.5-3.25.noarch.rpm"
RPM_HASH = "4a95580a80ff55db43c6fd8050f66ff2dd372b058bb7bdf46b922c22ee7fc7f70318618206b84311bdbd2fb069cc26b076e1a98e9a3b19ae82a9abfee634e80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sundanese-unicode-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
