SUMMARY = "Big Japanese Fonts for the X Window System"
DESCRIPTION = "Big Japanese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-japanese-big-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "0a0e5edebc38265812057bdd960f98d6015ee8c95f667bdc071f3aa7c5d6f27d8e880711f8e4e8419eccab270d7928755fcd2281aba636e2fc99013174acef8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntjapb \
intlfonts-japanese-big-bitmap-fonts \
locale-xorg-x11-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
