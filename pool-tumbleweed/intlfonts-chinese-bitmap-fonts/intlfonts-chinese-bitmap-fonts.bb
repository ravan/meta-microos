SUMMARY = "Chinese Fonts for the X Window System"
DESCRIPTION = "Chinese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-chinese-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "399ddcbe69625330c45b0c619ed140cc84f0dd9c139723b5925b83d224c8c66207fc06c016420a216fa35f89948a29d95db37150ade80f66dc61bd7c21f8ccea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntchia \
intlfonts-chinese-bitmap-fonts \
locale-xorg-x11-zh"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
