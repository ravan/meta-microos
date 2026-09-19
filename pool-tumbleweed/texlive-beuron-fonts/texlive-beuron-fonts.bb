SUMMARY = "Severed fonts for texlive-beuron"
DESCRIPTION = "The  separated fonts package for texlive-beuron"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn46374"

RPM_NAME = "texlive-beuron-fonts-2026.226.1.3svn46374-61.2.noarch.rpm"
RPM_HASH = "607d0c7a3a719f3ef323f82946896949085283b84d27867b054a218a4415f95ef772987556090bad99b3abf431e2224c8e6ec836a8f398cc956c51609f4ef634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-beuron-fonts \
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
font-beuron \
font-beuroncondensed \
font-beuronextended \
texlive-beuron-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
