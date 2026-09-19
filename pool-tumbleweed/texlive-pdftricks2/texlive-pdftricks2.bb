SUMMARY = "Use PSTricks in pdfTeX"
DESCRIPTION = "The package provides the means of processing documents (that \
contain pstricks graphics specifications. The package is \
inspired by pdftricks"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.01svn31016"

RPM_NAME = "texlive-pdftricks2-2026.226.1.01svn31016-58.2.noarch.rpm"
RPM_HASH = "5b727f36c1096354ce99f42d0778bacbd4cf7d0b46eb96e0efbcd600a1c04cabf963b91385a664ec0d94b2f84de6d59dbc8cc3d357c7ae731a79e91c663b8074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdftricks2.sty \
texlive-pdftricks2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-moreverb.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
