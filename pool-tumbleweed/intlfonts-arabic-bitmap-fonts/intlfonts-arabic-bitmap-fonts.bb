SUMMARY = "Arabic Fonts for the X Window System"
DESCRIPTION = "Arabic fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-arabic-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "42c152b5118c902e5bbe04a3d52c92d36f74e9c07a82f54d63570513c2d1b19b82de243fcf010d0309d76dd554190a1d4767a23df1f433f3bc2ed2b458d4a70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntarab \
intlfonts-arabic-bitmap-fonts \
locale-xorg-x11-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
