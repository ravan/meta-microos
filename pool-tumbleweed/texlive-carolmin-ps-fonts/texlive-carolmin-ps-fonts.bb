SUMMARY = "Severed fonts for texlive-carolmin-ps"
DESCRIPTION = "The  separated fonts package for texlive-carolmin-ps"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-carolmin-ps-fonts-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "f09fbe92b214dfb904ee94b9b10bceebe4efea7ffa26aff10db7824d802b6ddbffba43ed2f42ad996707259148958131b9ff1166cc7141529c96a8cb411a7b94"
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
font-carolinganminuscules \
texlive-carolmin-ps-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
