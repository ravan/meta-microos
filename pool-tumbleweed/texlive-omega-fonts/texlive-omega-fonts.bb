SUMMARY = "Severed fonts for texlive-omega"
DESCRIPTION = "The  separated fonts package for texlive-omega"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn33046"

RPM_NAME = "texlive-omega-fonts-2026.226.svn33046-61.2.noarch.rpm"
RPM_HASH = "24aa155aac4bccb10265099b8cef29e947bf1805b69cba80a2b136d5301715ba4b640e44ea9934a69be7a93c7d31dd26e474edd4f6ed0ab7ce9a401aa9af1117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=lg \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-omegadingbats \
font-omegasanstifinagh \
font-omegaserifarabicone \
font-omegaserifarabicthree \
font-omegaserifarabictwo \
font-omegaserifarmenian \
font-omegaserifcommon \
font-omegaserifcyrillic \
font-omegaserifcyrillicextended \
font-omegaserifgreek \
font-omegaserifhebrew \
font-omegaserifipa \
font-omegaseriflatin \
font-omegaseriftifinagh \
texlive-omega-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
