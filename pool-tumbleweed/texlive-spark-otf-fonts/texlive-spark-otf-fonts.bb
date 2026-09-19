SUMMARY = "Severed fonts for texlive-spark-otf"
DESCRIPTION = "The  separated fonts package for texlive-spark-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.05asvn77682"

RPM_NAME = "texlive-spark-otf-fonts-2026.226.0.0.05asvn77682-64.2.noarch.rpm"
RPM_HASH = "c5a1fed9683f237657dd9c06b4740506266833af2b534c3eaa682504cbf4c0583bef89b3c924c18a3d0f4c061b689cb9293d5d25954ee08174943f28bf8aabbd"
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
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=es \
font--lang=eu \
font--lang=fil \
font--lang=fj \
font--lang=fo \
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
font-sparks \
font-sparksbarextra-narrow \
font-sparksbarextra-wide \
font-sparksbarmedium \
font-sparksbarnarrow \
font-sparksbarwide \
font-sparksdot-lineextra-thick \
font-sparksdot-lineextra-thin \
font-sparksdot-linemedium \
font-sparksdot-linethick \
font-sparksdot-linethin \
font-sparksdotextra-large \
font-sparksdotextra-small \
font-sparksdotlarge \
font-sparksdotmedium \
font-sparksdotsmall \
texlive-spark-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
