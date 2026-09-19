SUMMARY = "Severed fonts for texlive-arphic-ttf"
DESCRIPTION = "The  separated fonts package for texlive-arphic-ttf"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42675"

RPM_NAME = "texlive-arphic-ttf-fonts-2026.226.svn42675-60.2.noarch.rpm"
RPM_HASH = "c7190439f791b4b97002cc58d380c22dce57fc2b9e1a14a61c542710df1035d519a8b1c5bcb662d59ff32472047510d204b8f19df5dc959ac1cb32b5e427e982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=agr \
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
font-arplkaitimbig5 \
font-arplkaitimgb \
font-arplmingti2lbig5 \
font-arplsungtilgb \
font-文鼎ｐｌ中楷 \
font-文鼎ｐｌ简中楷 \
font-文鼎ｐｌ简报宋 \
font-文鼎ｐｌ細上海宋 \
texlive-arphic-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
