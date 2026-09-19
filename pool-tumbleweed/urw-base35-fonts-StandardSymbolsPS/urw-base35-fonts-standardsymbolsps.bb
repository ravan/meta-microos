SUMMARY = "An alternative font for Symbol typeface"
DESCRIPTION = "This serif font family is an alternative for the New Century Schoolbook \
typeface, and is part of Level 2 Core Font Set - PostScript specification \
of 35 base fonts that can be used with any PostScript file."
LICENSE = "AGPL-3.0-only-with-PS-or-PDF-font-exception-20170817"

PV = "20200910"

RPM_NAME = "urw-base35-fonts-StandardSymbolsPS-20200910-2.4.noarch.rpm"
RPM_HASH = "f0f34406f9cf430327a453bb5029534e8fe13cdba98c655c413cbfe575f048ec09107cc34d586eaf18bc4519b152deb8bde7eb349b060f0b138c8db4fbf3d1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-urw-base35-fonts-StandardSymbolsPS \
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
font-standardsymbolsps \
urw-base35-fonts-StandardSymbolsPS"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
