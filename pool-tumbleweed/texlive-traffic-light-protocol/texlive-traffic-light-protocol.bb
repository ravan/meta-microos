SUMMARY = "Show TLP (Traffic Light Protocol) tags"
DESCRIPTION = "This LaTeX package provides a command \\tlp to display TLP \
(Traffic Light Protocol) labels. It currently relies on xcolor \
and LaTeX3."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-traffic-light-protocol-2026.226.0.0.2svn76924-59.2.noarch.rpm"
RPM_HASH = "4c5a0d88003461723228319c036825f4cabe9c49e5c53c7c24de53a66982849d4ca6c292e2e0bab1f2b2eaeeda9ca046afa1de6e72d41b07e83f5ddbf9b103e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-traffic-light-protocol.sty \
texlive-traffic-light-protocol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
