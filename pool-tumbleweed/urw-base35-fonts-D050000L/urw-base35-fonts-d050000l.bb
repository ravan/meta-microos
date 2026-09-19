SUMMARY = "An alternative font for ITC Zapf Dingbats typeface"
DESCRIPTION = "This serif font family is an alternative for the New Century Schoolbook \
typeface, and is part of Level 2 Core Font Set - PostScript specification \
of 35 base fonts that can be used with any PostScript file."
LICENSE = "AGPL-3.0-only-with-PS-or-PDF-font-exception-20170817"

PV = "20200910"

RPM_NAME = "urw-base35-fonts-D050000L-20200910-2.4.noarch.rpm"
RPM_HASH = "959708d413b7799af524b3efa246ad773059c218c61cdf478c223ef60b1bc01b2e15d54096d81dc0a3873b9b12607c4be59920d2123b72512fdce6a56431cee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-urw-base35-fonts-D050000L \
font--lang=aa \
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
font-d050000l \
urw-base35-fonts-D050000L"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
