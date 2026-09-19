SUMMARY = "BibTeX style for the Journal of Neuroscience"
DESCRIPTION = "This is a slightly modified version of the namedplus style, \
which fully conforms with the Journal of Neuroscience citation \
style. It should be characterised as an author-date citation \
style; a BibTeX style and a LaTeX package are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn76790"

RPM_NAME = "texlive-jneurosci-2026.226.1.00svn76790-63.2.noarch.rpm"
RPM_HASH = "26ff353fe4176643502a6349623ef1ac0f84047f18f54ad5a4295a69ad2e7f48e9bafb1621cd56fb46c671361cf68daee96f2354539431883998562a0143453f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jneurosci.sty \
texlive-jneurosci"

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
