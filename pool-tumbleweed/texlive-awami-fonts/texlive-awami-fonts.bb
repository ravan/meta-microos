SUMMARY = "Severed fonts for texlive-awami"
DESCRIPTION = "The  separated fonts package for texlive-awami"
LICENSE = "OFL-1.1"

PV = "2026.226.3.400svn76980"

RPM_NAME = "texlive-awami-fonts-2026.226.3.400svn76980-60.2.noarch.rpm"
RPM_HASH = "e00a14e98a2cce5a259a4b396fa1f211262f9f83b6aef7ff25ee9ee87285714c755e076b80c02ad68370b4423080a763d078f389d552f7826cd6ead58fc7f4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ar \
font--lang=ay \
font--lang=ayc \
font--lang=az-ir \
font--lang=bem \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
font--lang=da \
font--lang=de \
font--lang=en \
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
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ks \
font--lang=kwm \
font--lang=lah \
font--lang=lb \
font--lang=li \
font--lang=lij \
font--lang=mfe \
font--lang=mg \
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
font--lang=ota \
font--lang=pa-pk \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=ps-af \
font--lang=ps-pk \
font--lang=pt \
font--lang=rm \
font--lang=rn \
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
font--lang=tl \
font--lang=tn \
font--lang=tpi \
font--lang=ts \
font--lang=ug \
font--lang=unm \
font--lang=ur \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wae \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-awaminastaliq \
font-awaminastaliqextrabold \
font-awaminastaliqmedium \
font-awaminastaliqsemibold \
texlive-awami-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
