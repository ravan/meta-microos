SUMMARY = "Create beautifully typeset sign charts"
DESCRIPTION = "The package allows users to easily typeset beautiful looking \
sign charts directly into their (La)TeX document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn39707"

RPM_NAME = "texlive-signchart-2026.226.1.01svn39707-60.2.noarch.rpm"
RPM_HASH = "4dbca65205f2fb77557860395abdc0e5c6c84b7cbdb50240f6ef10fdaf83471a40f0eb8a1aee272df6df28bd51159bb8ba666feda887e768658831311239770f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-signchart.sty \
texlive-signchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfplots.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
