SUMMARY = "Severed fonts for texlive-ocr-b-outline"
DESCRIPTION = "The  separated fonts package for texlive-ocr-b-outline"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20969"

RPM_NAME = "texlive-ocr-b-outline-fonts-2026.226.svn20969-61.2.noarch.rpm"
RPM_HASH = "b641e1ab723561c0df5b73d382180f877a37ebf8366fdacbeba42ffd29912de8b2f281ee4343fb1afcfe6aab620f62d9210509b8f4f726e78b4fd328e396e7c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-ocr-b-outline-fonts \
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
font-ocrb10 \
font-ocrb5 \
font-ocrb6 \
font-ocrb7 \
font-ocrb8 \
font-ocrb9 \
texlive-ocr-b-outline-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
