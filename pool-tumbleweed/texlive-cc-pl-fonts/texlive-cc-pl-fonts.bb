SUMMARY = "Severed fonts for texlive-cc-pl"
DESCRIPTION = "The  separated fonts package for texlive-cc-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-fonts-2026.226.1.02.3svn58602-59.2.noarch.rpm"
RPM_HASH = "e171a617e4cc8dc6b8757074d1def379c47b181349b622d0d74f9ef370355005cf164345a9cd64af232f1a51aa730d387f1aa03e516d43e4cb14986abe4e3e9f"
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
font--lang=pl \
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
font-tex\040pccsc10 \
font-tex\040pcmi10 \
font-tex\040pcr10 \
font-tex\040pcr5 \
font-tex\040pcr6 \
font-tex\040pcr7 \
font-tex\040pcr8 \
font-tex\040pcr9 \
font-tex\040pcsl10 \
font-tex\040pcslc9 \
font-tex\040pcti10 \
texlive-cc-pl-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
