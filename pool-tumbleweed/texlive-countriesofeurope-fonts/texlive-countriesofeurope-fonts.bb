SUMMARY = "Severed fonts for texlive-countriesofeurope"
DESCRIPTION = "The  separated fonts package for texlive-countriesofeurope"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.23svn77682"

RPM_NAME = "texlive-countriesofeurope-fonts-2026.226.0.0.23svn77682-61.2.noarch.rpm"
RPM_HASH = "c8825be93925530f944772d104cc39f778e089630dedf2f7c0425818a67b09b104192cc9c7b6d258823fe3fc31423b3adb30486f7810e15c7ed92735a87a6b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-countriesofeurope-fonts \
font--lang=bem \
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
font-countriesofeurope \
texlive-countriesofeurope-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
