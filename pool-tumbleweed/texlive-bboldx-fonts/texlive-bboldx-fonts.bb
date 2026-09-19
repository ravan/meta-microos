SUMMARY = "Severed fonts for texlive-bboldx"
DESCRIPTION = "The  separated fonts package for texlive-bboldx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.032svn77682"

RPM_NAME = "texlive-bboldx-fonts-2026.226.1.032svn77682-61.2.noarch.rpm"
RPM_HASH = "c2ae3f21486a2f1bd482b722feabb74d1207e92ed220e281bc47acd7e4acdf092d842a152bfa368afbd989d63a5d70da7ad520f8658d42ab8eacda84e746606e"
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
font-bboldx \
texlive-bboldx-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
