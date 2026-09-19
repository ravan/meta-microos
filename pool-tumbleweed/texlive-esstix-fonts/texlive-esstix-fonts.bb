SUMMARY = "Severed fonts for texlive-esstix"
DESCRIPTION = "The  separated fonts package for texlive-esstix"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-esstix-fonts-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "e4da1ed608d395d9226a94efe1f6e0e1e3cc33ffad0580f619655bd4d1c4a82bc8a95b897847d1ed97d3b7983a88c6b74fe94c842656daa8aae08bd3a176424c"
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
font-esstix-eight \
font-esstix-eleven \
font-esstix-fifteen \
font-esstix-five \
font-esstix-four \
font-esstix-fourteen \
font-esstix-nine \
font-esstix-one \
font-esstix-seven \
font-esstix-seventeen \
font-esstix-six \
font-esstix-sixteen \
font-esstix-ten \
font-esstix-thirteen \
font-esstix-three \
font-esstix-twelve \
font-esstix-two \
texlive-esstix-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
