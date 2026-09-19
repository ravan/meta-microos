SUMMARY = "Severed fonts for texlive-bbold-type1"
DESCRIPTION = "The  separated fonts package for texlive-bbold-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn33143"

RPM_NAME = "texlive-bbold-type1-fonts-2026.226.svn33143-61.2.noarch.rpm"
RPM_HASH = "948a2628972fa96cbcd3b028124ac4602be7cbafa17b7b8259b83ecc031d6936c778e1b225545fc876384bc2f02c2e73ef06e912d3dcdcc3a6874a08c1a7fed4"
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
font-bbold \
texlive-bbold-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
