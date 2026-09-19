SUMMARY = "Severed fonts for texlive-fandol"
DESCRIPTION = "The  separated fonts package for texlive-fandol"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn37889"

RPM_NAME = "texlive-fandol-fonts-2026.226.0.0.3svn37889-59.2.noarch.rpm"
RPM_HASH = "e60792760b0bb48ff507eac18a68a67bea41f58ab13387633be9dfd81af81fafe83f76d2e24519fce17abcfee4f8b29e550659e278de7a192d08f34164010c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=agr \
font--lang=bem \
font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=ii \
font--lang=io \
font--lang=kj \
font--lang=kum \
font--lang=kwm \
font--lang=mhr \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=os \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sel \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zh-cn \
font--lang=zh-sg \
font--lang=zu \
font-fandolbraille \
font-fandolbrailledisplay \
font-fandolbrailleregular \
font-fandolfang \
font-fandolfangr \
font-fandolhei \
font-fandolkai \
font-fandolsong \
texlive-fandol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
