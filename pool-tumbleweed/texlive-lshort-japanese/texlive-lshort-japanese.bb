SUMMARY = "Japanese version of A Short Introduction to LaTeX2e"
DESCRIPTION = "The lshort-japanese package"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn36207"

RPM_NAME = "texlive-lshort-japanese-2026.226.svn36207-61.2.noarch.rpm"
RPM_HASH = "cfd04f4f19d35ed11ce4d3b4a256d52e1419629fc5e9662ceba89bb23b941ee17af51146b22f1e74299598f3fd9b80873f09610ffc96f13b135db9b9f2ac0443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-japanese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
