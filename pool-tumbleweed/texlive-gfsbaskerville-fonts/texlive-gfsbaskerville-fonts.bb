SUMMARY = "Severed fonts for texlive-gfsbaskerville"
DESCRIPTION = "The  separated fonts package for texlive-gfsbaskerville"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfsbaskerville-fonts-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "747550113b32e2274f581c551ffb0cda3f25f7cf3d8a9417c23373fdc47f54c243e4c76e175b3a1c9c5b11817acc21ec6641bb80186e8e37f85568c942ed0465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfsbaskerville-fonts \
font--lang=el \
font-gfsbaskerville \
texlive-gfsbaskerville-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
