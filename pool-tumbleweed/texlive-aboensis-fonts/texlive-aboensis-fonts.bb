SUMMARY = "Severed fonts for texlive-aboensis"
DESCRIPTION = "The  separated fonts package for texlive-aboensis"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-aboensis-fonts-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "5d88c93d678969885ecd2e49261ab87371fde718c1fb6d8261a1bd35f71c860c057bb35b54e319ae68f6eaee3b662b49681ba66037caa4810eaf3993d772b899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=agr \
font--lang=bem \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-aboensis \
texlive-aboensis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
