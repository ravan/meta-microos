SUMMARY = "Severed fonts for texlive-unfonts-core"
DESCRIPTION = "The  separated fonts package for texlive-unfonts-core"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn56291"

RPM_NAME = "texlive-unfonts-core-fonts-2026.226.svn56291-60.2.noarch.rpm"
RPM_HASH = "d699937f4784db0b5c550721a935860b2cb0fac1667a68dcf06d6c944403a02fc19099e752cfb5180602a0f3d7fd9552f158075017ae8051f5f260ae11e0dab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=agr \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=ayc \
font--lang=be \
font--lang=bem \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=da \
font--lang=de \
font--lang=el \
font--lang=en \
font--lang=es \
font--lang=eu \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ko \
font--lang=kum \
font--lang=kwm \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=lij \
font--lang=mfe \
font--lang=mg \
font--lang=mhr \
font--lang=mjw \
font--lang=ms \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=sel \
font--lang=sg \
font--lang=sma \
font--lang=smj \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=sr \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tl \
font--lang=tn \
font--lang=tpi \
font--lang=ts \
font--lang=unm \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=wae \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-unbatang \
font-undinaru \
font-undotum \
font-ungraphic \
font-ungungseo \
font-unpilgi \
font-은궁서 \
font-은그래픽 \
font-은돋움 \
font-은디나루 \
font-은바탕 \
font-은필기 \
texlive-unfonts-core-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
