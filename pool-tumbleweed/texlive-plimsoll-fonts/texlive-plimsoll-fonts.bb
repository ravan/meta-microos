SUMMARY = "Severed fonts for texlive-plimsoll"
DESCRIPTION = "The  separated fonts package for texlive-plimsoll"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn56605"

RPM_NAME = "texlive-plimsoll-fonts-2026.226.1svn56605-59.2.noarch.rpm"
RPM_HASH = "172876416402d8f1d299ee56f14280f82c955aaef1b335d87df8b31662ffe37ba0d18fe9187e00ba0b552d0678fc725d3df540052adef07e6a48cfa59b9776b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-plimsoll \
texlive-plimsoll-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
