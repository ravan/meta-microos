SUMMARY = "Severed fonts for texlive-amiri"
DESCRIPTION = "The  separated fonts package for texlive-amiri"
LICENSE = "OFL-1.1"

PV = "2026.226.1.000svn65191"

RPM_NAME = "texlive-amiri-fonts-2026.226.1.000svn65191-61.2.noarch.rpm"
RPM_HASH = "c816158f406e661e35158370586218ff4c51f49fe746c33689b1da36de68b7172a11472fda291ab7e91bd3d8d5cf07ac0bbe23852ee90ad8bf9a4491a15af88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=agr \
font--lang=an \
font--lang=ar \
font--lang=ay \
font--lang=ayc \
font--lang=az-ir \
font--lang=bem \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ch \
font--lang=ckb \
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
font--lang=fa \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=ga \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=haw \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ks \
font--lang=ku-iq \
font--lang=ku-ir \
font--lang=ku-tr \
font--lang=kwm \
font--lang=la \
font--lang=lah \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=lij \
font--lang=lt \
font--lang=lv \
font--lang=mfe \
font--lang=mg \
font--lang=mh \
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
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=ota \
font--lang=pa-pk \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=ps-af \
font--lang=ps-pk \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sd \
font--lang=se \
font--lang=sg \
font--lang=sgs \
font--lang=sk \
font--lang=sl \
font--lang=sm \
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
font--lang=to \
font--lang=tpi \
font--lang=tr \
font--lang=ts \
font--lang=ty \
font--lang=ug \
font--lang=unm \
font--lang=ur \
font--lang=uz \
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
font-amiri \
font-amiriquran \
font-amiriqurancolored \
texlive-amiri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
