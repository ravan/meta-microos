SUMMARY = "Severed fonts for texlive-dozenal"
DESCRIPTION = "The  separated fonts package for texlive-dozenal"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn75722"

RPM_NAME = "texlive-dozenal-fonts-2026.226.7.2svn75722-59.2.noarch.rpm"
RPM_HASH = "d4b12c33965b862feb678679096f7d2d4e6b73aebbb30ccc99d1943809fe9a685b6025895409400c52ce5f5423d00b16748c1c3c4568352fadb7882943a5caac"
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
font-dozchars10 \
font-dozchars12 \
font-dozchars17 \
font-dozchars6 \
font-dozchars7 \
font-dozchars8 \
font-dozchars9 \
font-dozchb10 \
font-dozchbx10 \
font-dozchbx12 \
font-dozchbx5 \
font-dozchbx6 \
font-dozchbx7 \
font-dozchbx8 \
font-dozchbx9 \
font-dozchbxi10 \
font-dozchbxsl10 \
font-dozchit10 \
font-dozchit12 \
font-dozchit7 \
font-dozchit8 \
font-dozchit9 \
font-dozchsl10 \
font-dozchsl12 \
font-dozchsl8 \
font-dozchsl9 \
texlive-dozenal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
