SUMMARY = "Severed fonts for texlive-hmtrump"
DESCRIPTION = "The  separated fonts package for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-fonts-2026.226.1.2asvn54512-60.4.noarch.rpm"
RPM_HASH = "14424dc293144ca4c9f67c893fe4db4f0c309a1d7e1398b20867924fd4eec6080ad2ce1ef890b9bd35e273ac6b843b265eb339aa62b68e9f149964f44238cb69"
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
font-nkd04playingcard'sindex \
texlive-hmtrump-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
