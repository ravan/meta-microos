SUMMARY = "Asian Fonts for the X Window System"
DESCRIPTION = "Asian fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-asian-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "90e8bc321d1a9a3dc3251f1f5f01321d96d1d7af60c6c9b7982671cc60752b69bb10805b5f2c5f405c08855d2d1770443c4c04cda4bb32e3ebabe6d8f2c53cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntasia \
intlfonts-asian-bitmap-fonts \
locale-xorg-x11-km;th;vi"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
