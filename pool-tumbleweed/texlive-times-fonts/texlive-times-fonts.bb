SUMMARY = "Severed fonts for texlive-times"
DESCRIPTION = "The  separated fonts package for texlive-times"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-times-fonts-2026.226.svn77161-59.2.noarch.rpm"
RPM_HASH = "f565fcc6b43102023677b80777e2c90b59b7b8ce955f98d22e7bc21472dbd1ce7acc3a5d60bcc8295177dd6b7f84339608f022d0144ac0f4b0d572299855d3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
font--lang=bem \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=da \
font--lang=de \
font--lang=dsb \
font--lang=en \
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
font--lang=gv \
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
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=li \
font--lang=lij \
font--lang=lt \
font--lang=lv \
font--lang=mfe \
font--lang=mg \
font--lang=mh \
font--lang=mjw \
font--lang=ms \
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
font--lang=sg \
font--lang=sk \
font--lang=sl \
font--lang=sma \
font--lang=smj \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tpi \
font--lang=tr \
font--lang=ts \
font--lang=unm \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wae \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-nimbusromanno9l \
texlive-times-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
