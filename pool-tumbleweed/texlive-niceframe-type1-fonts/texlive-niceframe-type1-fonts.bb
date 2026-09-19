SUMMARY = "Severed fonts for texlive-niceframe-type1"
DESCRIPTION = "The  separated fonts package for texlive-niceframe-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71849"

RPM_NAME = "texlive-niceframe-type1-fonts-2026.226.svn71849-61.2.noarch.rpm"
RPM_HASH = "66716a0e239c616df80b059c5998c2630ef3b7195380c5b2cc5e5f9b12431f7195bcfb833aa514f75a28236ed133b9fb2cad45c13e4a8d3e7996dd7c62d3cdf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
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
font-bbding \
font-dingbat \
font-karta \
font-umranda \
font-umrandb \
texlive-niceframe-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
