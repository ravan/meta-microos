SUMMARY = "Severed fonts for texlive-baekmuk"
DESCRIPTION = "The  separated fonts package for texlive-baekmuk"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-fonts-2026.226.2.2.1svn56915-60.2.noarch.rpm"
RPM_HASH = "a6649a23157c6388c109c1adf5522112858af51d1258d34de2f6f56f96523472525c4a329712499b0e4c746c40f93483431e495b6aa497176133198563000b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=ko \
font--lang=kum \
font--lang=kwm \
font--lang=lg \
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
font--lang=zu \
font-baekmukbatang \
font-baekmukdotum \
font-baekmukgulim \
font-baekmukheadline \
font-백묵굴림 \
font-백묵돋움 \
font-백묵바탕 \
font-백묵헤드라인 \
texlive-baekmuk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
