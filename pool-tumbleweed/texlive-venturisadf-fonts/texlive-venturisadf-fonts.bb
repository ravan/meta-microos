SUMMARY = "Severed fonts for texlive-venturisadf"
DESCRIPTION = "The  separated fonts package for texlive-venturisadf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-venturisadf-fonts-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "93229f5aac76736ab2ce412a4bd40c2425ed8af5271309c5b3dd50f85143b53d7ba6eab68a5e5b37daf376646db6fbe7048ef199cf9a4979719c3865302fa617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-venturisadf-fonts \
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
font-venturisadf \
font-venturisadfcd \
font-venturisadfcdstyle \
font-venturisadfgothtitling \
font-venturisadfheavy \
font-venturisadfno2 \
font-venturisadfno2cd \
font-venturisadfno2med \
font-venturisadfstyle \
font-venturisadftitlingno1 \
font-venturisadftitlingno2 \
font-venturisadftitlingno3 \
font-venturisadftitlingno4 \
font-venturisoldadf \
font-venturissansadf \
font-venturissansadfcd \
font-venturissansadfex \
font-venturissansadfheavy \
font-venturissansadflight \
font-venturissansadflt \
font-venturissansadfno2 \
font-venturissansadfno2cd \
font-venturissansadfno2ex \
texlive-venturisadf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
