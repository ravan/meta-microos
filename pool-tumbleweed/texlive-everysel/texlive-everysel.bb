SUMMARY = "Provides hooks into \\selectfont"
DESCRIPTION = "The package provided hooks whose arguments are executed just \
after LaTeX has loaded a new font by means of \\selectfont. It \
has become obsolete with LaTeX versions 2021/01/05 or newer, \
since LaTeX now provides its own hooks to fulfill this task. \
For newer versions of LaTeX everysel only provides macros using \
LaTeX's hook management due to compatibility reasons. See \
lthooks-doc.pdf for instructions how to use lthooks instead of \
everysel."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn57489"

RPM_NAME = "texlive-everysel-2026.226.2.1svn57489-59.2.noarch.rpm"
RPM_HASH = "f78e089450894dc629a3112a426a95eba558fcd903d4f067232ad6bcf3d6af1e3780c9539cbbc881fca05fb70e56eaf4c25a67926cd32a7688a1023d53300c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everysel-2011-10-28.sty \
tex-everysel.sty \
texlive-everysel"

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
