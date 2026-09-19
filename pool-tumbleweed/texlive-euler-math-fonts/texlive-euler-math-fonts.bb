SUMMARY = "Severed fonts for texlive-euler-math"
DESCRIPTION = "The  separated fonts package for texlive-euler-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.75svn77952"

RPM_NAME = "texlive-euler-math-fonts-2026.226.0.0.75svn77952-59.2.noarch.rpm"
RPM_HASH = "81c3e09053771bf74fff70d55a2dc09a0c81eb09ef7c7d20e342e2496e7523eabf4ab63fca9de9174a79fad2d18e81610347830b1faf9232e065fe06f3328745"
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
font-eulermath \
texlive-euler-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
