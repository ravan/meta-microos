SUMMARY = "Severed fonts for texlive-tapir"
DESCRIPTION = "The  separated fonts package for texlive-tapir"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn20484"

RPM_NAME = "texlive-tapir-fonts-2026.227.0.0.2svn20484-62.2.noarch.rpm"
RPM_HASH = "ab3c8a4bfb234fb56346377bbf221fc50824bad8f1e2816301661eedebca90d5bdc59b9bd3ef761b5f4cd147fec678946f17f310910132c561d4f8c54a262201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=agr \
font--lang=bem \
font--lang=cs \
font--lang=de \
font--lang=dsb \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=mg \
font--lang=ms \
font--lang=nds \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sk \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wae \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-tapir \
texlive-tapir-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
