SUMMARY = "Severed fonts for texlive-arphic"
DESCRIPTION = "The  separated fonts package for texlive-arphic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-arphic-fonts-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "10797b171245b3b19c9020bc9755a46efbfa0c6a4663f9ea1ffeca54e1f8a80d08137b965fe5db6c0d16cde9df6d392aa98702576c28d5aff6b1c0c273714e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=agr \
font--lang=bem \
font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
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
font--lang=zu \
font-arplkaitimbig5 \
font-arplkaitimgb \
font-arplmingti2lbig5 \
font-arplsungtilgb \
texlive-arphic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
