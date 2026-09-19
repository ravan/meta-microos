SUMMARY = "Severed fonts for texlive-quattrocento"
DESCRIPTION = "The  separated fonts package for texlive-quattrocento"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-quattrocento-fonts-2026.226.svn77682-60.4.noarch.rpm"
RPM_HASH = "fb4df05edd095f3b1eba6e0e6c76a2b19e33bf8d02f1f55dc708b3048e6ecc8da4fd87146db9eb0e1cb3f872f10706d45134855f3364b67d83006a7c8da2123c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-quattrocento-fonts \
font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
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
font--lang=kwm \
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
font--lang=pap-an \
font--lang=pap-aw \
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
font--lang=unm \
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
font-quattro \
font-quattrocento \
font-quattrocentosans \
font-quattrosans \
texlive-quattrocento-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
