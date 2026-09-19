SUMMARY = "Severed fonts for texlive-cyrillic-modern"
DESCRIPTION = "The  separated fonts package for texlive-cyrillic-modern"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.4svn71183"

RPM_NAME = "texlive-cyrillic-modern-fonts-2026.226.0.0.4svn71183-61.2.noarch.rpm"
RPM_HASH = "7b299a1ed8db00386c465e3293d239468b025861b1464381bb606ce426f24fc354b33e7951a16b5482becf586b7a4ff5739b86ea42db0a0a31e86953c60626ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-cyrillic-modern-fonts \
font--lang=av \
font--lang=bem \
font--lang=bg \
font--lang=ce \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kum \
font--lang=kwm \
font--lang=lez \
font--lang=mhr \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=os \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sel \
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
font-cyrillicmodern \
font-cyrillicmodernbold \
font-cyrillicmodernboldslanted \
font-cyrillicmodernmath \
font-cyrillicmodernsansserif \
font-cyrillicmodernsansserifdmcd \
font-cyrillicmodernslanted \
font-cyrillicmodernsmallcaps \
texlive-cyrillic-modern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
