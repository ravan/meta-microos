SUMMARY = "Various macros for keeping things local"
DESCRIPTION = "A toolbox of macros designed to allow the LaTeX programmer to \
work around some of the restrictions of the TeX grouping \
mechanisms. The present release offers a preliminary view of \
the package; not all of its facilities are working optimally"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn20422"

RPM_NAME = "texlive-locality-2026.226.0.0.2svn20422-61.2.noarch.rpm"
RPM_HASH = "875ebf6cb4ef4919eb2977254e54f60d07b9b0b6a98718f53877fc20e50f3922cdd1ea9c386025e6cfbd7c5f3bc93c21268320c674acc640d8110bbbebfacca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-locality.sty \
texlive-locality"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
