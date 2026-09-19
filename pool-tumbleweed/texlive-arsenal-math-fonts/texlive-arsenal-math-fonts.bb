SUMMARY = "Severed fonts for texlive-arsenal-math"
DESCRIPTION = "The  separated fonts package for texlive-arsenal-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.9.3svn77682"

RPM_NAME = "texlive-arsenal-math-fonts-2026.226.0.0.9.3svn77682-60.2.noarch.rpm"
RPM_HASH = "1b570f39404c55df285138dec982a25e53e3b79937335e29e41f292d44cdf25b119d9be10d14bb66edcebaa79b5589763ce849d8ec1603d82c583d51796ada44"
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
font-arsenalmath \
texlive-arsenal-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
