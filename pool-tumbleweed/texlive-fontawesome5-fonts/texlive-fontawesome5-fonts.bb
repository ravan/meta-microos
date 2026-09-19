SUMMARY = "Severed fonts for texlive-fontawesome5"
DESCRIPTION = "The  separated fonts package for texlive-fontawesome5"
LICENSE = "OFL-1.1"

PV = "2026.226.5.15.4svn77682"

RPM_NAME = "texlive-fontawesome5-fonts-2026.226.5.15.4svn77682-60.2.noarch.rpm"
RPM_HASH = "0956b3194afadfae9ea9db5e1d53ebf97e7d03ceedeb601b110f39ba32aaf1dce49050d642300775490dd713dce4817c0c084696b5e9c8f9e6a28c6f48153901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fontawesome5-fonts \
font--lang=bem \
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
font-fontawesome5brands \
font-fontawesome5brandsregular \
font-fontawesome5free \
font-fontawesome5freeregular \
font-fontawesome5freesolid \
texlive-fontawesome5-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
