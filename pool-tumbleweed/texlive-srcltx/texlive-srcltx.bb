SUMMARY = "Jump between DVI and TeX files"
DESCRIPTION = "Provides a \\special insertion into generated .dvi files \
allowing one to jump from the .dvi file to the .tex source and \
back again (given a .dvi viewer that supports this, such as Yap \
or xdvi version 22.38 or later). This was originally written by \
Aleksander Simonic, the author of the WinEdt shell."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.6svn15878"

RPM_NAME = "texlive-srcltx-2026.226.1.6svn15878-64.2.noarch.rpm"
RPM_HASH = "86228120c0fcf7bc44f2e550068a209987bb50cd0ed7ff585d0292c434f2ab9a89745e86d9dcb2c316162e9f88b30d15cc66492d8bcdaf9434b699883cfe783c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-srcltx.sty \
tex-srctex.sty \
texlive-srcltx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
