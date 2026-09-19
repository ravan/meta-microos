SUMMARY = "Reference last page for Page N of M type footers"
DESCRIPTION = "Reference the number of pages in your LaTeX document through \
the introduction of a new label which can be referenced like \
\\pageref{LastPage} to give a reference to the last page of a \
document. It is particularly useful in the page footer that \
says: Page N of M."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1hsvn77682"

RPM_NAME = "texlive-lastpage-2026.226.2.1hsvn77682-63.2.noarch.rpm"
RPM_HASH = "eda512673ac6de5cd4e3b969f50645d703e00fd6db90107939976bca58293484467297982ddde5373039817c331daec7288a61ea4b4faf34e31ae979487ad304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lastpage.sty \
tex-lastpage209.sty \
tex-lastpage2e.sty \
tex-lastpageclassic.sty \
tex-lastpagemodern.sty \
texlive-lastpage"

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
