SUMMARY = "Severed fonts for texlive-txfonts"
DESCRIPTION = "The  separated fonts package for texlive-txfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-txfonts-fonts-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "3e5e8fdafa2a3bccd44dc6f7e6ba94b7df9ed43e633cb70ad102cf88d78ed108625db0d8adeaf251dec69ba5c9d87a1f8723a08b8ec9e3c5eb0b4b9a8e631c6f"
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
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=sk \
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
font-rtcxb \
font-rtcxbi \
font-rtcxbss \
font-rtcxi \
font-rtcxr \
font-rtcxss \
font-rtxb \
font-rtxbi \
font-rtxbmi \
font-rtxbsc \
font-rtxbss \
font-rtxbsssc \
font-rtxi \
font-rtxmi \
font-rtxr \
font-rtxsc \
font-rtxss \
font-rtxsssc \
font-t1xbtt \
font-t1xbttsc \
font-t1xtt \
font-t1xttsc \
font-tcxbtt \
font-tcxtt \
font-txbex \
font-txbexa \
font-txbmia \
font-txbsy \
font-txbsya \
font-txbsyb \
font-txbsyc \
font-txbtt \
font-txbttsc \
font-txex \
font-txexa \
font-txmia \
font-txsy \
font-txsya \
font-txsyb \
font-txsyc \
font-txtt \
font-txttsc \
texlive-txfonts-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
