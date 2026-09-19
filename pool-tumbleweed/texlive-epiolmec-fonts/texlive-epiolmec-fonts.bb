SUMMARY = "Severed fonts for texlive-epiolmec"
DESCRIPTION = "The  separated fonts package for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-epiolmec-fonts-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "b324cb27389e0095ea54dbc7bc83af55cfa78b5b0ab970d6b663cf4a13fe377d3e80aa60213814154ad6cec77135bd7853e39d558ce60879122cd98450c4bed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=lg \
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
font-epi-olmce \
texlive-epiolmec-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
