SUMMARY = "Parenthetic math expressions made simpler and less redundant"
DESCRIPTION = "This package provides a more condensed and flexible syntax for \
parenthesis-delimited expressions in math mode which also \
allows for an easier switching of brace sizes. For example, the \
syntax ' `\\big( a + b ) ' can be used to replace '\\bigl( a + b \
\\bigr)'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41859"

RPM_NAME = "texlive-phfparen-2026.226.1.0svn41859-58.2.noarch.rpm"
RPM_HASH = "51c56b30112c04823a189796ea721d41f79ef46871ed50869ed4a4640271ef08e6223cbfa63bce1c0aa35aa6f723b711a0bb368b414f65248936e291ee40d844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfparen.sty \
texlive-phfparen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-mathtools.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
