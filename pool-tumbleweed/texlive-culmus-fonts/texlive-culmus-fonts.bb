SUMMARY = "Severed fonts for texlive-culmus"
DESCRIPTION = "The  separated fonts package for texlive-culmus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-culmus-fonts-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "1aef3e86a52542f87655733e85f069c8b24fc8b973557d524981f594aac7fe05c5d4bb3ed21e54562e4e5a542c037b57ad3faec64333ce243ae7d016855b3010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-culmus-fonts \
font--lang=bem \
font--lang=fj \
font--lang=he \
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
font--lang=yi \
font--lang=za \
font--lang=zu \
font-aharoniclm \
font-caladingsclm \
font-davidclm \
font-drugulinclm \
font-elliniaclm \
font-frankruehlclm \
font-hadasimclm \
font-keteryg \
font-ktavyadclm \
font-miriamclm \
font-miriammonoclm \
font-nachlieliclm \
font-shofar \
font-simpleclm \
font-stamashkenazclm \
font-stamsefaradclm \
font-yehudaclm \
font-מרים \
texlive-culmus-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
