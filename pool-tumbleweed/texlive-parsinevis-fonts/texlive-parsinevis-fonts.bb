SUMMARY = "Severed fonts for texlive-parsinevis"
DESCRIPTION = "The  separated fonts package for texlive-parsinevis"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn70776"

RPM_NAME = "texlive-parsinevis-fonts-2026.226.2.2svn70776-58.2.noarch.rpm"
RPM_HASH = "c838ee00ad62d8ad69ef50383bfbb20b041be65ff082cda3ef0d9f1bd9658d05279521202d2cec9516f9a054b270770118a41bb53217e969060ad383092e8166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=ar \
font--lang=az-ir \
font--lang=bem \
font--lang=fa \
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
font-parsinevis \
texlive-parsinevis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
