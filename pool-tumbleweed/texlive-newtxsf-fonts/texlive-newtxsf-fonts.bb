SUMMARY = "Severed fonts for texlive-newtxsf"
DESCRIPTION = "The  separated fonts package for texlive-newtxsf"
LICENSE = "OFL-1.1"

PV = "2026.226.1.056svn77682"

RPM_NAME = "texlive-newtxsf-fonts-2026.226.1.056svn77682-61.2.noarch.rpm"
RPM_HASH = "58dfbf5b66db919d804e17197550d7979da61ac097a38a249556a2b707097f027d91b8e63c00a8f1e590f1125c82eda40396b7b78519910f07d3f6e9c07dd0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
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
font-zsfbmi \
font-zsfmi \
font-zsfmia \
texlive-newtxsf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
