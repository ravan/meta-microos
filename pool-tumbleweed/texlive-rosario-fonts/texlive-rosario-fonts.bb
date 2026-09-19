SUMMARY = "Severed fonts for texlive-rosario"
DESCRIPTION = "The  separated fonts package for texlive-rosario"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn51688"

RPM_NAME = "texlive-rosario-fonts-2026.226.2.1svn51688-60.2.noarch.rpm"
RPM_HASH = "0db3d26d84da5fe384cf478c0cd2d7fb98c0e1a1c4b8303a1c1acb1ed9807e6cd9cb721212fea3ebf7ba74a5d76983393d125bbec9d465762a834a756f6bcbb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-rosario-fonts \
font--lang=aa \
font--lang=af \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
font--lang=az-az \
font--lang=bem \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cy \
font--lang=da \
font--lang=de \
font--lang=dsb \
font--lang=en \
font--lang=eo \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=gd \
font--lang=gl \
font--lang=gn \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ig \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kw \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=lij \
font--lang=lt \
font--lang=lv \
font--lang=mfe \
font--lang=mg \
font--lang=mh \
font--lang=miq \
font--lang=mjw \
font--lang=ms \
font--lang=mt \
font--lang=na \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nhn \
font--lang=niu \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=nv \
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=rw \
font--lang=sc \
font--lang=se \
font--lang=sg \
font--lang=sgs \
font--lang=shs \
font--lang=sk \
font--lang=sl \
font--lang=sma \
font--lang=smj \
font--lang=smn \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=szl \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tpi \
font--lang=tr \
font--lang=ts \
font--lang=ty \
font--lang=unm \
font--lang=uz \
font--lang=vi \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wae \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-rosario \
font-rosario-bold \
font-rosario-bolditalic \
font-rosario-italic \
font-rosario-light \
font-rosario-lightitalic \
font-rosario-regular \
font-rosario-semibold \
font-rosario-semibolditalic \
font-rosariolight \
font-rosariolightitalic \
font-rosariosemibold \
font-rosariosemibolditalic \
texlive-rosario-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
