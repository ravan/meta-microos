SUMMARY = "Severed fonts for texlive-kpfonts"
DESCRIPTION = "The  separated fonts package for texlive-kpfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.36svn77682"

RPM_NAME = "texlive-kpfonts-fonts-2026.226.3.36svn77682-63.2.noarch.rpm"
RPM_HASH = "03b21ec751c85ec38a4cff7cf177b8ea52be9c1fac5d48e9f6e72afa4a4638974da7810082c3eae2badf0f4f5ad29e5d1c8c26ee743fc90e6c19ae32e43dfc3b"
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
font-kp \
font-kp--m \
font-kp--m-ex \
font-kp--m-exa \
font-kp--m-sy \
font-kp--m-sya \
font-kp--m-syb \
font-kp--m-syc \
font-kp--m-syd \
font-kp-companion \
font-kp-expert \
font-kp-largesmallcaps \
font-kp-light \
font-kp-light-companion \
font-kp-light-expert \
font-kp-light-largesmallcaps \
font-kp-light-m \
font-kp-light-m-ex \
font-kp-light-m-exa \
font-kp-light-m-sy \
font-kp-light-m-syb \
font-kp-light-m-syc \
font-kp-light-m-syd \
font-kp-light-sc-expert \
font-kp-light-smallcaps \
font-kp-sc-expert \
font-kp-smallcaps \
font-sf-kp \
font-sf-kp-comp \
font-sf-kp-companion \
font-sf-kp-exp \
font-sf-kp-largesmallcaps \
font-sf-kp-sc \
font-sf-kp-sc-exp \
font-tt-kp \
font-tt-kp-comp \
font-tt-kp-exp \
texlive-kpfonts-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
