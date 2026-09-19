SUMMARY = "Contemporary Persian font for scientific and formal writings"
DESCRIPTION = "This Persian font is suitable for official and scientific \
writings. All Persian and Arabic letters and numbers are \
designed by the author. During the design process, attention \
has been paid to the fact that, in addition to being new and \
innovative, the letters be familiar to the average \
Persian/Arabic viewer."
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn70775"

RPM_NAME = "texlive-parsimatn-2026.226.2.2svn70775-58.2.noarch.rpm"
RPM_HASH = "7b79a40b3afd5a43bacfaedd5f875d9b4a838d63ef40b9a810a3ade5f3d8b827f6183c30580918e2b95092832a8c3e3f9c6be8fa2bee3bcf74f74b689d28548c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parsimatn"

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
texlive-parsimatn-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
