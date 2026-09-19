SUMMARY = "Ethiopic Fonts for the X Window System"
DESCRIPTION = "Ethiopic fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-ethiopic-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "23be678820192d8e916c8241f4474c752b6273c9f91e7a1df8929d0efc0c130dfe556ae8aad3e405baac41195c1baf640205a043e2f2502ea16fc4ba2b7cd989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntethi \
intlfonts-ethiopic-bitmap-fonts \
locale-xorg-x11-am"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
