SUMMARY = "Severed fonts for texlive-arev"
DESCRIPTION = "The  separated fonts package for texlive-arev"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-arev-fonts-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "c9d7671213144ab3c5db3ac4e858538ecc669860a4a43ad498b0c3ef2e7cc4a69960d0c9c2e7eb30e16cb0344d300521e5178b5828cc07d75484382a70cb7f22"
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
font--lang=el \
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
font--lang=lg \
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
font--lang=qu \
font--lang=quz \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=shs \
font--lang=sm \
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
font--lang=to \
font--lang=tpi \
font--lang=ts \
font--lang=unm \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=wae \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-arevsans \
texlive-arev-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
