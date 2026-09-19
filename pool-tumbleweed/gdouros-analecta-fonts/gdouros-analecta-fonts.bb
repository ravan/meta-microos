SUMMARY = "An Ecclesiastic Scripts Font"
DESCRIPTION = "Analecta is an ecclesiastic scripts font, covering Basic Latin, Greek and Coptic, some Punctuation and other Symbols, Coptic, typographica varia, Specials, Gothic and Deseret."
LICENSE = "SUSE-Permissive"

PV = "5.17"

RPM_NAME = "gdouros-analecta-fonts-5.17-1.23.noarch.rpm"
RPM_HASH = "82d84f794c6275f21e6e1b8dff36bc55bf82b0e5dd7e1a098a777e12170a92a625d4ec2e7fc4751d879c74747f4cd6c8f1ed03ee05b427e96d0ad7ba0cb58e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analecta-fonts \
gdouros-analecta-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
