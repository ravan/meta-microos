SUMMARY = "Severed fonts for texlive-cmathbb"
DESCRIPTION = "The  separated fonts package for texlive-cmathbb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56414"

RPM_NAME = "texlive-cmathbb-fonts-2026.226.1.0svn56414-60.2.noarch.rpm"
RPM_HASH = "4f548060a6b53abd066c6c9d4815594ed97aae1d01bf98d83dbad31d833a104deca14580bdae59ed02ba527a6c58416892f8e482a1b7e7fcb254ab25c402b11a"
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
font-cmathbb \
texlive-cmathbb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
