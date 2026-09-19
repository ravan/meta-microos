SUMMARY = "Write numbers in lower case roman numerals"
DESCRIPTION = "This package provides only two macros viz. \\modromannumeral \
which writes the number given as argument in lower case roman \
numeral with a 'j' instead of a 'i' as the final letter of \
numbers greater than 1 and \\modroman{MyCounter} which writes \
the value of a counter in the same way. You use the first in \
the same way as the TeX primitive \\romannumeral and the second \
as LaTeX command \\roman. The default option is 'vpourv' with \
which 5 is 'translated' as 'v' and option 'upourv' with which \
the same 5 is given as 'u'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn76924"

RPM_NAME = "texlive-modroman-2026.226.1svn76924-61.2.noarch.rpm"
RPM_HASH = "8e82a3a5e772180dc2dc694915e279968130bb29747bacec1bf9f9491056fdb9ecf52706a52b9524b99a8f83474d37d1d5f953b936c09aee3abe9bd892692ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modroman.sty \
texlive-modroman"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
