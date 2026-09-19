SUMMARY = "Severed fonts for texlive-talos"
DESCRIPTION = "The  separated fonts package for texlive-talos"
LICENSE = "LPPL-1.3c"

PV = "2026.227.1.0svn61820"

RPM_NAME = "texlive-talos-fonts-2026.227.1.0svn61820-62.2.noarch.rpm"
RPM_HASH = "3430c738aeffed266770b665eabd17eef758ecfd12069e3fcb12588d27d484fbe92dae0490ec1af6739af14e749bc71edc1547f02f39a90b64bcd32d93f28c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=el \
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
font-talos \
texlive-talos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
