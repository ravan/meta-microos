SUMMARY = "Pynotebook presents (raw, Markdown or Python) codes (and execution with LuaLaTeX) as in a Jupyter Notebook"
DESCRIPTION = "This package provides environments to (re)create a jupyter \
notebook with: raw blocks markdown blocks (with full LaTeX \
support) code blocks (python) with execution thanks to piton \
and PyLuaTeX"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn75593"

RPM_NAME = "texlive-pynotebook-2026.226.0.0.1.4svn75593-60.4.noarch.rpm"
RPM_HASH = "dcff6cbbb547f0dfeadf46eea83498f716468b39c1c254a1d2613f96975b66809d0c5431d016585c1bb40310a4501df5eabf967b8005e3b18f687fbd7ab2dec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pynotebook.sty \
texlive-pynotebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-iftex.sty \
tex-piton.sty \
tex-tcolorbox.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
