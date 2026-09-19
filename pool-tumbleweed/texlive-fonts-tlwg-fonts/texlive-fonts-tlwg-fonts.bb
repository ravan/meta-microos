SUMMARY = "Severed fonts for texlive-fonts-tlwg"
DESCRIPTION = "The  separated fonts package for texlive-fonts-tlwg"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7.3svn60817"

RPM_NAME = "texlive-fonts-tlwg-fonts-2026.226.0.0.7.3svn60817-60.2.noarch.rpm"
RPM_HASH = "4f3afe4233848f40f29245d587a09cb4011b1f79f6c33001fad2e6a296485f542d48fc5647144a09bf7d3e43ae2b5b285ccbf8e11e870481fb63a7cd4439371f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fonts-tlwg-fonts \
font--lang=aa \
font--lang=agr \
font--lang=an \
font--lang=ay \
font--lang=ayc \
font--lang=bem \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=bs \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=eo \
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
font--lang=gn \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ig \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=lij \
font--lang=mfe \
font--lang=mg \
font--lang=miq \
font--lang=mjw \
font--lang=ms \
font--lang=na \
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
font--lang=sl \
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
font--lang=th \
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
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-garuda \
font-kinnari \
font-laksaman \
font-loma \
font-norasi \
font-purisa \
font-sawasdee \
font-tlwgmono \
font-tlwgtypewriter \
font-tlwgtypist \
font-tlwgtypo \
font-umpush \
font-waree \
texlive-fonts-tlwg-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
