SUMMARY = "Severed fonts for texlive-parsimatn"
DESCRIPTION = "The  separated fonts package for texlive-parsimatn"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn70775"

RPM_NAME = "texlive-parsimatn-fonts-2026.226.2.2svn70775-58.2.noarch.rpm"
RPM_HASH = "f31ca4441be11aa35920b8af49090edfaba7a4deff310dae66e5f258f53ff2b9b5f6bfb27d2d41915f2e6bfd55bdcc178df801245e06610755e153b749e52824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=ar \
font--lang=az-ir \
font--lang=bem \
font--lang=fa \
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
font-parsimatn \
texlive-parsimatn-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
