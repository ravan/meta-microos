SUMMARY = "Wen Quan Yi Bitmap Song CJK Fonts"
DESCRIPTION = "The Wen Quan Yi bitmap font includes complete CJK Unified \
Ideograph (U4E00 - U9FA5) glyphs at four different sizes \
(9pt-12X12 pixel, 10pt-13X13 pixel, 11pt-15X15 pixel, \
12pt-16x16 pixel) and two weights (medium and bold)."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.9.9_0"

RPM_NAME = "wqy-bitmap-fonts-0.9.9_0-17.7.noarch.rpm"
RPM_HASH = "8890a93b8fd61e6f466bec607dae469b72c7446f6bc01c9dc991e6aea0423afa72a9a9c1812f92e41b1747a70c3a0d6a6694ef0c597176303ed1a99143a2897e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wqy-bitmap-fonts \
font--lang=bem \
font--lang=bg \
font--lang=cmn \
font--lang=fj \
font--lang=hak \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kum \
font--lang=kwm \
font--lang=lzh \
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
font--lang=zh-tw \
font--lang=zu \
font-wenquanyiwenquanyibitmapsong \
wqy-bitmap-fonts \
wqy-bitmapfont"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
perl"

inherit rpm
