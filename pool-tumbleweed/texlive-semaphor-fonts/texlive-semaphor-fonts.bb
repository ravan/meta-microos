SUMMARY = "Severed fonts for texlive-semaphor"
DESCRIPTION = "The  separated fonts package for texlive-semaphor"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn18651"

RPM_NAME = "texlive-semaphor-fonts-2026.226.svn18651-60.2.noarch.rpm"
RPM_HASH = "acded689d36573accc64703429643fe334afbf63cf935b7d28b2ed5851f943c49c44fc2b5e6dead256bc03d80fde997e55d45ad5c138329f448cf23a8024820f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-semaphor-fonts \
font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
font--lang=bem \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=cs \
font--lang=csb \
font--lang=dsb \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fur \
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
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=li \
font--lang=mg \
font--lang=mjw \
font--lang=ms \
font--lang=ng \
font--lang=nl \
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
font--lang=ts \
font--lang=unm \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-semafor \
texlive-semaphor-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
