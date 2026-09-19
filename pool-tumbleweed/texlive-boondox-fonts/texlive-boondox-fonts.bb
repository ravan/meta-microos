SUMMARY = "Severed fonts for texlive-boondox"
DESCRIPTION = "The  separated fonts package for texlive-boondox"
LICENSE = "OFL-1.1"

PV = "2026.226.1.02dsvn77682"

RPM_NAME = "texlive-boondox-fonts-2026.226.1.02dsvn77682-59.2.noarch.rpm"
RPM_HASH = "de706daf211db8e219f4b1fcf78632dbc617040c3b04b17ca2665f91dce46d780829944d23380cd65ccfae65bdd4d8a6612865bffabcf23863dd656a696e7801"
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
font-boondoxcalligraphic \
font-boondoxdoublestruck \
font-boondoxfraktur \
font-boondoxuprscr \
texlive-boondox-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
