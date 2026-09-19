SUMMARY = "Severed fonts for texlive-dsserif"
DESCRIPTION = "The  separated fonts package for texlive-dsserif"
LICENSE = "OFL-1.1"

PV = "2026.226.1.031svn77682"

RPM_NAME = "texlive-dsserif-fonts-2026.226.1.031svn77682-59.2.noarch.rpm"
RPM_HASH = "043d5aff8ffb943277f1306a2e686fbf421f084840d71c44c8383f7df0d4d407c7e89fcd1647572cd73f18c3594270b95ff332d8c8985a1646685537308d5e86"
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
font-dsserif \
font-dsserifuni \
texlive-dsserif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
