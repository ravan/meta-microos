SUMMARY = "Severed fonts for texlive-hfbright"
DESCRIPTION = "The  separated fonts package for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29349"

RPM_NAME = "texlive-hfbright-fonts-2026.226.svn29349-60.4.noarch.rpm"
RPM_HASH = "4e75c2252cba2ec579a27213e00216abee2c6cf31391bd0912d8058000160364b8c56773e32d1687e734c2821ab7148fb1a7071fc4d333b6f1b5a1d212abd6a0"
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
font-computermodernbright \
texlive-hfbright-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
