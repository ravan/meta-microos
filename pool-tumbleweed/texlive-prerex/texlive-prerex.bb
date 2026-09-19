SUMMARY = "Interactive editor and macro support for prerequisite charts"
DESCRIPTION = "This package consists of prerex.sty, a LaTeX package for \
producing charts of course nodes linked by arrows representing \
pre- and co-requisites, and prerex, an interactive program for \
creating and editing chart descriptions. The implementation of \
prerex.sty uses PGF, so that it may be used equally happily \
with LaTeX or pdfLaTeX; prerex itself is written in C. The \
package includes source code for a previewer application, a \
lightweight Qt-4 and poppler-based prerex-enabled PDF viewer."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-prerex-2026.226.svn54512-59.2.noarch.rpm"
RPM_HASH = "c314b3daed006182b22c61d7e0b10f5763bce574fbc39f782309554120d8a04057ae6443d65ceb0e44c6a07514fa9c48a964acea540863461ef1ce3d20f6696e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prerex.sty \
texlive-prerex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-hyperref.sty \
tex-pgf.sty \
tex-relsize.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
