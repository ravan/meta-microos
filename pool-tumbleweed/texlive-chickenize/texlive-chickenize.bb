SUMMARY = "Use lua callbacks for 'interesting' textual effects"
DESCRIPTION = "The package allows manipulations of any LuaTeX document (it is \
known to work with Plain LuaTeX and LuaLaTeX). Most of the \
package's functions are merely for fun or educational use, but \
some functions (for example, colorstretch for visualising the \
badness and font expansion of each line, and letterspaceadjust \
doing what its name says) could be useful in a 'normal' LuaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn57325"

RPM_NAME = "texlive-chickenize-2026.226.0.0.3svn57325-60.2.noarch.rpm"
RPM_HASH = "475ae61a44b9ab464890a9eb7b87528acada5abf3fa6a7e88c4f46eefab21ee301acf9b23458fec7d671ba645e854baf444197bb6866279d6fe60597a53b4836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chickenize.sty \
tex-chickenize.tex \
texlive-chickenize"

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
