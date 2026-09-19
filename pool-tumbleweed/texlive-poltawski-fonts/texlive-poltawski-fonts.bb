SUMMARY = "Severed fonts for texlive-poltawski"
DESCRIPTION = "The  separated fonts package for texlive-poltawski"
LICENSE = "LPPL-1.3c"

PV = "2026.226.1.101svn77682"

RPM_NAME = "texlive-poltawski-fonts-2026.226.1.101svn77682-59.2.noarch.rpm"
RPM_HASH = "434662386b9a0b8cb9ba13eeb82e8af933a60886f89c81d5cc744cc1bcf894dddbf0d21adbd1538d12402673e386d5547d23849e1d7ee6418043c56eae2ffb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-poltawski-fonts \
font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ast \
font--lang=ay \
font--lang=ayc \
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
font--lang=ku-tr \
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
font--lang=sgs \
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
font--lang=unm \
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
font-antpolt \
font-antpoltcond \
font-antpoltexpd \
font-antpoltlt \
font-antpoltltcond \
font-antpoltltexpd \
font-antpoltltsemicond \
font-antpoltltsemiexpd \
font-antpoltsemicond \
font-antpoltsemiexpd \
font-antykwapoltawskiego \
font-antykwapoltawskiegolight \
texlive-poltawski-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
