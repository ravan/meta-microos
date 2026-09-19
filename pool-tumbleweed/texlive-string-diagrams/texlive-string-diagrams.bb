SUMMARY = "Create string diagrams with LaTeX and TikZ"
DESCRIPTION = "This LaTeX package has been designed for effortless and \
aesthetically pleasing creation of string diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn67363"

RPM_NAME = "texlive-string-diagrams-2026.226.0.0.2.1svn67363-64.2.noarch.rpm"
RPM_HASH = "45feb4d097e6fdfd295beec6db4c433eb2704cda7cf3c59f4f4a7a110972adf41beb2c04e25ccf9e93a917397fed5537af61d1a4eddb602e96aa627ffe240963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-string-diagrams.sty \
texlive-string-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
