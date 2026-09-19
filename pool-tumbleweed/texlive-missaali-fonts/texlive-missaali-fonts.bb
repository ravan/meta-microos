SUMMARY = "Severed fonts for texlive-missaali"
DESCRIPTION = "The  separated fonts package for texlive-missaali"
LICENSE = "OFL-1.1"

PV = "2026.226.2.0svn61719"

RPM_NAME = "texlive-missaali-fonts-2026.226.2.0svn61719-61.2.noarch.rpm"
RPM_HASH = "38be468c7973ffea5e4747fd9018d16504bdb9282dfb53d7461b3902d70b57df2c295093b03b202d4d839267cb756c905851e08b1370b27df2de6c8ce78130d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=agr \
font--lang=ayc \
font--lang=bem \
font--lang=de \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=nds \
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
font--lang=vo \
font--lang=wae \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-missaali \
texlive-missaali-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
