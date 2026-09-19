SUMMARY = "Severed fonts for texlive-concmath-otf"
DESCRIPTION = "The  separated fonts package for texlive-concmath-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78172"

RPM_NAME = "texlive-concmath-otf-fonts-2026.226.0.0.73svn78172-60.2.noarch.rpm"
RPM_HASH = "0f96c374e9bfd74d01f0f424d7cb992169d939d6da2b3593aa9b9d4822b497e662ebcd75977593f7a75b606dd970225f7f6838f35dc95825a9ffcf2681e871a1"
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
font-concretemath \
texlive-concmath-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
