SUMMARY = "Severed fonts for texlive-adforn"
DESCRIPTION = "The  separated fonts package for texlive-adforn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78142"

RPM_NAME = "texlive-adforn-fonts-2026.226.1.4svn78142-61.2.noarch.rpm"
RPM_HASH = "bb1d8c2c7d24341b2e97273f12ca3c9dd08b8e1af31616b3a18377c666a66191e62c16a781ce007905cd094fe55dc3162be42a49eaf91677e11b47240eee11a8"
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
font-ornementsadf \
texlive-adforn-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
