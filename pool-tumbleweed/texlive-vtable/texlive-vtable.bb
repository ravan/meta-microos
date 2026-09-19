SUMMARY = "Vertical alignement of table cells"
DESCRIPTION = "The package allows vertical alignement of table cell by \
providing: Z, L, C, R, J and I column types \\nextRow and \\lb \
commands \\setMultiColRow, \\setMultiColumn, \\setMultiRow and \
\\tableFormatedCell commands for tabular and similar \
environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51126"

RPM_NAME = "texlive-vtable-2026.226.1.0svn51126-60.2.noarch.rpm"
RPM_HASH = "781191aa81ba1ecf8062e4f660e11c192d0ce9204330374527b5bb66ec9ae6f8b144bfebe7c23dff26dba4ad047b9c4927ea8db8736a3879423cf20a040cebbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vtable.sty \
texlive-vtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-array.sty \
tex-calc.sty \
tex-dashrule.sty \
tex-etoolbox.sty \
tex-forloop.sty \
tex-graphicx.sty \
tex-varwidth.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
