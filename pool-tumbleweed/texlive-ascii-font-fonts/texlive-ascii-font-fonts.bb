SUMMARY = "Severed fonts for texlive-ascii-font"
DESCRIPTION = "The  separated fonts package for texlive-ascii-font"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-ascii-font-fonts-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "5253672f66f7dbd50ac4159463654b0d99ff2be0bb7adaf9cf36b4187efe1b42900b227e8e2123c0a2a4ccb12104663df90de830668700645dc0463ba2dac2dc"
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
font-ascii \
texlive-ascii-font-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
