SUMMARY = "Severed fonts for texlive-burmese"
DESCRIPTION = "The  separated fonts package for texlive-burmese"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25185"

RPM_NAME = "texlive-burmese-fonts-2026.226.svn25185-59.2.noarch.rpm"
RPM_HASH = "7df89411179e7b7212be164290eba1cd7141f65a37bb157fa2c9fece9f455e2402d582c61d69367f2f85fe5c46e8a7274b91f37aa6e91f3b4721bc60220094d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=id \
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
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-burma \
texlive-burmese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
