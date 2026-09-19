SUMMARY = "Severed fonts for texlive-ocherokee"
DESCRIPTION = "The  separated fonts package for texlive-ocherokee"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25689"

RPM_NAME = "texlive-ocherokee-fonts-2026.226.svn25689-61.2.noarch.rpm"
RPM_HASH = "c8049908e7580dcde61fd93774182d04a777fb2776a1d3aa6ced2f661215a001e42cf99679088d83e1ae1edaaee55a63a22da5b65654b605556bd0ee3dbdae44"
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
font-cherokee \
texlive-ocherokee-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
