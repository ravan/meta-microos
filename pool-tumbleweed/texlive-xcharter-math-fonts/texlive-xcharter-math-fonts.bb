SUMMARY = "Severed fonts for texlive-xcharter-math"
DESCRIPTION = "The  separated fonts package for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78170"

RPM_NAME = "texlive-xcharter-math-fonts-2026.226.0.0.73svn78170-59.4.noarch.rpm"
RPM_HASH = "14a0130369a6ff54faab4f4c44d9ffedbec29e0f97391cdb03e60280baa21da110fc5fcb44db78f5505b97682c31d87d3e40b5fb8024ce13e9363b1378000892"
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
font-xchartermath \
texlive-xcharter-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
