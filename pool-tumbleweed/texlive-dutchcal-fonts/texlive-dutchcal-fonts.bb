SUMMARY = "Severed fonts for texlive-dutchcal"
DESCRIPTION = "The  separated fonts package for texlive-dutchcal"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-dutchcal-fonts-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "f5371cf791dcd3813af468d036adcac7d2c5704b9a3d84c0ac2adf6b4a161ac6e9fc413d7c54d3563c5852e138713b4dfed375aabd5ce6ddf028e7826549ff5a"
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
font-dutchcalligraphic \
texlive-dutchcal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
