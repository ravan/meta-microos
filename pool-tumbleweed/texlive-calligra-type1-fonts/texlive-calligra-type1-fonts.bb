SUMMARY = "Severed fonts for texlive-calligra-type1"
DESCRIPTION = "The  separated fonts package for texlive-calligra-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-fonts-2026.226.001.000svn24302-59.2.noarch.rpm"
RPM_HASH = "37782c0a8ba1ec6dc5c038d1455d88393b5def244feb3f812ad2fe8c4b4dbd145dadff4ebe96de2d844e4b3156dacc6e567e448254653e9c20a9326036d5fe82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
font--lang=bem \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
font--lang=de \
font--lang=en \
font--lang=es \
font--lang=eu \
font--lang=fil \
font--lang=fj \
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
font--lang=io \
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
font--lang=tpi \
font--lang=ts \
font--lang=unm \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=wae \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-callig15 \
texlive-calligra-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
