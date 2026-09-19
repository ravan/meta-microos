SUMMARY = "Draw a 'question wheel' (roue de questions)"
DESCRIPTION = "This package helps to produce a game for students: It is a \
wheel displaying questions, with hidden answers inside."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3svn67670"

RPM_NAME = "texlive-rouequestions-2026.226.0.0.0.3svn67670-60.2.noarch.rpm"
RPM_HASH = "bdbf82fe1cbc2f0b274f223ade19fc2759dc68cf6d7053e22484c15e184f5446e27a6c529eda122bec611fcbf85d70b023f03dc7317ee2ff6b38a3f1b206d426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-RoueQuestions.sty \
texlive-rouequestions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-tkz-euclide.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
