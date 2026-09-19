SUMMARY = "Severed fonts for texlive-oinuit"
DESCRIPTION = "The  separated fonts package for texlive-oinuit"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28668"

RPM_NAME = "texlive-oinuit-fonts-2026.226.svn28668-61.2.noarch.rpm"
RPM_HASH = "be8d2d3ee3a6b1e3e1e19f35a0836a78fc39db0d96b69ef19c61e6994b2c0778dbd2ab319e3dd78b2cd0f9ead6a756c9ca5c7095c5bb18aed4aa1a455683b07f"
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
font-computer \
font-inuit \
texlive-oinuit-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
