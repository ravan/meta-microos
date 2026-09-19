SUMMARY = "Severed fonts for texlive-ethiop-t1"
DESCRIPTION = "The  separated fonts package for texlive-ethiop-t1"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ethiop-t1-fonts-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "dc2c98f1b87e4993f516fa0a021bf958daf3fa8d1194ad6b63843bc4b969c70d757fa04110a139495ea7d25f7539e1bc162421cab296371fce13da8c185360fa"
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
font-etha10 \
font-etha6 \
font-etha7 \
font-etha8 \
font-ethab10 \
font-ethab11 \
font-ethab12 \
font-ethab14 \
font-ethab18 \
font-ethab24 \
font-ethab36 \
font-ethab9 \
font-ethas10 \
font-ethasb10 \
font-ethasb11 \
font-ethasb12 \
font-ethasb14 \
font-ethasb18 \
font-ethasb24 \
font-ethasb36 \
font-ethasb9 \
font-ethatt10 \
font-ethb10 \
font-ethb6 \
font-ethb7 \
font-ethb8 \
font-ethbb10 \
font-ethbb11 \
font-ethbb12 \
font-ethbb14 \
font-ethbb18 \
font-ethbb24 \
font-ethbb36 \
font-ethbb9 \
font-ethbs10 \
font-ethbsb10 \
font-ethbsb11 \
font-ethbsb12 \
font-ethbsb14 \
font-ethbsb18 \
font-ethbsb24 \
font-ethbsb36 \
font-ethbsb9 \
font-ethbtt10 \
texlive-ethiop-t1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
