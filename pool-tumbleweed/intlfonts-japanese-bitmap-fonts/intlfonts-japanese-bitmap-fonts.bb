SUMMARY = "Japanese Fonts for the X Window System"
DESCRIPTION = "Japanese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-japanese-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "acf00ae2d9a9d265eadec95d4fadeeb6b3056935422e31ea57a6cd645a40c0c3819bf3c48b5cbc38ab7b9b5f9355a7dc7474c80fb89303d44ece54c790e8bcb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntjapa \
intlfonts-japanese-bitmap-fonts \
locale-xorg-x11-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
