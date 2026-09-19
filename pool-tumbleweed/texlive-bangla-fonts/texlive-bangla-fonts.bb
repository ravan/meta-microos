SUMMARY = "Severed fonts for texlive-bangla"
DESCRIPTION = "The  separated fonts package for texlive-bangla"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76924"

RPM_NAME = "texlive-bangla-fonts-2026.226.2.1svn76924-60.2.noarch.rpm"
RPM_HASH = "45b12f01c9d115d2accee3fee5eea9cfaa3330d5c95976d9d5bb54066fdaf4a61802c7b83d0de9aeb8c01095fe2445826ecea595e95df0afcc27efc6eb8974ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=as \
font--lang=bem \
font--lang=bn \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=mni \
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
font-kalpurush \
font-shimanto \
texlive-bangla-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
