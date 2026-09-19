SUMMARY = "Annotate compliance with cybersecurity requirements"
DESCRIPTION = "This LaTeX package helps you write documents indicating your \
compliance with cybersecurity requirements. It also helps you \
format your document in a form suitable inside the U.S. \
Department of Defense, by attaching distribution statements, \
destruction notices, organization logos, and security labels to \
it."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn46776"

RPM_NAME = "texlive-cyber-2026.226.2.2svn46776-61.2.noarch.rpm"
RPM_HASH = "ffc8f5efb1959029dda734e7adf74889ef9fd14dc22099f2eb5681fa80d0b09a521add160dbf645894e7e56d375542e9184b5c7f67fc348121b6a45464d94df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cyber.sty \
texlive-cyber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-index.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
