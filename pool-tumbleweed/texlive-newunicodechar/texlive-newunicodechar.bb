SUMMARY = "Definitions of the meaning of Unicode characters"
DESCRIPTION = "The package provides a friendly interface for defining the \
meaning of Unicode characters. The document should be processed \
by (pdf)LaTeX with the unicode option of inputenc or inputenx, \
or by XeLaTeX/LuaLaTeX. The command provided is \
\\newunicodechar{<char>}{<code>} where <char> is a \
directly-typed Unicode character, and <code> is its \
replacement."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-newunicodechar-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "ba02a0d9402b6149619fbbc2497af0ea2adb4f333a02631eff60fe2a8a92429803dc3d3ea8bf96b40b2abe5b61cb91e60c84303bb27977aec69482319ffc065a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newunicodechar.sty \
texlive-newunicodechar"

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
