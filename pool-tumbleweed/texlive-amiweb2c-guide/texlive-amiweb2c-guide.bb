SUMMARY = "How to install AmiWeb2c"
DESCRIPTION = "This is a guide for the installation of (La)TeX with the Amiga \
port of Web2C named AmiWeb2C in the version 2.1 on an emulated \
Amiga 4000 computer running Workbench 3.1. Furthermore the \
installation of an ARexx server for calling LaTeX from an \
editor is described and some tips for the installation of new \
fonts are given."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56878"

RPM_NAME = "texlive-amiweb2c-guide-2026.226.1.0svn56878-61.2.noarch.rpm"
RPM_HASH = "5021f4038d25f65d26d44a6ea0a3d42d812650b5284a7fd9a02182968b9c51329e758815f490b87cb11d72b494eef0209d02f50ca6fbcd36cc78bf1c8055f2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amiweb2c-guide"

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
