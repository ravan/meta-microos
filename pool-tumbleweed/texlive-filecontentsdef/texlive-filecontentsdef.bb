SUMMARY = "Filecontents + macro + verbatim"
DESCRIPTION = "The package provides two environments called filecontentsdef \
and filecontentshere. They are derived from the LaTeX \
filecontents environment as provided by Scott Pakin's \
filecontents package. In addition to the file creation they \
either store the (verbatim) contents in a macro \
(filecontentsdef) or typeset them (verbatim) on the spot \
(filecontentshere). The author developed the package to display \
TeX code verbatim in documentation and the same time produce \
the corresponding files during the LaTeX run in order to embed \
them in the PDF as file attachment annotations (by using Scott \
Pakin's package attachfile)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-filecontentsdef-2026.226.1.5svn77682-59.2.noarch.rpm"
RPM_HASH = "e0e92a030efd75fa140aeba78d3b89c0994b655c6f53122c96777efebde08b67ebcd44bfdd25800d9f5ba60550f9095ede710be47c998542613ff8f1f2e335cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filecontentsdef.sty \
texlive-filecontentsdef"

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
