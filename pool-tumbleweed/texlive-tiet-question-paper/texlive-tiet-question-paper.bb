SUMMARY = "A LaTeX question paper class for the TIET"
DESCRIPTION = "This package provides a LaTeX document class \
tiet-question-paper.cls in order to create question papers for \
the Thapar Institute of Engineering and Technologie (TIET). \
Although created for the TIET, the module is easily adaptable \
to any organisation."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn71601"

RPM_NAME = "texlive-tiet-question-paper-2026.227.svn71601-62.2.noarch.rpm"
RPM_HASH = "794f5da68223123315c79837ad32d9d8adb5df963d031b1272bb5f6930d7893895528e507430403431afc0c1a6a918804eb223df78ae2215823e2d358c33565f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tiet-question-paper.cls \
texlive-tiet-question-paper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amsmath.sty \
tex-anyfontsize.sty \
tex-article.cls \
tex-blindtext.sty \
tex-enumitem.sty \
tex-graphicx.sty \
tex-ifmtarg.sty \
tex-linegoal.sty \
tex-parskip.sty \
tex-sectsty.sty \
tex-tabularx.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
