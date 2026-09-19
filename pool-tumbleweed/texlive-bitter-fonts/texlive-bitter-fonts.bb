SUMMARY = "Severed fonts for texlive-bitter"
DESCRIPTION = "The  separated fonts package for texlive-bitter"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bitter-fonts-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "66d1ff29a9b0f53839d910000853ddf614e2a50926fab55af4687b8156b84c57d639009f624fd94d8747175fb332ad325087f12030a48378e8a9a7ffef38e3af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-bitter-fonts \
font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
font--lang=bem \
font--lang=bi \
font--lang=br \
font--lang=ca \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=csb \
font--lang=cy \
font--lang=da \
font--lang=de \
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
font--lang=hsb \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=li \
font--lang=lij \
font--lang=lt \
font--lang=mfe \
font--lang=mg \
font--lang=mh \
font--lang=mjw \
font--lang=ms \
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
font--lang=szl \
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
font-bitter \
font-bttr \
texlive-bitter-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
