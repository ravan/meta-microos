SUMMARY = "Severed fonts for texlive-rit-fonts"
DESCRIPTION = "The  separated fonts package for texlive-rit-fonts"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn74984"

RPM_NAME = "texlive-rit-fonts-fonts-2026.226.1.0svn74984-60.4.noarch.rpm"
RPM_HASH = "c8e04a814d0a1459577696727f0084b305f61df3c2103df590e0a786f6c692c9c3a84c7ffb8d0ba915dd3b75fc84ea279ce297b4ee54ead78e04c5871103d936"
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
font--lang=ml \
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
font-ritala \
font-ritchingam \
font-ritezhuthu \
font-ritindira \
font-ritkaruna \
font-ritkeraleeyam \
font-ritkeram \
font-ritkutty \
font-ritlasya \
font-ritlekha \
font-ritmeeranew \
font-ritpanmana \
font-ritrachana \
font-ritsundar \
font-ritthaara \
font-rittnjoy \
font-rituroob \
font-അല \
font-ആര്‍ഐടിതാര \
font-ആർഐടിരചന \
font-എഴുത്ത് \
font-രചന \
texlive-rit-fonts-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
