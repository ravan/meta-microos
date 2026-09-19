SUMMARY = "Calculates and displays arithmetic operations"
DESCRIPTION = "Xlop (eXtra Large OPeration) will typeset arithmetic problems \
either in-line or 'as in school' (using French school \
conventions). So for example, \\opadd{2}{3} can give either \
$2+3=5$ or something similar to: \\begin{tabular}{r} 2\\\\ +3\\\\ \
\\hline 5\\end{tabular}. Furthermore, numbers may be very large, \
e.g 200 figures (with a very long compilation time). Many other \
features allow to deal with numbers (tests, display, some high \
level operations, etc.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.28svn77682"

RPM_NAME = "texlive-xlop-2026.226.0.0.28svn77682-59.4.noarch.rpm"
RPM_HASH = "9e21369317091bd6f0a378452d3e88eaefb94fc15c930f3749828ed5db2a0844ba7f80d440ea78978dcb14173b010fb7528b68f5eb9041e087ffae8d1edd7f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xlop.sty \
tex-xlop.tex \
texlive-xlop"

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
