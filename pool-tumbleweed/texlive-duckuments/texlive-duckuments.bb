SUMMARY = "Create duckified dummy content"
DESCRIPTION = "The package provides facilities to create duckified dummy \
contents. It was inspired by the question 'Getting ducks in \
example images' on TeX-LaTeX Stack Exchange. The following \
macros are available: \\duckument[key=val] - print a short \
duckument \\blindduck[key=val] - print a paragraph \
\\ducklist(*){environment} - create a list of type environment \
\\ducklistlist(*){environment} - create nested lists \
\\duckitemize - ducklist{itemize} \\duckenumerate - \
ducklist{enumerate} \\duckdescription - ducklist{description} \
\\duckumentsCreateExampleFile \\duckumentsDrawRandomDucks The \
package works with pdfTeX, LuaTeX, and XeTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-duckuments-2026.226.0.0.5svn77682-59.2.noarch.rpm"
RPM_HASH = "db7e4a3b82b3db774e59b685b25c2bccafbe092b951a823f84d3aab59dcdcbfddc5fd5390a43b44d534ce705d8a36f0be7898c32b949118571576687b9dbaa37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duckuments.sty \
texlive-duckuments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-letltxmacro.sty \
tex-tikzducks.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
